package coinbase.api.v2.service.auth;

import java.net.HttpURLConnection;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.service.CoinbaseApiKey;

public class CoinbaseAuthenticationApiKey implements CoinbaseAuthenticationBearer {
    
    /**
     * The api key as a string
     */
    private final static String CB_ACCESS_KEY = "CB-ACCESS-KEY";
    
    /**
     * The user generated message signature
     */
    private final static String CB_ACCESS_SIGN = "CB-ACCESS-SIGN";
    
    /**
     * A timestamp for your request
     */
    private final static String CB_ACCESS_TIMESTAMP = "CB-ACCESS-TIMESTAMP";

    private String apiKey;
    
    public CoinbaseAuthenticationApiKey() {
    }
    
    public CoinbaseAuthenticationApiKey(String apiKey) {
    	this.apiKey = apiKey;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void setConnectionHeaders(HttpURLConnection con, String path, String body) throws CoinbaseHttpException {
        CoinbaseApiKey cbApi;
        try {
            cbApi = CoinbaseApiKey.build(apiKey, con.getRequestMethod(), path, body);
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            throw new CoinbaseHttpException("Could not generate API Key", e);
        }
        con.setRequestProperty(CB_ACCESS_KEY, this.apiKey);
        con.setRequestProperty(CB_ACCESS_TIMESTAMP, cbApi.getAccessTimestamp());
        con.setRequestProperty(CB_ACCESS_SIGN, cbApi.getAccessSign());
    }
    
}
