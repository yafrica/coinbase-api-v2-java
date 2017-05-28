package coinbase.api.v2.service;

import coinbase.api.v2.bean.CoinbaseUser;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.service.auth.CoinbaseAuthenticationBearer;

public class CoinbaseAuthenticationService extends AbstractCoinbaseService {
    
    public CoinbaseUser getUser(CoinbaseAuthenticationBearer auth) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/user", CoinbaseUser.class);
    }

}
