package binarySearchTrees;

public class PhoneEntry {
	private String name; 
	private String number; 
	private PhoneEntry leftEntry;
	private PhoneEntry rightEntry;

	// constructor 

	public PhoneEntry(String myName, String myNumber){
		
	}
	public PhoneEntry(String myName, String myNumber, 
			PhoneEntry left, PhoneEntry right) { 

	name = myName; 

	number = myNumber; 
	leftEntry = left;
	rightEntry = right;

	} 

	public String toString() { 

	return "Name: " + name + " Number: " + number; 

	}
	
	public String getName()
	{
		return name;
	}
	public String getNumber()
	{
		return number;
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
}
