package coinbase.api.v2.bean;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinbaseCurrency {
    
    private String id;
    private String name;
    
    @JsonProperty("min_size")
    private BigDecimal minSize;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
	public BigDecimal getMinSize() {
		return minSize;
	}
	public void setMinSize(BigDecimal minSize) {
		this.minSize = minSize;
	}
    
}
