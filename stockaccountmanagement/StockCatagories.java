package stockaccountmanagement;

public class StockCatagories {

	private String nameOfShare;
	private double numberOfShares;
	private double sharePrice;
	private double totalValueOfStock;

	public String getShareName() {
		return nameOfShare;
	}

	public void setShareName(String nameOfShare) {
		this.nameOfShare = nameOfShare;
	}

	public double getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(double numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public double getTotalValueOfStock() {
		return totalValueOfStock;
	}

	public void setTotalValueOfStock(double totalValueOfStock) {
		this.totalValueOfStock = totalValueOfStock;
	}

	@Override
	public String toString() {
		return "StockCatagories [nameOfShare=" + nameOfShare + ", numberOfShares=" + numberOfShares + ", sharePrice="
				+ sharePrice + ", totalValueOfStock=" + totalValueOfStock + "]";
	}

}
