package coinbase.api.v2.bean.operation;

import java.math.BigDecimal;

public class CoinbaseTransferMoney {
    
    private final String type = "transfer";
    private String to;
    private BigDecimal amount;
    private String currency;
    private String description;
    
    public String getType() {
        return type;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
}
