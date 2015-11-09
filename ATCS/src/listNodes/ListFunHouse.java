package listNodes;

import static java.lang.System.*;

public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
	   while (list != null)
	   {
		   if (list.getValue() != null){
			   System.out.println(list.getValue());

		   }
		   list = list.getNext();
	   }
   }		
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
		int count=0;
		while (list!= null)
		{
			count++;
			list = list.getNext();
		}
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
		ListNode list2 = new ListNode(list.getValue(), list.getNext());
		list.setNext(list2);
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
		ListNode list2 = new ListNode();
		while (list.getNext() != null)
		{
			list2 = new ListNode(list.getNext().getValue(), null );
			list = list.getNext();
		}
		list.setNext(list2);

	}
		
	//method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list)
	{
		removeXthNode(list, 2);
	}

	//this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value)
	{
		int count=0;
		while (list != null)
		{
			count++;
			if (count % x == 0)
			{
				list.setValue(value);
			}
			list = list.getNext();
		}
	}	

	//this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x)
	{
		int count=1;
		
		while (list.getNext() != null)
		{
			
			if (count % x == 1)
			{
				list.setNext(list.getNext().getNext());
				count+=1;
			}
			
			if (list.getNext() != null)
				list = list.getNext();
			count++;

		}
		
	}		
}