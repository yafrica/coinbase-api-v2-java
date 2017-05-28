package coinbase.api.v2.service.data;

import org.junit.Before;
import org.junit.Test;

import coinbase.api.v2.bean.CoinbaseExchangeRates;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.service.data.CoinbaseExchangeRatesService;

public class TestCoinbaseExchangeRatesService {
	
	CoinbaseExchangeRatesService service;
	
	@Before
	public void setUp() {
		service = new CoinbaseExchangeRatesService();
	}
	
	@Test
	public void testCoinbaseExchangeRatesService() throws CoinbaseHttpException {
		CoinbaseExchangeRates exchangeRates = service.getExchangeRates("BTC");
		System.out.println("EUR : " + exchangeRates.getRates().get("EUR"));
	}

}
