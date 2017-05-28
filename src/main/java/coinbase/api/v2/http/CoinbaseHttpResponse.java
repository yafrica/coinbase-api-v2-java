package coinbase.api.v2.http;

public class CoinbaseHttpResponse {

    private String response;
    private CoinbaseHttpResponseCode code;
    
    public String getResponse() {
        return response;
    }
    public void setResponse(String response) {
        this.response = response;
    }
    public CoinbaseHttpResponseCode getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = CoinbaseHttpResponseCode.getByCode(code);
    }
    public boolean isError() {
    	return !(this.code.getCode() >= 200 && this.code.getCode() < 300);
    }
    
    @Override
    public String toString() {
    	return code.getCode() + " - " + code.getStatus() + " : " + response;
    }
}
