package coinbase.api.v2.bean;

public class CoinbaseFee {
    
    private String type;
    private CoinbaseAmount amount;
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public CoinbaseAmount getAmount() {
        return amount;
    }
    public void setAmount(CoinbaseAmount amount) {
        this.amount = amount;
    }
    
}
