package coinbase.api.v2;

import coinbase.api.v2.service.CoinbaseAccountService;
import coinbase.api.v2.service.CoinbaseAddressService;
import coinbase.api.v2.service.CoinbaseAuthenticationService;
import coinbase.api.v2.service.CoinbaseBuyService;
import coinbase.api.v2.service.CoinbaseNotificationService;
import coinbase.api.v2.service.CoinbasePaymentMethodService;
import coinbase.api.v2.service.CoinbaseSellService;
import coinbase.api.v2.service.CoinbaseTransactionService;
import coinbase.api.v2.service.CoinbaseUserService;
import coinbase.api.v2.service.auth.ICoinbaseTimestampProvider;
import coinbase.api.v2.service.data.CoinbaseCurrencyService;
import coinbase.api.v2.service.data.CoinbaseExchangeRatesService;
import coinbase.api.v2.service.data.CoinbasePricesService;
import coinbase.api.v2.service.data.CoinbaseTimeService;

public class CoinbaseApi {
    
    private ICoinbaseTimestampProvider timestampProvider;
    private CoinbaseAccountService accountService;
    private CoinbaseAddressService addressService;
    private CoinbaseAuthenticationService authenticationService;
    private CoinbaseBuyService buyService;
    private CoinbaseSellService sellService;
    private CoinbaseNotificationService notificationService;
    private CoinbaseTransactionService transactionService;
    private CoinbaseUserService userService;
    private CoinbaseCurrencyService currencyService;
    private CoinbaseExchangeRatesService exchangeRatesService;
    private CoinbasePricesService pricesService;
    private CoinbaseTimeService timeService;
    private CoinbasePaymentMethodService paymentMethodService;
    
    public CoinbaseApi() {
        this.initServices(null);
    }
    
    public CoinbaseApi(ICoinbaseTimestampProvider timestampProvider) {
        this.initServices(timestampProvider);
    }
    
    protected void initServices(ICoinbaseTimestampProvider provider) {
        this.timeService = new CoinbaseTimeService();
        if (null == provider) {
            this.timestampProvider = this.timeService;
        } else {
        	this.timestampProvider = provider;
        }
        this.accountService = new CoinbaseAccountService(this.timestampProvider);
        this.addressService = new CoinbaseAddressService(this.timestampProvider);
        this.authenticationService = new CoinbaseAuthenticationService(this.timestampProvider);
        this.buyService = new CoinbaseBuyService(this.timestampProvider);
        this.notificationService = new CoinbaseNotificationService(this.timestampProvider);
        this.userService = new CoinbaseUserService(this.timestampProvider);
        this.transactionService = new CoinbaseTransactionService(this.timestampProvider);
        this.paymentMethodService = new CoinbasePaymentMethodService(this.timestampProvider);
        this.sellService = new CoinbaseSellService(this.timestampProvider);
        this.currencyService = new CoinbaseCurrencyService();
        this.exchangeRatesService = new CoinbaseExchangeRatesService();
        this.pricesService = new CoinbasePricesService();
    }

    public CoinbaseAccountService getAccountService() {
        return accountService;
    }

    public CoinbaseAddressService getAddressService() {
        return addressService;
    }

    public CoinbaseAuthenticationService getAuthenticationService() {
        return authenticationService;
    }

    public CoinbaseBuyService getBuyService() {
        return buyService;
    }

    public CoinbaseNotificationService getNotificationService() {
        return notificationService;
    }

    public CoinbaseTransactionService getTransactionService() {
        return transactionService;
    }

    public CoinbaseCurrencyService getCurrencyService() {
        return currencyService;
    }

    public CoinbaseExchangeRatesService getExchangeRatesService() {
        return exchangeRatesService;
    }

    public CoinbasePricesService getPricesService() {
        return pricesService;
    }

    public CoinbaseTimeService getTimeService() {
        return timeService;
    }
    
    public CoinbaseUserService getUserService() {
		return userService;
	}
    
    public CoinbasePaymentMethodService getPaymentMethodService() {
		return paymentMethodService;
	}
    
    public CoinbaseSellService getSellService() {
		return sellService;
	}
    
}
