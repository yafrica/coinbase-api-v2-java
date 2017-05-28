package coinbase.api.v2.bean.operation;

import java.math.BigDecimal;

public class CoinbaseTransactionSend {

    private String type;
    private String to;
    private BigDecimal amount;
    private String currency;
    private String idem;
    
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
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
    public String getIdem() {
        return idem;
    }
    public void setIdem(String idem) {
        this.idem = idem;
    }
    
}
