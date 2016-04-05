package heaps;
import java.util.List;

import java.util.ArrayList;
import static java.lang.System.*;

public class Heap
{
	private List<Integer> list;

	public Heap()
	{
		list = new ArrayList<Integer>();
	}

	public void add(int value)
	{
		list.add(value);
		swapUp(list.size()-1);
		print();
	}

	public void swapUp()
	{
		swapUp(list.size()-1);
	}
   public void swapUp(int bot)
   {
	   if (list.size()==0)
		   list.add(bot);
	   else if (list.get(bot/2)>list.get(bot))
		   return;
	   else if (list.get(bot/2)<list.get(bot))
	   {
		   int num = list.get(bot/2);
		   System.out.println(num);
		   list.set(bot/2,list.get(bot));
		   list.set(bot, num);
		   swapUp(bot);
	   }
	  
	
   }

	public void remove( )
	{
		list.set(0,list.get(list.size()-1));
		list.remove(list.size()-1);
		swapDown(list.size());
	}

	public void swapDown(int top)
	{
	}
	
	private void swap(int start, int finish)
	{	
	}

	public void print()
	{
		out.println("\n\nPRINTING THE HEAP!\n\n");
		out.println(list);
	}

	public String toString()
	{
		return list.toString();
	}
}