package coinbase.api.v2.service;

import coinbase.api.v2.bean.response.CoinbaseNotification;
import coinbase.api.v2.bean.response.ListCoinbaseNotification;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.service.auth.CoinbaseAuthenticationBearer;
import coinbase.api.v2.service.auth.ICoinbaseTimestampProvider;

public class CoinbaseNotificationService extends AbstractCoinbaseService {
    
    public CoinbaseNotificationService(ICoinbaseTimestampProvider timeService) {
        super(timeService);
    }

    public ListCoinbaseNotification list(CoinbaseAuthenticationBearer auth) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/notifications", ListCoinbaseNotification.class, false);
    }
    
    public CoinbaseNotification show(CoinbaseAuthenticationBearer auth, String notificationId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/notifications/" + notificationId, CoinbaseNotification.class);
    }

}
