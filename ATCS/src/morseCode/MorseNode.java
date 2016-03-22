package morseCode;

public class MorseNode implements Comparable{
	
	private String morse;
	private String letter;
	private MorseNode left;
	private MorseNode right;
	private int index;

	public MorseNode(String s, int index)
	{
		letter = s;
		this.index = index;
	}
	
	public void setLeft(MorseNode left)
	{
		this.left = left;
	}
	public void setRight(MorseNode right)
	{
		this.right = right;
	}
	public void setLetter(String l)
	{
		letter = l;
	}
	
	public String getMorse()
	{
		return morse;
	}
	
	public Comparable getValue()
	{
		return letter;
	}
	public int getIndex()
	{
		return index;
	}
	
	public MorseNode getLeft()
	{
		return left;
	}
	public MorseNode getRight()
	{
		return right;
	}

	@Override
	public int compareTo(Object arg0) {
		MorseNode other = (MorseNode)arg0;
		if (index > other.getIndex())
			return 1;
		else if (index < other.getIndex())
			return -1;
		else 
			return 0;
	}
	
	public String toString()
	{
		return letter;
	}

}
