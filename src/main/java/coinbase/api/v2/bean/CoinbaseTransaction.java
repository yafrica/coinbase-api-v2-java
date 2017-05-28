package coinbase.api.v2.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinbaseTransaction extends AbstractCoinbaseTimedResource {
    
    private String type;
    private String status;
    private CoinbaseAmount amount;
    
    @JsonProperty("native_amount")
    private CoinbaseAmount nativeAmount;
    private String description;
    private CoinbaseNetwork network;
    private CoinbaseUser from;
    private CoinbaseUser to;
    @JsonProperty("instant_exchange")
    private Boolean instantExchange;
    private CoinbaseTransactionDetails details;
    private CoinbaseTransactionBuy buy;
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public CoinbaseAmount getAmount() {
        return amount;
    }
    public void setAmount(CoinbaseAmount amount) {
        this.amount = amount;
    }
    public CoinbaseAmount getNativeAmount() {
        return nativeAmount;
    }
    public void setNativeAmount(CoinbaseAmount nativeAmount) {
        this.nativeAmount = nativeAmount;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public CoinbaseNetwork getNetwork() {
        return network;
    }
    public void setNetwork(CoinbaseNetwork network) {
        this.network = network;
    }
    public CoinbaseUser getTo() {
        return to;
    }
    public void setTo(CoinbaseUser to) {
        this.to = to;
    }
    public CoinbaseUser getFrom() {
        return from;
    }
    public void setFrom(CoinbaseUser from) {
        this.from = from;
    }
    public Boolean getInstantExchange() {
        return instantExchange;
    }
    public void setInstantExchange(Boolean instantExchange) {
        this.instantExchange = instantExchange;
    }
    public CoinbaseTransactionDetails getDetails() {
        return details;
    }
    public void setDetails(CoinbaseTransactionDetails details) {
        this.details = details;
    }
    public CoinbaseTransactionBuy getBuy() {
        return buy;
    }
    public void setBuy(CoinbaseTransactionBuy buy) {
        this.buy = buy;
    }
    
}
