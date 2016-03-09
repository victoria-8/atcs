package phones;

public class PhoneEntry implements Comparable{
	
	private Comparable name;
	private Comparable number;
	private PhoneEntry leftEntry;
	private PhoneEntry rightEntry;
	
	public PhoneEntry(Comparable n, Comparable nn)
	{
		name = n;
		number = nn;
	}
	public PhoneEntry(Comparable myName, Comparable myNumber, 
			PhoneEntry left, PhoneEntry right) { 

	name = myName; 

	number = myNumber; 
	leftEntry = left;
	rightEntry = right;

	} 
	
	public Comparable getName()
	{
		return name;
	}
	
	public String getNum()
	{
		return "" + number;
	}

	@Override
	public int compareTo(Object arg0) {
		
		PhoneEntry p = (PhoneEntry)arg0;
		return name.compareTo(p.getName());
	}
	
	public void changeNum(Comparable nn)
	{
		number = nn;
	}
	
	public Comparable toComparable()
	{
		return name + "\t" + number;
				
	}
	public void setLeft(PhoneEntry p)
	{
		leftEntry = p;
	}
	public void setRight(PhoneEntry p)
	{
		rightEntry = p;
	}
	public PhoneEntry getLeft()
	{
		return leftEntry;
	}
	public PhoneEntry getRight()
	{
		return rightEntry;
	}
	public Comparable getValue()
	{
		return name;
	}
	public String toString()
	{
		return name + " " + number;
	}
	public void setValue(Comparable nam)
	{
		name = nam;
	}

}
