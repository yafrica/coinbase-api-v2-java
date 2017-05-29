package coinbase.api.v2.service;

import coinbase.api.v2.bean.CoinbaseAddress;
import coinbase.api.v2.bean.response.ListCoinbaseAddress;
import coinbase.api.v2.bean.response.ListCoinbaseTransaction;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.service.auth.CoinbaseAuthenticationBearer;
import coinbase.api.v2.service.auth.ICoinbaseTimestampProvider;

public class CoinbaseAddressService extends AbstractCoinbaseService {
	
	public CoinbaseAddressService(ICoinbaseTimestampProvider timeService) {
        super(timeService);
    }

    public ListCoinbaseAddress list(CoinbaseAuthenticationBearer auth, String accountId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/accounts/" + accountId + "/addresses", ListCoinbaseAddress.class, false);
    }
	
	public CoinbaseAddress show(CoinbaseAuthenticationBearer auth, String accountId, String addressId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/accounts/" + accountId + "/addresses/" + addressId, CoinbaseAddress.class);
    }
	
	public ListCoinbaseTransaction listTransactions(CoinbaseAuthenticationBearer auth, String accountId, String addressId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/accounts/" + accountId + "/addresses" + addressId + "/transactions", ListCoinbaseTransaction.class, false);
    }
	
	public CoinbaseAddress create(CoinbaseAuthenticationBearer auth, String accountId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.POST, "/accounts/" + accountId + "/addresses", CoinbaseAddress.class);
    }

}
