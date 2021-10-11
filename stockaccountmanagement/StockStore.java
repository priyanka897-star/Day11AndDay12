package stockaccountmanagement;

import java.util.ArrayList;

public class StockStore {
	private ArrayList<StockCatagories> stockAccountList = new ArrayList<StockCatagories>();

	public ArrayList<StockCatagories> getStockList() {
		return stockAccountList;
	}

	public void add(StockCatagories stock) {
		stockAccountList.add(stock);
	}

	public void remove(StockCatagories stock) {
		stockAccountList.remove(stock);
	}
}
