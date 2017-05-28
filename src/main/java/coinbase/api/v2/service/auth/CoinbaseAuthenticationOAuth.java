package coinbase.api.v2.service.auth;

import java.net.HttpURLConnection;

public class CoinbaseAuthenticationOAuth implements CoinbaseAuthenticationBearer {
    
    private String accessToken;
    
    public CoinbaseAuthenticationOAuth() {
	}
    
    public CoinbaseAuthenticationOAuth(String accessToken) {
    	this.accessToken = accessToken;
	}

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public void setConnectionHeaders(final HttpURLConnection con, String path, String body) {
        con.setRequestProperty("Authorization", "Bearer " + this.accessToken);
    }
    
}
