package coinbase.api.v2.service.data;

import coinbase.api.v2.bean.CoinbaseExchangeRates;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.service.AbstractCoinbaseService;

public class CoinbaseExchangeRatesService extends AbstractCoinbaseService {
	
	public CoinbaseExchangeRatesService() {
        super(null);
    }

    public CoinbaseExchangeRates getExchangeRates(String currency) throws CoinbaseHttpException {
        return doQuery(null, CoinbaseHttpMethod.GET, "/exchange-rates?currency=" + currency, CoinbaseExchangeRates.class);
    }

}
