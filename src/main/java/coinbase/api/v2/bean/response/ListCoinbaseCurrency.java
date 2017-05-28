package coinbase.api.v2.bean.response;

import java.util.List;

import coinbase.api.v2.bean.CoinbaseCurrency;

public class ListCoinbaseCurrency {
	
	private List<CoinbaseCurrency> data;

	public List<CoinbaseCurrency> getData() {
		return data;
	}

	public void setData(List<CoinbaseCurrency> data) {
		this.data = data;
	}
	
}
