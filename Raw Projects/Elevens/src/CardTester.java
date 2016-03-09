/*
 * Jake Lawrence
 * January 28, 2015
 * Medway HS
 * VHS APCS
 */

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card c1 = new Card("7", "Diamonds", 7);
		Card c2 = new Card("2", "Spades", 2);
		Card c3 = new Card("King", "Clubs", 10);
		Card c4 = new Card("King", "Clubs", 10);
		
		System.out.println(c1.toString());
		
		System.out.println("True or False: Card 1 and Card 2 match." + c1.matches(c2));
		System.out.println("True or False: Card 3 and Card 4 match." + c3.matches(c4));
	}
}
