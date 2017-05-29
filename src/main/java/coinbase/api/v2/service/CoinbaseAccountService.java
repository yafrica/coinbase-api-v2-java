package coinbase.api.v2.service;

import coinbase.api.v2.bean.CoinbaseAccount;
import coinbase.api.v2.bean.operation.CoinbaseCreateUpdateAccount;
import coinbase.api.v2.bean.response.ListCoinbaseAccount;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.service.auth.CoinbaseAuthenticationBearer;
import coinbase.api.v2.service.auth.ICoinbaseTimestampProvider;

public class CoinbaseAccountService extends AbstractCoinbaseService {
	
	public CoinbaseAccountService(ICoinbaseTimestampProvider timeService) {
        super(timeService);
    }

    public ListCoinbaseAccount list(CoinbaseAuthenticationBearer auth) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/accounts", ListCoinbaseAccount.class, false);
    }
	
	public CoinbaseAccount show(CoinbaseAuthenticationBearer auth, String accountId) throws CoinbaseHttpException {
        return doQuery(auth, CoinbaseHttpMethod.GET, "/accounts/" + accountId, CoinbaseAccount.class);
    }
	
	public CoinbaseAccount createAccount(CoinbaseAuthenticationBearer auth, CoinbaseCreateUpdateAccount account) throws CoinbaseHttpException {
		return doQuery(auth, CoinbaseHttpMethod.POST, "/accounts", CoinbaseAccount.class, account);
	}
	
	public CoinbaseAccount setAsPrimary(CoinbaseAuthenticationBearer auth, String accountId) throws CoinbaseHttpException {
		return doQuery(auth, CoinbaseHttpMethod.POST, "/accounts/" + accountId + "/primary", CoinbaseAccount.class);
	}
	
	public CoinbaseAccount updateAccount(CoinbaseAuthenticationBearer auth, String accountId, CoinbaseCreateUpdateAccount account) throws CoinbaseHttpException {
		return doQuery(auth, CoinbaseHttpMethod.PUT, "/accounts/" + accountId, CoinbaseAccount.class, account);
	}
	
	public void deleteAccount(CoinbaseAuthenticationBearer auth, String accountId) throws CoinbaseHttpException {
		doQuery(auth, CoinbaseHttpMethod.DELETE, "/accounts/" + accountId);
	}

}
