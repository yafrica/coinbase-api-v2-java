package coinbase.api.v2.bean.response;

import java.util.List;

public abstract class AbstractCoinbaseListResponse<T> {
	
	private CoinbasePagination pagination;
	private List<T> data;
	
	public CoinbasePagination getPagination() {
		return pagination;
	}
	public void setPagination(CoinbasePagination pagination) {
		this.pagination = pagination;
	}
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}

}
