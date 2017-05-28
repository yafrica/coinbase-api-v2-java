package coinbase.api.v2.bean;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CoinbaseCheckout extends AbstractCoinbaseTimedResource {
    
    private String code;
    private String type;
    private String name;
    private String description;
    private CoinbaseAmount amount;
    
    @JsonProperty("receipt_url")
    private String receiptUrl;
    private String status;
    
    @JsonProperty("bitcoin_amount")
    private CoinbaseAmount bitcoinAmount;
    
    @JsonProperty("bitcoin_address")
    private String bitcoinAddress;
    
    @JsonProperty("refund_address")
    private String refundAddress;
    
    @JsonProperty("bitcoin_uri")
    private String bitcoinUri;
    
    @JsonProperty("paid_at")
    private Date paidAt;
    
    @JsonProperty("mispaid_at")
    private Date mispaidAt;
    
    @JsonProperty("expired_at")
    private Date expiredAt;
    
    private CoinbaseTransaction transaction;
    private String[] mispayments;
    private String[] refunds;
    
    @JsonProperty("manual_refund_transactions")
    private CoinbaseTransaction[] manualRefundTransactions;
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public CoinbaseAmount getAmount() {
        return amount;
    }
    public void setAmount(CoinbaseAmount amount) {
        this.amount = amount;
    }
    public String getReceiptUrl() {
        return receiptUrl;
    }
    public void setReceiptUrl(String receiptUrl) {
        this.receiptUrl = receiptUrl;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public CoinbaseAmount getBitcoinAmount() {
        return bitcoinAmount;
    }
    public void setBitcoinAmount(CoinbaseAmount bitcoinAmount) {
        this.bitcoinAmount = bitcoinAmount;
    }
    public String getBitcoinAddress() {
        return bitcoinAddress;
    }
    public void setBitcoinAddress(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }
    public String getRefundAddress() {
        return refundAddress;
    }
    public void setRefundAddress(String refundAddress) {
        this.refundAddress = refundAddress;
    }
    public String getBitcoinUri() {
        return bitcoinUri;
    }
    public void setBitcoinUri(String bitcoinUri) {
        this.bitcoinUri = bitcoinUri;
    }
    public Date getPaidAt() {
        return paidAt;
    }
    public void setPaidAt(Date paidAt) {
        this.paidAt = paidAt;
    }
    public Date getMispaidAt() {
        return mispaidAt;
    }
    public void setMispaidAt(Date mispaidAt) {
        this.mispaidAt = mispaidAt;
    }
    public Date getExpiredAt() {
        return expiredAt;
    }
    public void setExpiredAt(Date expiredAt) {
        this.expiredAt = expiredAt;
    }
    public CoinbaseTransaction getTransaction() {
        return transaction;
    }
    public void setTransaction(CoinbaseTransaction transaction) {
        this.transaction = transaction;
    }
    public String[] getMispayments() {
        return mispayments;
    }
    public void setMispayments(String[] mispayments) {
        this.mispayments = mispayments;
    }
    public String[] getRefunds() {
        return refunds;
    }
    public void setRefunds(String[] refunds) {
        this.refunds = refunds;
    }
    public CoinbaseTransaction[] getManualRefundTransactions() {
        return manualRefundTransactions;
    }
    public void setManualRefundTransactions(CoinbaseTransaction[] manualRefundTransactions) {
        this.manualRefundTransactions = manualRefundTransactions;
    }
    
}