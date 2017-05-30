package coinbase.api.v2.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinbasePaymentMethod extends AbstractCoinbaseTimedResource {
	
	private String type;
	private String name;
	private String currency;
	
	@JsonProperty("primary_buy")
	private Boolean primaryBuy;
	
	@JsonProperty("primary_sell")
	private Boolean primarySell;
	
	@JsonProperty("allow_buy")
	private Boolean allowBuy;
	
	@JsonProperty("allow_sell")
	private Boolean allowSell;
	
	@JsonProperty("allow_deposit")
	private Boolean allowDeposit;
	
	@JsonProperty("allow_withdraw")
	private Boolean allowWithdraw;
	
	@JsonProperty("instant_but")
	private Boolean instantBuy;
	
	@JsonProperty("instant_sell")
	private Boolean instantSell;
	
	private CoinbasePaymentMethodLimitWrapper limits;
	
	@JsonProperty("fiat_account")
	private CoinbaseAccount fiatAccount;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Boolean getPrimaryBuy() {
		return primaryBuy;
	}

	public void setPrimaryBuy(Boolean primaryBuy) {
		this.primaryBuy = primaryBuy;
	}

	public Boolean getPrimarySell() {
		return primarySell;
	}

	public void setPrimarySell(Boolean primarySell) {
		this.primarySell = primarySell;
	}

	public Boolean getAllowBuy() {
		return allowBuy;
	}

	public void setAllowBuy(Boolean allowBuy) {
		this.allowBuy = allowBuy;
	}

	public Boolean getAllowSell() {
		return allowSell;
	}

	public void setAllowSell(Boolean allowSell) {
		this.allowSell = allowSell;
	}

	public Boolean getAllowDeposit() {
		return allowDeposit;
	}

	public void setAllowDeposit(Boolean allowDeposit) {
		this.allowDeposit = allowDeposit;
	}

	public Boolean getAllowWithdraw() {
		return allowWithdraw;
	}

	public void setAllowWithdraw(Boolean allowWithdraw) {
		this.allowWithdraw = allowWithdraw;
	}

	public Boolean getInstantBuy() {
		return instantBuy;
	}

	public void setInstantBuy(Boolean instantBuy) {
		this.instantBuy = instantBuy;
	}

	public Boolean getInstantSell() {
		return instantSell;
	}

	public void setInstantSell(Boolean instantSell) {
		this.instantSell = instantSell;
	}

	public CoinbasePaymentMethodLimitWrapper getLimits() {
		return limits;
	}

	public void setLimits(CoinbasePaymentMethodLimitWrapper limits) {
		this.limits = limits;
	}

	public CoinbaseAccount getFiatAccount() {
		return fiatAccount;
	}

	public void setFiatAccount(CoinbaseAccount fiatAccount) {
		this.fiatAccount = fiatAccount;
	}
	
}
