/**
 * 
 * @author Tanya Kalianda
 * Card Class
 * Period 6
 */
public class CardClass 
{
	private char suit;
	private String rank;
	private int value;

	/**
	 * Constructs a card                  //tells what the program is doing + explains the fields
	 * @param v initial value
	 * @param r initial rank
	 * @param s initial suit
	 */
	
	public CardClass(int v, String r, char s)    //one constructor will take argument for every field
	{
		value = v;
		rank = r;
		suit = s;
	}
	
	
	//would change value of card in the constructor	
	
	/**
	 * returns the value of the card                   //explains what this method does
	 * @return value       the value of the card		// name of method + name of field
	 */
	public int getValue()
	{
		return value;
	}
	
	/**
	 * returns the rank of the card
	 * @return rank             the rank of the card
	 */	
	public String getRank()
	{
		return rank;
	}
	
	/**
	 * returns the suit of the card
	 * @return suit   the suit of the card
	 */
	public char getSuit()
	{
		return suit;
	}
	//no draw card method or shuffle method b/c it doesn't belong in the card class -> belongs in a deck of cards class
	//classes represent one idea/one thing -> class for deck of cards, class for a card
}
