package coinbase.api.v2.bean.operation;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinbasePlaceSellOrder {
    
    private BigDecimal amount;
    private BigDecimal total;
    private String currency;
    
    @JsonProperty("payment_method")
    private String paymentMethod;
    
    @JsonProperty("agree_btc_amount_varies")
    private Boolean agreeBtcAmountVaries;
    
    private Boolean commit;
    private Boolean quote;
    
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
    public String getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	public Boolean getAgreeBtcAmountVaries() {
		return agreeBtcAmountVaries;
	}
	public void setAgreeBtcAmountVaries(Boolean agreeBtcAmountVaries) {
		this.agreeBtcAmountVaries = agreeBtcAmountVaries;
	}
	public Boolean getCommit() {
		return commit;
	}
	public void setCommit(Boolean commit) {
		this.commit = commit;
	}
	public Boolean getQuote() {
		return quote;
	}
	public void setQuote(Boolean quote) {
		this.quote = quote;
	}
    
}
