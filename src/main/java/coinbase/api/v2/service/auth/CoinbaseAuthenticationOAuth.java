package coinbase.api.v2.service.auth;

import java.net.HttpURLConnection;

public class CoinbaseAuthenticationOAuth implements CoinbaseAuthenticationBearer {
    
    private String accessToken;
    private String apiKey;
    
    public CoinbaseAuthenticationOAuth() {
	}
    
    public CoinbaseAuthenticationOAuth(String apiKey, String accessToken) {
        this.apiKey = apiKey;
    	this.accessToken = accessToken;
	}

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    
    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public void setConnectionHeaders(final HttpURLConnection con, String timestamp, String path, String body) {
        con.setRequestProperty("Authorization", "Bearer " + this.accessToken);
        con.setRequestProperty(CB_ACCESS_KEY, this.apiKey);
        con.setRequestProperty(CB_ACCESS_TIMESTAMP, timestamp);
    }
    
}
