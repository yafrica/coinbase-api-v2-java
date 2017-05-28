package coinbase.api.v2.service.auth;

import java.net.HttpURLConnection;

import coinbase.api.v2.exception.CoinbaseHttpException;

public interface CoinbaseAuthenticationBearer {
    
    void setConnectionHeaders(HttpURLConnection con, String path, String body) throws CoinbaseHttpException;

}
