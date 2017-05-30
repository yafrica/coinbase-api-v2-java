package coinbase.api.v2.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinbaseUser extends AbstractCoinbaseTimedResource {
    
    private String name;
    private String username;
    
    @JsonProperty("profile_location")
    private String profileLocation;
    
    @JsonProperty("profile_bio")
    private String profileBio;
    
    @JsonProperty("profile_url")
    private String profileUrl;
    
    @JsonProperty("avatar_url")
    private String avatarUrl;
    
    private String email;
    
    @JsonProperty("time_zone")
    private String timeZone;
    
    @JsonProperty("native_currency")
    private String nativeCurrency;
    
    @JsonProperty("bitcoin_unit")
    private String bitcoinUnit;
    
    private String state;
    
    private CoinbaseCountry country;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getProfileLocation() {
        return profileLocation;
    }
    public void setProfileLocation(String profileLocation) {
        this.profileLocation = profileLocation;
    }
    public String getProfileBio() {
        return profileBio;
    }
    public void setProfileBio(String profileBio) {
        this.profileBio = profileBio;
    }
    public String getProfileUrl() {
        return profileUrl;
    }
    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }
    public String getAvatarUrl() {
        return avatarUrl;
    }
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
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
	public String getBitcoinUnit() {
		return bitcoinUnit;
	}
	public void setBitcoinUnit(String bitcoinUnit) {
		this.bitcoinUnit = bitcoinUnit;
	}
	public CoinbaseCountry getCountry() {
		return country;
	}
	public void setCountry(CoinbaseCountry country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
    
}
