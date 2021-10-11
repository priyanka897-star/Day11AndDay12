package stockaccountmanagement;

import java.util.Scanner;

public class InputScanner {
	
	public static Scanner scanner = new Scanner(System.in);

	public static   String inputString() {
		return scanner.next();
	}
	
	public static int inputInteger() {
		return scanner.nextInt();
	}
	
	public static double inputDouble() {
		return scanner.nextDouble();
	}
	
	public void scannerClose() {
		scanner.close();
	}
}
