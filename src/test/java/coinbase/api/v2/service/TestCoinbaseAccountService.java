package coinbase.api.v2.service;

import org.junit.Before;
import org.junit.Test;

import coinbase.api.v2.bean.response.ListCoinbaseAccount;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.service.auth.CoinbaseAuthenticationApiKey;
import coinbase.api.v2.service.auth.CoinbaseAuthenticationBearer;
import coinbase.api.v2.service.auth.ICoinbaseTimestampProvider;
import coinbase.api.v2.service.auth.JvmBasedTimestampProvider;

public class TestCoinbaseAccountService {
    
    private CoinbaseAccountService accountService;
    private ICoinbaseTimestampProvider timeService;
    private CoinbaseAuthenticationBearer authenticationBearer;
    
    private String apiKey = "";
    private String apiSecret = "";
    
    @Before
    public void setUp() {
        this.timeService = new JvmBasedTimestampProvider();
        this.accountService = new CoinbaseAccountService(timeService);
        this.authenticationBearer = new CoinbaseAuthenticationApiKey(apiKey, apiSecret);
    }
    
    @Test
    public void testGetListOfAccount() throws CoinbaseHttpException {
        ListCoinbaseAccount list = accountService.list(this.authenticationBearer);
        System.out.println(list.getData());
    }

}
