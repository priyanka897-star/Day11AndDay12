package stockaccountmanagement;

import java.util.ArrayList;

public class UserInterface {
	void print(ArrayList<StockCatagories> stockList) {
		for (int i = 0; i < stockList.size(); i++) {
			System.out.println(stockList.get(i));
		}
	}

	void addStock(StockCatagories stock) {
		//InputScanner inputScanner = new InputScanner();
		Instruction instuction = new Instruction();
		instuction.enterShareName();
		stock.setShareName(InputScanner.inputString());
		instuction.enterNumberOfShares();
		stock.setNumberOfShares(InputScanner.inputDouble());
		instuction.EnterSharePrice();
		stock.setSharePrice(InputScanner.inputDouble());
		stock.setTotalValueOfStock(stock.getNumberOfShares() * stock.getSharePrice());
		StockStore stockStore = new StockStore();
		stockStore.add(stock);

	}

}
