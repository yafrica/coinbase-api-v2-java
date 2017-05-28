package coinbase.api.v2.bean.response;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import coinbase.api.v2.bean.AbstractCoinbaseTimedResource;
import coinbase.api.v2.bean.CoinbaseAmount;
import coinbase.api.v2.bean.CoinbaseFee;
import coinbase.api.v2.bean.CoinbasePaymentMethod;
import coinbase.api.v2.bean.CoinbaseTransaction;

public class CoinbaseNotificationData extends AbstractCoinbaseTimedResource {
    
    private String status;
    
    @JsonProperty("payment_method")
    private CoinbasePaymentMethod paymentMethod;
    private CoinbaseTransaction transaction;
    private CoinbaseAmount amount;
    private CoinbaseAmount total;
    private CoinbaseAmount subtotal;
    private Boolean committed;
    private Boolean instant;
    private List<CoinbaseFee> fees;
    
    @JsonProperty("payout_at")
    private Date payoutAt;
    
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public CoinbasePaymentMethod getPaymentMethod() {
        return paymentMethod;
    }
    public void setPaymentMethod(CoinbasePaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public CoinbaseTransaction getTransaction() {
        return transaction;
    }
    public void setTransaction(CoinbaseTransaction transaction) {
        this.transaction = transaction;
    }
    public CoinbaseAmount getAmount() {
        return amount;
    }
    public void setAmount(CoinbaseAmount amount) {
        this.amount = amount;
    }
    public CoinbaseAmount getTotal() {
        return total;
    }
    public void setTotal(CoinbaseAmount total) {
        this.total = total;
    }
    public CoinbaseAmount getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(CoinbaseAmount subtotal) {
        this.subtotal = subtotal;
    }
    public Boolean getCommitted() {
        return committed;
    }
    public void setCommitted(Boolean committed) {
        this.committed = committed;
    }
    public Boolean getInstant() {
        return instant;
    }
    public void setInstant(Boolean instant) {
        this.instant = instant;
    }
    public List<CoinbaseFee> getFees() {
        return fees;
    }
    public void setFees(List<CoinbaseFee> fees) {
        this.fees = fees;
    }
	public Date getPayoutAt() {
		return payoutAt;
	}
	public void setPayoutAt(Date payoutAt) {
		this.payoutAt = payoutAt;
	}
    
}
