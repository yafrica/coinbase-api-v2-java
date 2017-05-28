package coinbase.api.v2.service.data;

import org.junit.Before;
import org.junit.Test;

import coinbase.api.v2.bean.CoinbaseTime;
import coinbase.api.v2.exception.CoinbaseHttpException;
import coinbase.api.v2.service.data.CoinbaseTimeService;

public class TestCoinbaseTimeService {
	
	CoinbaseTimeService service;
	
	@Before
	public void setUp() {
		service = new CoinbaseTimeService();
	}
	
	@Test
	public void testCoinbaseTimeService() throws CoinbaseHttpException {
		CoinbaseTime time = service.getCurrentTime();
		System.out.println(time.getIso() + " - " + time.getEpoch());
	}
}
