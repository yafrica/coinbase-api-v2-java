package coinbase.api.v2.bean;

import java.util.Date;

public class CoinbaseTime {
    
    private Date iso;
    private Integer epoch;
    
    public Date getIso() {
        return iso;
    }
    public void setIso(Date iso) {
        this.iso = iso;
    }
    public Integer getEpoch() {
        return epoch;
    }
    public void setEpoch(Integer epoch) {
        this.epoch = epoch;
    }
    
}
