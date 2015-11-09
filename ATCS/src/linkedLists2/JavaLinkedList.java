package linkedLists2;
import java.util.LinkedList;
import java.util.ListIterator;

import static java.lang.System.*;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum(  )
	{
		double total=0;
		ListIterator<Integer> iter = list.listIterator();
		while (iter.hasNext())
		{
			total += iter.next();
		}
		return total;
	}

	public double getAvg(  )
	{
		int numNums=0;
		ListIterator<Integer> iter = list.listIterator();
		while (iter.hasNext())
		{
			numNums++;
			iter.next();
		}
		return getSum() / numNums;
	}

	public int getLargest()
	{
		int largest=Integer.MIN_VALUE;
		ListIterator<Integer> iter = list.listIterator();
		while (iter.hasNext())
		{
			if (iter.next()>largest)
			{
				largest = iter.previous();
				iter.next();
			}
		}
		return largest;
	}

	public int getSmallest()
	{
		int smallest = Integer.MAX_VALUE;
		ListIterator<Integer> iter = list.listIterator();
		while (iter.hasNext())
		{
			if (iter.next()<smallest)
			{
				smallest = iter.previous();
				iter.next();
			}
		}
		return smallest;
	}

	public String toString()
	{
		String output="";
		return output;
	}
}