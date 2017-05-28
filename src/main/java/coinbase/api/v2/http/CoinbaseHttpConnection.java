package coinbase.api.v2.http;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.service.auth.CoinbaseAuthenticationBearer;

public class CoinbaseHttpConnection {

    private final static String COINBASE_V2_ENDPOINT = "https://api.coinbase.com/v2";

    public CoinbaseHttpResponse doQuery(CoinbaseAuthenticationBearer auth, CoinbaseHttpMethod method, String path, String payload) throws CoinbaseHttpException {
        HttpURLConnection con;
        try {
            con = this.getConnection(auth, COINBASE_V2_ENDPOINT + path, method.getCode(), payload);
            return this.getResponse(con);
        } catch (IOException e) {
            throw new CoinbaseHttpException(e);
        }
    }
    
    protected HttpURLConnection getConnection(CoinbaseAuthenticationBearer auth, String url, String method, String payload) throws CoinbaseHttpException {
        HttpURLConnection con;
        try {
            URL obj = new URL(url);
            con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod(method);
            con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
            if (auth != null) {
            	auth.setConnectionHeaders(con, obj.getPath(), payload);
            }
            con.setRequestProperty("Content-Type", "application/json");
            System.out.println("Connection : " + con);
            System.out.println("Payload : " + payload);
            this.writePayload(con, payload);
        } catch (IOException | CoinbaseHttpException e) {
            throw new CoinbaseHttpException("Unable to create connection", e);
        }
        
        return con;
    }
    
    protected CoinbaseHttpResponse getResponse(HttpURLConnection con) throws IOException {
        
        final CoinbaseHttpResponse result = new CoinbaseHttpResponse();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        
        result.setResponse(response.toString());
        result.setCode(con.getResponseCode());

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

}
