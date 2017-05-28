package coinbase.api.v2.service.data;

import org.junit.Before;
import org.junit.Test;

import coinbase.api.v2.bean.CoinbaseAmount;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.service.data.CoinbasePricesService;

public class TestCoinbasePricesService {
	
	CoinbasePricesService service;
	private String currencyFrom = "BTC";
	private String currencyTo = "EUR";
	
	@Before
	public void setUp() {
		service = new CoinbasePricesService();
	}
	
	@Test
	public void testCoinbaseBuyPrice() throws CoinbaseHttpException {
		CoinbaseAmount amnt = service.getBuyPrice(currencyFrom, currencyTo);
		System.out.println(amnt.getAmount() + " " + amnt.getCurrency());
	}
	
	@Test
	public void testCoinbaseSellPrice() throws CoinbaseHttpException {
		CoinbaseAmount amnt = service.getSellPrice(currencyFrom, currencyTo);
		System.out.println(amnt.getAmount() + " " + amnt.getCurrency());
	}
	
	@Test
	public void testCoinbaseSpotPrice() throws CoinbaseHttpException {
		CoinbaseAmount amnt = service.getSpotPrice(currencyFrom, currencyTo);
		System.out.println(amnt.getAmount() + " " + amnt.getCurrency());
	}

}
