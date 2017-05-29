package coinbase.api.v2.service;

import coinbase.api.v2.bean.CoinbaseUser;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.service.auth.CoinbaseAuthenticationBearer;
import coinbase.api.v2.service.auth.ICoinbaseTimestampProvider;

public class CoinbaseAuthenticationService extends AbstractCoinbaseService {
    
    public CoinbaseAuthenticationService(ICoinbaseTimestampProvider timeService) {
        super(timeService);
    }

    public CoinbaseUser getUser(CoinbaseAuthenticationBearer auth) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/user", CoinbaseUser.class);
    }

}
