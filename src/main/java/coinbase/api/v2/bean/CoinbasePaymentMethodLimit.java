package coinbase.api.v2.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinbasePaymentMethodLimit {
	
	@JsonProperty("period_in_days")
	private Integer periodInDays;
	private CoinbaseAmount total;
	private CoinbaseAmount remaining;
	
	public Integer getPeriodInDays() {
		return periodInDays;
	}
	public void setPeriodInDays(Integer periodInDays) {
		this.periodInDays = periodInDays;
	}
	public CoinbaseAmount getTotal() {
		return total;
	}
	public void setTotal(CoinbaseAmount total) {
		this.total = total;
	}
	public CoinbaseAmount getRemaining() {
		return remaining;
	}
	public void setRemaining(CoinbaseAmount remaining) {
		this.remaining = remaining;
	}
	
}
