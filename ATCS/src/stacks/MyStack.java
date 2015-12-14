package stacks;

import java.util.LinkedList;
import java.util.ListIterator;

public class MyStack {
	//using Linked Lists
	private LinkedList<Object> list = new LinkedList<Object>();
	
	public Object push(Object item)
	{
		list.addFirst(item);
		return item;
	}

	public Object pop()
	{
		Object x = list.getFirst();
		list.removeFirst();
		return x;
	}

	public Object peek()
	{
		return list.getFirst();
	}

	public boolean isEmpty()
	{
		return list.size() == 0;
	}

	public int size()
	{
		return list.size();
	}

	public int search(Object a)
	{
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).equals(a))
				return i+1;
		}
		return -1;
	}

	public String toString()
	{
		String x = "";
		ListIterator<Object> iter = list.listIterator();
		while (iter.hasNext())
		{
			x += iter.next() + " ";
		}
		return x;

	}

}
