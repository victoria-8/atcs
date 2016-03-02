package binarySearchTrees;

public class PhoneBook {
	
	private PhoneEntry root;
	
	public PhoneBook()
	{
		root = null;
	}
	
	public void add(PhoneEntry p)
	{
		if (root == null)
			root = p;
	}
	

}
