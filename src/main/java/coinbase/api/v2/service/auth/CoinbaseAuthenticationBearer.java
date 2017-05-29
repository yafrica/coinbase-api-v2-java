package coinbase.api.v2.service.auth;

import java.net.HttpURLConnection;

import coinbase.api.v2.exception.CoinbaseHttpException;

public interface CoinbaseAuthenticationBearer {
    
    /**
     * The api key as a string
     */
    String CB_ACCESS_KEY = "CB-ACCESS-KEY";
    
    /**
     * The user generated message signature
     */
    String CB_ACCESS_SIGN = "CB-ACCESS-SIGN";
    
    /**
     * A timestamp for your request
     */
    String CB_ACCESS_TIMESTAMP = "CB-ACCESS-TIMESTAMP";
    
    void setConnectionHeaders(HttpURLConnection con, String timestamp, String path, String body) throws CoinbaseHttpException;

}
