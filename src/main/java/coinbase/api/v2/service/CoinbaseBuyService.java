package coinbase.api.v2.service;

import coinbase.api.v2.bean.CoinbaseBuyResource;
import coinbase.api.v2.bean.operation.CoinbasePlaceBuyOrder;
import coinbase.api.v2.bean.response.ListCoinbaseBuyResource;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.service.auth.CoinbaseAuthenticationBearer;
import coinbase.api.v2.service.auth.ICoinbaseTimestampProvider;

public class CoinbaseBuyService extends AbstractCoinbaseService {
	
	public CoinbaseBuyService(ICoinbaseTimestampProvider timeService) {
        super(timeService);
    }

    public ListCoinbaseBuyResource list(CoinbaseAuthenticationBearer auth, String accountId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/accounts/" + accountId + "/buys", ListCoinbaseBuyResource.class, false);
    }
	
	public CoinbaseBuyResource show(CoinbaseAuthenticationBearer auth, String accountId, String buyId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/accounts/" + accountId + "/buys/" + buyId, CoinbaseBuyResource.class);
    }
	
	public CoinbaseBuyResource placeBuyOrder(CoinbaseAuthenticationBearer auth, String accountId, CoinbasePlaceBuyOrder buy) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.POST, "/accounts/" + accountId + "/buys", CoinbaseBuyResource.class, buy);
    }
	
	public CoinbaseBuyResource commitBuy(CoinbaseAuthenticationBearer auth, String accountId, String buyId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.POST, "/accounts/" + accountId + "/buys/" + buyId + "/commit", CoinbaseBuyResource.class);
    }

}
