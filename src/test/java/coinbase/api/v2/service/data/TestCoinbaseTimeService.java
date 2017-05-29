package coinbase.api.v2.service.data;

import java.time.Instant;
import java.util.Date;

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
	
	@Test
	public void testTimeDifference()  throws Exception {
	    String time = "2017-05-29T13:44:16Z";
	    Instant instant = Instant.parse(time);
	    System.out.println(System.currentTimeMillis() / 1000 - instant.getEpochSecond());
	    System.out.println(new Date().getTime() / 1000 - instant.getEpochSecond());
	}
}
