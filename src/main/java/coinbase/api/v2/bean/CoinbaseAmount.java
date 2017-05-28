package coinbase.api.v2.bean;

import java.math.BigDecimal;

public class CoinbaseAmount {
    
    private BigDecimal amount;
    private String currency;
    
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    
}
