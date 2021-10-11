package account;

public class AccountTest {
	final static int ACCOUNTBALANCE = 9000;

	public static void debit() {

		System.out.println("Enter How much money you want to Withdraw :");
		int amount = inputScanner.inputInteger();
		if (amount <= ACCOUNTBALANCE) {
			int totalAccountBalance = ACCOUNTBALANCE - amount;
			System.out.println("The Remaining money in your account :" + totalAccountBalance);
		} 
		else {
			System.out.println("Debit amount exceeded Account Balance");
			System.out.println("Your Account Balance is :" + ACCOUNTBALANCE);
		}
	}

	public static void main(String[] args) {
		debit();
	}
}
