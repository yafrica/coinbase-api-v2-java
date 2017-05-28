package coinbase.api.v2.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinbaseBuyResource extends AbstractCoinbaseTimedResource {
	
	private String status;
	
	@JsonProperty("payment_method")
	private CoinbasePaymentMethod paymentMethod;
	private CoinbaseTransactionBuy transaction;
	private CoinbaseAmount amount;
	private CoinbaseAmount total;
	private CoinbaseAmount subtotal;
	private Boolean commited;
	private Boolean instant;
	private CoinbaseAmount fee;
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
	public CoinbaseTransactionBuy getTransaction() {
		return transaction;
	}
	public void setTransaction(CoinbaseTransactionBuy transaction) {
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
	public Boolean getCommited() {
		return commited;
	}
	public void setCommited(Boolean commited) {
		this.commited = commited;
	}
	public Boolean getInstant() {
		return instant;
	}
	public void setInstant(Boolean instant) {
		this.instant = instant;
	}
	public CoinbaseAmount getFee() {
		return fee;
	}
	public void setFee(CoinbaseAmount fee) {
		this.fee = fee;
	}
	public Date getPayoutAt() {
		return payoutAt;
	}
	public void setPayoutAt(Date payoutAt) {
		this.payoutAt = payoutAt;
	}
	
}
