package coinbase.api.v2.bean.operation;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinbaseUpdateUser {
	
	/**
	 * name 	string 	Optional 	User’s public name
	 */
	private String name;
	
	/**
	 * time_zone 	string 	Optional 	Time zone
	 */
	@JsonProperty("time_zone")
	private String timeZone;
	
	/**
	 * native_currency 	string 	Optional 	Local currency used to display amounts converted from BTC
	 */
	@JsonProperty("native_currency")
	private String nativeCurrency;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public String getNativeCurrency() {
		return nativeCurrency;
	}

	public void setNativeCurrency(String nativeCurrency) {
		this.nativeCurrency = nativeCurrency;
	}

}
