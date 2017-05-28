package coinbase.api.v2.bean;

import java.math.BigDecimal;
import java.util.Map;

public class CoinbaseExchangeRates {
    
    private String currency;
    private Map<String, BigDecimal> rates;
    
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public Map<String, BigDecimal> getRates() {
        return rates;
    }
    public void setRates(Map<String, BigDecimal> rates) {
        this.rates = rates;
    }
    
}
