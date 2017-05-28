package coinbase.api.v2.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinbaseAccount extends AbstractCoinbaseTimedResource {
    
    private String name;
    private Boolean primary;
    private String type;
    private String currency;
    private CoinbaseAmount balance;
    
    @JsonProperty("native_balance")
    private CoinbaseAmount nativeBalance;
    
    private Boolean ready;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Boolean getPrimary() {
        return primary;
    }
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public CoinbaseAmount getBalance() {
        return balance;
    }
    public void setBalance(CoinbaseAmount balance) {
        this.balance = balance;
    }
    public CoinbaseAmount getNativeBalance() {
        return nativeBalance;
    }
    public void setNativeBalance(CoinbaseAmount nativeBalance) {
        this.nativeBalance = nativeBalance;
    }
    public Boolean getReady() {
        return ready;
    }
    public void setReady(Boolean ready) {
        this.ready = ready;
    }
    
}
