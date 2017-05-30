package coinbase.api.v2.service;

import coinbase.api.v2.bean.CoinbaseSellResource;
import coinbase.api.v2.bean.operation.CoinbasePlaceSellOrder;
import coinbase.api.v2.bean.response.ListCoinbaseSellResource;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.service.auth.CoinbaseAuthenticationBearer;
import coinbase.api.v2.service.auth.ICoinbaseTimestampProvider;

public class CoinbaseSellService extends AbstractCoinbaseService {

	public CoinbaseSellService(ICoinbaseTimestampProvider timestampProvider) {
		super(timestampProvider);
	}
	
	public ListCoinbaseSellResource list(CoinbaseAuthenticationBearer auth, String accountId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/accounts/" + accountId + "/sells", ListCoinbaseSellResource.class, false);
    }
	
	public CoinbaseSellResource show(CoinbaseAuthenticationBearer auth, String accountId, String sellId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/accounts/" + accountId + "/sells/" + sellId, CoinbaseSellResource.class);
    }
	
	public CoinbaseSellResource placeSellOrder(CoinbaseAuthenticationBearer auth, String accountId, CoinbasePlaceSellOrder sell) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.POST, "/accounts/" + accountId + "/sells", CoinbaseSellResource.class, sell);
    }
	
	public CoinbaseSellResource commitSell(CoinbaseAuthenticationBearer auth, String accountId, String sellId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.POST, "/accounts/" + accountId + "/sells/" + sellId + "/commit", CoinbaseSellResource.class);
    }

}
