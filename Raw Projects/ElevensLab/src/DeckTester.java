/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranksD1 = {"Two", "Three", "Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King","Ace"};
		String[] suitsD1 = {"Clubs", "Spades", "Hearts", "Diamonds"};
		int[] valuesD1 = {2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		Deck D1 = new Deck(ranksD1, suitsD1, valuesD1);
		
		System.out.println("Deck one is " + D1.size() + " cards thick!");
		
		String[] ranksD2 = {"A", "B", "C"};
		String[] suitsD2 = {"Giraffes", "Lions"};
		int[] valuesD2 = {2,1,6};
		
		Deck D2 = new Deck(ranksD2, suitsD2, valuesD2);
		
		System.out.println("[TRUE/FALSE]: Deck 2 is empty: " + D2.isEmpty());
		
		String[] ranksD3 = {"King", "Wizard", "Coder"};
		String[] suitsD3 = {"Java", "Python", "C++"};
		int[] valuesD3 = {10,11,3};
		
		Deck D3 = new Deck(ranksD3, suitsD3, valuesD3);
		
		System.out.println("Deal a card you say...\nYou are dealt the " + D3.deal());
		
		
	}
}
