package coinbase.api.v2.bean;

public class CoinbasePaymentMethodLimitWrapper {
	
	private CoinbasePaymentMethodLimit buy;
	private CoinbasePaymentMethodLimit instant_buy;
	private CoinbasePaymentMethodLimit sell;
	private CoinbasePaymentMethodLimit deposit;
	
	public CoinbasePaymentMethodLimit getBuy() {
		return buy;
	}
	public void setBuy(CoinbasePaymentMethodLimit buy) {
		this.buy = buy;
	}
	public CoinbasePaymentMethodLimit getInstant_buy() {
		return instant_buy;
	}
	public void setInstant_buy(CoinbasePaymentMethodLimit instant_buy) {
		this.instant_buy = instant_buy;
	}
	public CoinbasePaymentMethodLimit getSell() {
		return sell;
	}
	public void setSell(CoinbasePaymentMethodLimit sell) {
		this.sell = sell;
	}
	public CoinbasePaymentMethodLimit getDeposit() {
		return deposit;
	}
	public void setDeposit(CoinbasePaymentMethodLimit deposit) {
		this.deposit = deposit;
	}
	
}
