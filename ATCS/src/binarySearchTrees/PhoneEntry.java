package binarySearchTrees;

public class PhoneEntry {
	private String name; 
	private String number; 
	private PhoneEntry leftEntry;
	private PhoneEntry rightEntry;

	// constructor 

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
}
