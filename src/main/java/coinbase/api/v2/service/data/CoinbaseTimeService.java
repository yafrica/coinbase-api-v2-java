package coinbase.api.v2.service.data;

import coinbase.api.v2.bean.CoinbaseTime;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.service.AbstractCoinbaseService;

public class CoinbaseTimeService extends AbstractCoinbaseService {
	
	public CoinbaseTime getCurrentTime() throws CoinbaseHttpException {
        return doQuery(null, CoinbaseHttpMethod.GET, "/time", CoinbaseTime.class);
    }

}
