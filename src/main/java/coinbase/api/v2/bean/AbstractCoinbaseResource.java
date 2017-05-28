package coinbase.api.v2.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class AbstractCoinbaseResource {
    
    protected String id;
    protected String resource;
    
    @JsonProperty("resource_path")
    protected String resourcePath;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getResource() {
        return resource;
    }
    public void setResource(String resource) {
        this.resource = resource;
    }
    public String getResourcePath() {
        return resourcePath;
    }
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }
    
}
