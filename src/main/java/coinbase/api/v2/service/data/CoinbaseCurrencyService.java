package coinbase.api.v2.service.data;

import coinbase.api.v2.bean.response.ListCoinbaseCurrency;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.service.AbstractCoinbaseService;

public class CoinbaseCurrencyService extends AbstractCoinbaseService {
	
	public CoinbaseCurrencyService() {
        super(null);
    }

    public ListCoinbaseCurrency getCurrencies() throws CoinbaseHttpException {
        return doQuery(null, CoinbaseHttpMethod.GET, "/currencies", ListCoinbaseCurrency.class, null, false);
    }

}
