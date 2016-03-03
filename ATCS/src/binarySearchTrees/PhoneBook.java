package binarySearchTrees;

public class PhoneBook {
	
	private PhoneEntry root;
	
	public PhoneBook()
	{
		root = null;
	}
	
	public void add(PhoneEntry p)
	{
		add(p, root);
	
	}
	
	private PhoneEntry add(PhoneEntry p, PhoneEntry compare)
	{
		if (compare == null)
			compare = p;
		else
		{
			String number = compare.getNumber();
			int dirTest = p.getNumber().compareTo(number);
			
			if(dirTest <= 0)
				compare.setLeft(add(p, compare.getLeft()));
			else if(dirTest > 0)
				compare.setRight(add(p, compare.getRight()));
		}
		return compare;
	}
	public int getNumLevels()
	{
		return getNumLevels(root);
	}
	private int getNumLevels(PhoneEntry p)
	{
		if(p==null)
			return 0;
		else if(getNumLevels(p.getLeft())>getNumLevels(p.getRight()))
			return 1+getNumLevels(p.getLeft());
		else
			return 1+getNumLevels(p.getRight());
	}
	public void display(PhoneEntry p)
	{
		for (int i = 0; i < getNumLevels(); i++)
			display(p, i);
	}
	private void display(PhoneEntry p, int level)
	{
		
	}
}
