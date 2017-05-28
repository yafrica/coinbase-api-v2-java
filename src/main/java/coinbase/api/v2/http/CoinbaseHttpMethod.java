package coinbase.api.v2.http;

public enum CoinbaseHttpMethod {
    
    GET     ("GET", "Read resources"),
    POST    ("POST", "Create new resources"),
    PUT     ("PUT", "Modify existing resources"),
    DELETE  ("DELETE", "Remove resources")
    ;
    
    private String code;
    private String status;
    
    private CoinbaseHttpMethod(String code, String status) {
        this.code = code;
        this.status = status;
    }
    
    public String getCode() {
        return code;
    }
    
    public String getStatus() {
        return status;
    }
    
    public static CoinbaseHttpMethod getByCode(String code) {
        CoinbaseHttpMethod[] values = CoinbaseHttpMethod.values();
        for (CoinbaseHttpMethod value : values) {
            if (value.code.equalsIgnoreCase(code)) {
                return value;
            }
        }
        return null;
    }

}
