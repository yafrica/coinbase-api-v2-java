package coinbase.api.v2.bean.operation;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinbaseSendMoney {
	
	private final String type = "send";
	private String to;
	private BigDecimal amount;
	private String currency;
	private String description;
	
	@JsonProperty("skip_notifications")
	private Boolean skipNotifications;
	private BigDecimal fee;
	private String idem;
	
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
	public Boolean getSkipNotifications() {
		return skipNotifications;
	}
	public void setSkipNotifications(Boolean skipNotifications) {
		this.skipNotifications = skipNotifications;
	}
	public BigDecimal getFee() {
		return fee;
	}
	public void setFee(BigDecimal fee) {
		this.fee = fee;
	}
	public String getIdem() {
		return idem;
	}
	public void setIdem(String idem) {
		this.idem = idem;
	}
	public String getType() {
		return type;
	}
	
}
