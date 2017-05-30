package coinbase.api.v2.service;

import coinbase.api.v2.bean.CoinbaseAuthInfo;
import coinbase.api.v2.bean.CoinbaseUser;
import coinbase.api.v2.bean.operation.CoinbaseUpdateUser;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.service.auth.CoinbaseAuthenticationBearer;
import coinbase.api.v2.service.auth.ICoinbaseTimestampProvider;

public class CoinbaseUserService extends AbstractCoinbaseService {
    
    public CoinbaseUserService(ICoinbaseTimestampProvider timeService) {
        super(timeService);
    }

    public CoinbaseUser showCurrent(CoinbaseAuthenticationBearer auth) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/user", CoinbaseUser.class);
    }
    
    public CoinbaseAuthInfo showAuthorizationInformation(CoinbaseAuthenticationBearer auth) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/user/auth", CoinbaseAuthInfo.class);
    }
    
    public CoinbaseUser show(CoinbaseAuthenticationBearer auth, String userId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/users/" + userId, CoinbaseUser.class);
    }
    
    public CoinbaseUser updateCurrentUser(CoinbaseAuthenticationBearer auth, CoinbaseUpdateUser userInfo) throws CoinbaseHttpException {
    	return doQuery(auth, CoinbaseHttpMethod.PUT, "/user", CoinbaseUser.class, userInfo);
    }
    

}
