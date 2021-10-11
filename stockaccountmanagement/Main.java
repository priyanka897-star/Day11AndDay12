package stockaccountmanagement;

public class Main {

	public static double totalStock = 0;

	public static void main(String args[]) {
		StockAccount();
	}

	public static void StockAccount() {

		UserInterface userInterface = new UserInterface();
		StockStore stockStore = new StockStore();

		while (true) {
			System.out.println("Enter 1.Add Stock Account 2.View Report");
			int choice;
			choice = InputScanner.inputInteger();
			switch (choice) {
			case 1:
				StockCatagories stock = new StockCatagories();
				userInterface.addStock(stock);
				totalStock = totalStock + stock.getTotalValueOfStock();
				stockStore.add(stock);
				break;
			case 2:
				System.out.println("StockStore");
				userInterface.print(stockStore.getStockList());
				System.out.println("Value of Total Stocks is : " + totalStock + "$");

			}
		}
	}
}
