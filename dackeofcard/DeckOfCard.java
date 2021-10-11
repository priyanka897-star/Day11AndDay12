package dackeofcard;

public class DeckOfCard {
	
		public static String [] name = new String[4];
		
			public static void main(String[] args) {
				
				String[] cardType = { "Clubs", "Diamonds", "Hearts", "Spades" };
				String[] cardNumbers = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
				String[] cardsArray = new String[52];
				int start = 0, end = 12, counter1ForNumbers = 0;
				// for combination of cardType and cardNumbers
				for (int i = 0; i < 4; i++) {
					for (int j = start; j <= end; j++) {
						cardsArray[j] = cardType[i] + " " + cardNumbers[counter1ForNumbers ];
						counter1ForNumbers ++;
					}
					counter1ForNumbers  = 0;
					start = end + 1;
					end += 13;
				}

				InputScanner.shuffleCardsDeck(cardsArray);
				System.out.println("**************************************");

				
				int counter2ForNumbers  = 0;
				for (int i = 0;  i<name.length; i++) {
					System.out.print("Enter Player "+(i+1)+"'s Name: ");
					name[i] = InputScanner.inputString();
					//System.out.print("For Name" " + i + ": \n");
					for (int j = 0; j < 9; j++) {
	
						System.out.print(cardsArray[counter2ForNumbers ] + "-->");
						counter2ForNumbers++;
					}
					System.out.println();
				}
		}
}


		