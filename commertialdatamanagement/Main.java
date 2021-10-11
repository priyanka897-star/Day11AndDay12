package commertialdatamanagement;

import stockaccountmanagement.InputScanner;
import stockaccountmanagement.StockCatagories;

public class Main {

	static double totalValue = 0;

	public static void main(String[] args) {

		Company company = new Company();
		StockCatagories stockcatagories = new StockCatagories();
		company.setStockSymbol(InputScanner.inputString());
		stockcatagories.setNumberOfShares(InputScanner.inputInteger());
		stockcatagories.setSharePrice(InputScanner.inputDouble());
		stockcatagories.setTotalValueOfStock(stockcatagories.getNumberOfShares() * stockcatagories.getSharePrice());
		totalValue = totalValue + stockcatagories.getTotalValueOfStock();
		StockAccount stock = new StockAccount();
		stock.buy(company);
		
		while (true) {
			System.out.println("Enter 1.Buy the Company Shares 2.Sell the Company Shares 3.Display ");
			int choice = InputScanner.inputInteger();
			switch (choice) {
			case 1:
				Company companies = new Company();
				stock.addCompany(companies);
				totalValue = totalValue + stockcatagories.getTotalValueOfStock();
				stock.buy(companies);
				break;
			case 2:
				Company companysell = new Company();
				stock.sell(companysell);
				totalValue = totalValue + stockcatagories.getTotalValueOfStock();
				break;
			case 3:
				System.out.println("StockAccount");
				stock.printReport(stock.getStockList());
				System.out.println("TotalValue is :" + totalValue);
				break;

			}
		}
	}
}
