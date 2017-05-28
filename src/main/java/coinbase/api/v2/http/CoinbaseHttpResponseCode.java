package coinbase.api.v2.http;

public enum CoinbaseHttpResponseCode {
    
    OK                  (200, "OK Successful request"),
    CREATED             (201, "Created New object saved"),
    NO_CONTENT          (204, "No content Object deleted"),
    BAD_REQUEST         (400, "Bad Request Returns JSON with the error message"),
    UNAUTHORIZED        (401, "Unauthorized Couldn’t authenticate your request"),
    TOKEN_REQUIRED      (402, "2FA Token required Re-try request with user’s 2FA token as CB-2FA-Token header"),
    INVALID_USER_SCOPE  (403, "Invalid scope User hasn’t authorized necessary scope"),
    NOT_FOUND           (404, "Not Found No such object"),
    TWO_MANY_REQUESTS   (429, "Too Many Requests Your connection is being rate limited"),
    INTERNAL_SERVER_ERR (500, "Internal Server Error Something went wrong"),
    SERVICE_UNAVAILABLE (503, "Service Unavailable Your connection is being throttled or the service is down for maintenance")
    ;
    
    private int code;
    private String status;
    
    private CoinbaseHttpResponseCode(int code, String status) {
        this.code = code;
        this.status = status;
    }
    
    public int getCode() {
        return code;
    }
    
    public String getStatus() {
        return status;
    }
    
    public static CoinbaseHttpResponseCode getByCode(int code) {
        CoinbaseHttpResponseCode[] values = CoinbaseHttpResponseCode.values();
        for (CoinbaseHttpResponseCode value : values) {
            if (value.code == code) {
                return value;
            }
        }
        return null;
    }

}
