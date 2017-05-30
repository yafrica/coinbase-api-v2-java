package coinbase.api.v2.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinbaseSellResource extends AbstractCoinbaseTimedResource {
	
	private String status;
	
	@JsonProperty("payment_method")
	private String paymentMethod;
	private CoinbaseTransactionSell transaction;
	private CoinbaseAmount amount;
	private CoinbaseAmount total;
	private CoinbaseAmount subtotal;
	private CoinbaseAmount fee;
	private Boolean committed;
	private Boolean instant;
	@JsonProperty("payout_at")
	private Date payoutAt;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public CoinbaseTransactionSell getTransaction() {
		return transaction;
	}
	public void setTransaction(CoinbaseTransactionSell transaction) {
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
	public CoinbaseAmount getFee() {
		return fee;
	}
	public void setFee(CoinbaseAmount fee) {
		this.fee = fee;
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
	public Date getPayoutAt() {
		return payoutAt;
	}
	public void setPayoutAt(Date payoutAt) {
		this.payoutAt = payoutAt;
	}
	
}
