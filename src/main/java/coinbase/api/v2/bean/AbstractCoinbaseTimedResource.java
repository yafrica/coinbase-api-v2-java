package coinbase.api.v2.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class AbstractCoinbaseTimedResource extends AbstractCoinbaseResource {
	
	@JsonProperty("created_at")
    protected Date createdAt;
    
    @JsonProperty("updated_at")
    protected Date updatedAt;
    
    public Date getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
    public Date getUpdatedAt() {
        return updatedAt;
    }
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
