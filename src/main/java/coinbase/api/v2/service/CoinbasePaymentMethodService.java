package coinbase.api.v2.service;

import coinbase.api.v2.bean.CoinbasePaymentMethod;
import coinbase.api.v2.bean.response.ListCoinbasePaymentMethod;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.service.auth.CoinbaseAuthenticationBearer;
import coinbase.api.v2.service.auth.ICoinbaseTimestampProvider;

public class CoinbasePaymentMethodService extends AbstractCoinbaseService {

	public CoinbasePaymentMethodService(ICoinbaseTimestampProvider timestampProvider) {
		super(timestampProvider);
	}
	
	public ListCoinbasePaymentMethod list(CoinbaseAuthenticationBearer auth) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/payment-methods", ListCoinbasePaymentMethod.class, false);
    }
	
	public CoinbasePaymentMethod show(CoinbaseAuthenticationBearer auth, String paymentMethodId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/payment-methods/" + paymentMethodId, CoinbasePaymentMethod.class);
    }

}
