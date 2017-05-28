package coinbase.api.v2.bean.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinbasePagination {
    
	@JsonProperty("ending_before")
    private Integer endingBefore;
	
	@JsonProperty("starting_before")
    private Integer startingAfter;
    private Integer limit;
    private String order;
    
    @JsonProperty("previous_uri")
    private String previousUri;
    
    @JsonProperty("next_uri")
    private String nextUri;
    
    public Integer getEndingBefore() {
        return endingBefore;
    }
    public void setEndingBefore(Integer endingBefore) {
        this.endingBefore = endingBefore;
    }
    public Integer getStartingAfter() {
        return startingAfter;
    }
    public void setStartingAfter(Integer startingAfter) {
        this.startingAfter = startingAfter;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    public String getOrder() {
        return order;
    }
    public void setOrder(String order) {
        this.order = order;
    }
    public String getPreviousUri() {
        return previousUri;
    }
    public void setPreviousUri(String previousUri) {
        this.previousUri = previousUri;
    }
    public String getNextUri() {
        return nextUri;
    }
    public void setNextUri(String nextUri) {
        this.nextUri = nextUri;
    }
    
}
