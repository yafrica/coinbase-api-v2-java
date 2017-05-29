package coinbase.api.v2.service.data;

import coinbase.api.v2.bean.CoinbaseAmount;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.service.AbstractCoinbaseService;

public class CoinbasePricesService extends AbstractCoinbaseService {
	
	public CoinbasePricesService() {
        super(null);
    }

    public CoinbaseAmount getBuyPrice(String currencyFrom, String currencyTo) throws CoinbaseHttpException {
        return doQuery(null, CoinbaseHttpMethod.GET, "/prices/" + currencyFrom + "-" + currencyTo + "/buy", CoinbaseAmount.class);
    }
	
	public CoinbaseAmount getSellPrice(String currencyFrom, String currencyTo) throws CoinbaseHttpException {
        return doQuery(null, CoinbaseHttpMethod.GET, "/prices/" + currencyFrom + "-" + currencyTo + "/sell", CoinbaseAmount.class);
    }
	
	public CoinbaseAmount getSpotPrice(String currencyFrom, String currencyTo) throws CoinbaseHttpException {
        return doQuery(null, CoinbaseHttpMethod.GET, "/prices/" + currencyFrom + "-" + currencyTo + "/spot", CoinbaseAmount.class);
    }

}
