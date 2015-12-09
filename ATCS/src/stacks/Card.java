package stacks;

public class Card implements Comparable<Card>{
	
	private int suit;
	private int value;
	
	public Card()
	{
		value = 3;
		suit = 1;
	}
	
	public Card (int mySuit, int myValue)
	{
		value = myValue;
		suit = mySuit;
	}
	
	public String getValue()
	{
		if (value == 11)
			return "J";
		if (value == 12)
			return "Q";
		if (value == 13)
			return "K";
		
		return "" + value;
	}
	
	public String getSuit()
	{
		if (suit == 1)
			return "clubs";
		if (suit == 2)
			return "diamonds";
		if (suit == 3)
			return "hearts";
		if (suit == 4)
			return "spades";
		return "";
	}
	
	public String toString()
	{
		return (getValue() + " of " + getSuit());
	}

	@Override
	public int compareTo(Card arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
