package coinbase.api.v2.bean;

public class CoinbaseAddress extends AbstractCoinbaseTimedResource {
    
    private String address;
    private String name;
    private String network;
    
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNetwork() {
        return network;
    }
    public void setNetwork(String network) {
        this.network = network;
    }
    
}
