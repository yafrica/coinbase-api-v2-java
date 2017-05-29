package coinbase.api.v2.service;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;

import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.http.CoinbaseHttpConnection;
import coinbase.api.v2.http.CoinbaseHttpMethod;
import coinbase.api.v2.http.CoinbaseHttpResponse;
import coinbase.api.v2.service.auth.CoinbaseAuthenticationBearer;
import coinbase.api.v2.service.auth.ICoinbaseTimestampProvider;
import coinbase.api.v2.utils.CoinbaseJsonObjectMapper;

public abstract class AbstractCoinbaseService {

    private CoinbaseJsonObjectMapper mapper = new CoinbaseJsonObjectMapper();
    private ICoinbaseTimestampProvider timestampProvider;
    
    public AbstractCoinbaseService(ICoinbaseTimestampProvider timestampProvider) {
        this.timestampProvider = timestampProvider;
    }
    
    /**
     * Do call to Coinbase API
     */
    protected <T> T doQuery(CoinbaseAuthenticationBearer auth, CoinbaseHttpMethod method, String path, Class<T> classz, Object payload, boolean searchData) throws CoinbaseHttpException {
        Integer timestamp = null;
        if (this.timestampProvider != null) {
            timestamp = Integer.valueOf(timestampProvider.getTimestamp());
        }
        CoinbaseHttpConnection connection = new CoinbaseHttpConnection();
        CoinbaseHttpResponse response = connection.doQuery(auth, timestamp, method, path, this.getPayload(payload));
        this.manageException(response);
        return this.getResponseObject(response.getResponse(), searchData, classz);
    }
    
    /**
     * Do call to Coinbase API
     */
    protected <T> T doQuery(CoinbaseAuthenticationBearer auth, CoinbaseHttpMethod method, String path, Class<T> classz) throws CoinbaseHttpException {
        return doQuery(auth, method, path, classz, null, true);
    }
    
    /**
     * Do call to Coinbase API
     */
    protected <T> T doQuery(CoinbaseAuthenticationBearer auth, CoinbaseHttpMethod method, String path, Class<T> classz, Object payload) throws CoinbaseHttpException {
        return doQuery(auth, method, path, classz, payload, true);
    }
    
    /**
     * Do call to Coinbase API
     */
    protected void doQuery(CoinbaseAuthenticationBearer auth, CoinbaseHttpMethod method, String path) throws CoinbaseHttpException {
        doQuery(auth, method, path, null, null, true);
    }
    
    
    // ----------------------------------------------------------
    //                         HELPERS
    // ----------------------------------------------------------
    
    protected void manageException(CoinbaseHttpResponse response) throws CoinbaseHttpException {
    	if (response.isError()) {
    		String message = String.format("Coinbase API returned an error : %s", response.toString());
    		throw new CoinbaseHttpException(message);
    	}
    }
    
    protected <T> T getResponseObject(final String response, final boolean searchData, final Class<T> classz) throws CoinbaseHttpException {
    	if (null == response || classz == null) {
    		return null;
    	}
        try {
            if (searchData) {
                return mapper.dataFromString(response, classz);
            }
            return mapper.fromString(response, classz);
        } catch (IOException e) {
            throw new CoinbaseHttpException("Unexpected JSON object : " + response, e);
        }
    }
    
    protected String getPayload(Object payload) throws CoinbaseHttpException {
    	if (payload != null) {
    		try {
				return mapper.toJsonString(payload);
			} catch (JsonProcessingException e) {
				throw new CoinbaseHttpException("Unable to transform JSON object to String", e);
			}
    	}
    	return null;
    }
    
}
