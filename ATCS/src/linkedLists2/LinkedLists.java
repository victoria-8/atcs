package linkedLists2;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedLists {
	
	public static void main(String[] args)
	{
		LinkedList<String> roster = new LinkedList<String>();
		//not indexed
		roster.addLast("Priya");
		roster.addLast("Dan");
		roster.addFirst("Jason");
		roster.addFirst("Vishal");
		roster.addLast("Teja");


		roster.add("Ashay"); // goes to the end
		System.out.println((roster.removeLast())); 

		//System.out.println((roster.remove())); //removes the first one and returns
		
		System.out.println(roster);
		
		ListIterator<String> iter = roster.listIterator(); //cursor before first item
		
		iter.add("Koushik");
		//iterators have cursor position; adds to the beginning of roster
		iter.add("Viren"); //adds to after Koushik
		System.out.println(roster);
		iter.add("Aditya"); //cursor is after Aditya
		System.out.println(roster);
		System.out.println(iter.next()); //cursor moves onto next one after printing
		System.out.println(iter.previous());
		
		iter.next();
		iter.next();
		iter.previous();
		iter.next();
		iter.remove(); //removes last thing you traversed
		
		System.out.println(roster);
		
		//prints from last item to first
		iter = roster.listIterator();
		while (iter.hasNext())
			iter.next();
		while (iter.hasPrevious())
			System.out.println(iter.previous());

		
		
	}

}
