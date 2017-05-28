package coinbase.api.v2.bean;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinbaseAuthInfo {
    
    private String method;
    private List<String> scopes;
    
    @JsonProperty("oauth_meta")
    private CoinbaseMetadata oauthMeta;
    
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public List<String> getScopes() {
        return scopes;
    }
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }
    public CoinbaseMetadata getOauthMeta() {
        return oauthMeta;
    }
    public void setOauthMeta(CoinbaseMetadata oauthMeta) {
        this.oauthMeta = oauthMeta;
    }
    
}
