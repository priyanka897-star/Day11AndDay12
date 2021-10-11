package commertialdatamanagement;

import java.util.ArrayList;

import stockaccountmanagement.InputScanner;
import stockaccountmanagement.StockCatagories;
//import stockaccountmanagement.StockStore;
import stockaccountmanagement.Main;

public class StockAccount {

	private ArrayList<Company> stockList = new ArrayList<Company>();
	StockCatagories stockcatagories;
	Company company;
	Main main = new Main();
	InputScanner inputScanner = new InputScanner();

	public ArrayList<Company> getStockList() {
		return stockList;
	}

	public void buy(Company stock) {
		stockList.add(stock);
	}

	public void sell(Company company) {
		System.out.println("Enter name of company you want to sell");
		String name = InputScanner.inputString();
		for (int i = 0; i < stockList.size(); i++) {
			if (stockList.get(i).company.getStockSymbol().equalsIgnoreCase(name) == true) {
				Main.totalStock = Main.totalStock - stockList.get(i).stockcatagories.getTotalValueOfStock();
				stockList.remove(stockList.get(i));
			}
		}
	}

	public void printReport(ArrayList<Company> stockList) {
		for (int i = 0; i < stockList.size(); i++) {
			System.out.println(stockList.get(i));
		}
	}

	void addCompany(Company company) {
		System.out.println("Enter Company name :");
		company.setStockSymbol(InputScanner.inputString());
		System.out.println("Enter No.of Shares :");
		stockcatagories.setNumberOfShares(InputScanner.inputInteger());
		System.out.println("Enter share value");
		stockcatagories.setSharePrice(InputScanner.inputInteger());
		stockcatagories.setTotalValueOfStock(stockcatagories.getNumberOfShares() * stockcatagories.getSharePrice());
	}

}
