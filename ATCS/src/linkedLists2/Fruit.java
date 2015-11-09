package linkedLists2;

import java.util.LinkedList;
import java.util.ListIterator;

public class Fruit {
	
	LinkedList<String> bowl;
	
	public Fruit()
	{
		bowl = new LinkedList<String>();
		bowl.addLast("apple");
		bowl.addLast("banana");
		bowl.addLast("cherry");
		bowl.addLast("lemon");
		bowl.addLast("lime");
		bowl.addLast("orange");
		bowl.addLast("papaya");
		bowl.addLast("strawberry");
		//bowl.addLast("watermelon");

	}
	
	public void displayFruits()
	{
		ListIterator<String> iter = bowl.listIterator();
		while (iter.hasNext())
		{
			System.out.println(iter.next());
			iter.next();

		}
			
	}
	
	public static void main(String[] args)
	{
		Fruit f = new Fruit();
		f.displayFruits();
	}

}
