package coinbase.api.v2.http;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.service.auth.CoinbaseAuthenticationBearer;

public class CoinbaseHttpConnection {

    private final static String COINBASE_V2_ENDPOINT = "https://api.coinbase.com/v2/";
    public final static String COINBASE_API_VERSION = "2017-05-24";
    
    public CoinbaseHttpResponse doQuery(CoinbaseAuthenticationBearer auth, Integer timestamp, CoinbaseHttpMethod method, String path, String payload) throws CoinbaseHttpException {
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        HttpURLConnection con;
        con = this.getConnection(auth, timestamp, COINBASE_V2_ENDPOINT + path, method.getCode(), payload);
        System.out.println("Connection : " + con);
        CoinbaseHttpResponse response = this.getResponse(con);
        System.out.println(response.getResponse());
        return response;
    }

    protected HttpURLConnection getConnection(CoinbaseAuthenticationBearer auth, Integer timestamp, String url, String method, String payload) throws CoinbaseHttpException {
        HttpURLConnection con;
        try {
            URL obj = new URL(url);
            con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod(method);
            con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
            if (auth != null) {
                auth.setConnectionHeaders(con, timestamp.toString(), obj.getPath(), payload);
            }
            con.setRequestProperty("Content-Type", "application/json");
            con.setRequestProperty("CB-VERSION", COINBASE_API_VERSION);
            this.writePayload(con, payload);
        } catch (IOException e) {
            throw new CoinbaseHttpException("Unable to create connection", e);
        }

        return con;
    }

    protected CoinbaseHttpResponse getResponse(HttpURLConnection con) throws CoinbaseHttpException {

        final CoinbaseHttpResponse result = new CoinbaseHttpResponse();
        try {
            result.setCode(con.getResponseCode());
            result.setResponse(this.fetchResponseFromConnection(con));
        } catch (IOException e) {
            throw new CoinbaseHttpException(e);
        }

        return result;
    }

    protected void writePayload(HttpURLConnection con, String payload) throws IOException {
        if (payload != null) {
            con.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(con.getOutputStream());
            wr.writeBytes(payload);
            wr.flush();
            wr.close();
        }
    }
    
    protected String fetchResponseFromConnection(HttpURLConnection con) throws IOException {
        final InputStream is = con.getErrorStream() != null ? con.getErrorStream() : con.getInputStream();
        final BufferedReader in = new BufferedReader(new InputStreamReader(is));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }

}
