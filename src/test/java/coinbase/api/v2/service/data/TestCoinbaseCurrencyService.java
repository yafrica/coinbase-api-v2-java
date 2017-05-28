package coinbase.api.v2.service.data;

import org.junit.Before;
import org.junit.Test;

import coinbase.api.v2.bean.CoinbaseCurrency;
import coinbase.api.v2.bean.response.ListCoinbaseCurrency;
import coinbase.api.v2.exception.CoinbaseHttpException;

public class TestCoinbaseCurrencyService {

	CoinbaseCurrencyService service;
	
	@Before
	public void setUp() {
		service = new CoinbaseCurrencyService();
	}
	
	@Test
	public void testCoinbaseCurrencyService() throws CoinbaseHttpException {
		ListCoinbaseCurrency currencies = service.getCurrencies();
		for (CoinbaseCurrency currency : currencies.getData()) {
			System.out.println(currency.getId() + " - " + currency.getName() + " - " + currency.getMinSize());
		}
		
	}

}
