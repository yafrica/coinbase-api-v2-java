package coinbase.api.v2.bean.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import coinbase.api.v2.bean.AbstractCoinbaseTimedResource;
import coinbase.api.v2.bean.CoinbaseAccount;
import coinbase.api.v2.bean.CoinbaseUser;

public class CoinbaseNotification extends AbstractCoinbaseTimedResource {
    
    private String type;
    private CoinbaseNotificationData data;
    private CoinbaseUser user;
    private CoinbaseAccount account;
    
    @JsonProperty("delivery_attempts")
    private Integer deliveryAttempts;
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public CoinbaseNotificationData getData() {
        return data;
    }
    public void setData(CoinbaseNotificationData data) {
        this.data = data;
    }
    public CoinbaseUser getUser() {
        return user;
    }
    public void setUser(CoinbaseUser user) {
        this.user = user;
    }
    public CoinbaseAccount getAccount() {
        return account;
    }
    public void setAccount(CoinbaseAccount account) {
        this.account = account;
    }
    public Integer getDeliveryAttempts() {
        return deliveryAttempts;
    }
    public void setDeliveryAttempts(Integer deliveryAttempts) {
        this.deliveryAttempts = deliveryAttempts;
    }
    
}
