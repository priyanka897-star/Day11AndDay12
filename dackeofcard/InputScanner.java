package dackeofcard;

import java.util.Scanner;
import java.util.Random;

public class InputScanner {
	public static Scanner scanner = new Scanner(System.in);

	public static String inputString() {
		return scanner.next();
	}

	public static String[] shuffleCardsDeck(String[] arr) {

		Random random = new Random();
		int flip1, flip2;
		String temp;
		for (int i = 0; i < 52; i++) {
			flip1 = random.nextInt(51);
			flip2 = random.nextInt(51);
			if (flip1 != flip2) {
				temp = arr[flip1];
				arr[flip1] = arr[flip2];
				arr[flip2] = temp;
			}
		}
		return arr;

	}

	public static int inputInteger() {
		return scanner.nextInt();
	}

	public double inputDouble() {
		return scanner.nextDouble();
	}

	public void scannerClose() {
		scanner.close();
	}
}
