/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		Deck bicycle = new Deck(new String[] {"2","3","4","5","6","7","8","9","10","J","Q","K","A"}, new String[] {"hearts", "spades", "clubs", "diamonds"}, new int[] {2,3,4,5,6,7,8,9,10,11,12,13,14});

		System.out.println("Number of cards: " + bicycle.size());
		System.out.println("Full Deck: " + bicycle);
		System.out.println("You were dealt the: " + bicycle.deal());
		System.out.println("The remaining deck is: " + bicycle);

		Deck ruawawatrain = new Deck(new String[] {"Ben", "Josiah", "David"}, new String[] {"~Forest Hills"}, new int[] {100,100,100});

		System.out.println("Number of cards: " + ruawawatrain.size());
		System.out.println("Full Deck: " + ruawawatrain);
		System.out.println("You were dealt the: " + ruawawatrain.deal());
		System.out.println("The remaining deck is: " + ruawawatrain);

		Deck buckets = new Deck(new String[] {"Sleep at School", "Get on roof", "Go to every room"}, new String[] {"Stuyvesant"}, new int[] {100,100,100});

		System.out.println("Number of cards: " + buckets.size());
		System.out.println("Full Deck: " + buckets);
		System.out.println("You were dealt the: " + buckets.deal());
		System.out.println("The remaining deck is: " + buckets);
	}
}
