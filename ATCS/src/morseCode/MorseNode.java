package morseCode;

public class MorseNode {
	
	private String morse;
	private String letter;
	private MorseNode left;
	private MorseNode right;

	public MorseNode(String s)
	{
		s = morse;
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

}
