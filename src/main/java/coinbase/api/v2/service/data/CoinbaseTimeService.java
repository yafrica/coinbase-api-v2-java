package coinbase.api.v2.service.data;

import coinbase.api.v2.bean.CoinbaseTime;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.service.AbstractCoinbaseService;
import coinbase.api.v2.service.auth.ICoinbaseTimestampProvider;

public class CoinbaseTimeService extends AbstractCoinbaseService implements ICoinbaseTimestampProvider {
    
    public CoinbaseTimeService() {
        super(null);
    }
	
	public CoinbaseTime getCurrentTime() throws CoinbaseHttpException {
        return doQuery(null, CoinbaseHttpMethod.GET, "/time", CoinbaseTime.class);
    }

    @Override
    public int getTimestamp() {
        try {
            CoinbaseTime time = this.getCurrentTime();
            return time.getEpoch().intValue();
        } catch (CoinbaseHttpException e) {
            throw new RuntimeException(e);
        }
    }

}
