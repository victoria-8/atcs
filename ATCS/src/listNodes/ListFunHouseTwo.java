//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -  

package listNodes;

import static java.lang.System.*;
public class ListFunHouseTwo
{
	private ListNode theList;
	private ListNode firstNode;
	private String toString = "";

	
	public ListFunHouseTwo()
	{
		theList = new ListNode();
		firstNode = null;
		

	}
	
	public void add(Comparable data)
	{
		if (firstNode == null)
		{
			firstNode = new ListNode(data, theList);
			theList= new ListNode(firstNode.getValue(), firstNode);
			toString += theList.getValue() + " ";
		}
		else
		{
			ListNode temp=theList;
			
			theList.setNext(new ListNode(data, firstNode));
			toString += theList.getNext().getValue() + " ";
		}
		

	}
	
	
	//this method will return the number of nodes present in list
	public void nodeCount()
	{
		
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
		
				
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast()
	{
		
		
	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{

		


	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{
		

	
	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x)
	{


	
	}		
	//this method will return a String containing the entire list
   public String toString()
   {
	
	  
	  return toString;
   }			
	
}