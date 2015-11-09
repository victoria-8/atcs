package linkedLists2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Problems {
	
	public static void main(String[] args)
	{
		LinkedList<String> bowl = new LinkedList<String>();
		bowl.addLast("apple");
		bowl.addLast("banana");
		bowl.addLast("cherry");
		bowl.addLast("lemon");
		bowl.addLast("lime");
		
		System.out.println("duplicate");
		System.out.println();
		duplicate(bowl);
		
		System.out.println();
		System.out.println("repeat");
		System.out.println();
		repeat(bowl);
		
		System.out.println();
		System.out.println("delete");
		System.out.println();
		delete(bowl, "cherry");
		
		System.out.println();
		System.out.println("insert");
		System.out.println();
		insert(bowl, "aardvark");
		System.out.println();

		insert(bowl, "cherry");
		System.out.println();

		insert(bowl, "zebra");
		System.out.println();

		insert(bowl, "tiger");


	}
	
	public static void duplicate(LinkedList staff)
	{
		
		ListIterator<String> iter = staff.listIterator();
		while (iter.hasNext())
		{
			String s = iter.next();
			System.out.println(s);
			
			System.out.println(s);
			
		}
		
	}
	
	public static void repeat(LinkedList staff)
	{
		for (int i = 0; i < 2; i++)
		{
			ListIterator<String> iter = staff.listIterator();
			while (iter.hasNext())
			{
				System.out.println(iter.next());
			}
		}
	}
	
	public static void delete(LinkedList staff, String searchFor)
	{
		int length = searchFor.length();
		ListIterator<String> iter = staff.listIterator();
		while(iter.hasNext())
		{
			String s = iter.next();
			for (int i = 0; i < s.length()-5; i++)
			{
				if (s.substring(i, i+length).equals(searchFor))
					iter.remove();
			}
			
		}
		iter = staff.listIterator();
		while (iter.hasNext())
			System.out.println(iter.next());
	}
	
	//inserts object into staff based on alphabetical order
	public static void insert(LinkedList staff, String object)
	{
		boolean entered = false;
		ListIterator<String> iter = staff.listIterator();
		while(iter.hasNext())
		{
			String nextString = iter.next();
			
			
			if (object.compareTo(nextString) < 0)
			{
				iter.previous();
				iter.add(object);
				entered = true;
				while(iter.hasNext())
				{
					iter.next();

				}
			}
			
		}
		if (!entered)
		{
			iter.add(object);
		}
		
		iter = staff.listIterator();	
		while (iter.hasNext())
			System.out.println(iter.next());
	}
	

}
