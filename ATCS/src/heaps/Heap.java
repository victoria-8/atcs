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
		   list.set(bot/2,list.get(bot));
		   list.set(bot, num);
		   swapUp(bot/2);
		   if (list.get(bot-1)<list.get(bot))
			{
			   int num2 = list.get(bot-1);
				list.set(bot-1, list.get(bot));
				list.set(bot, num2);
				swapUp(bot/2);
			}
	   }
   }

	public void remove( )
	{
		list.set(0,list.get(1));
		list.remove(1);
		swapDown(list.size());
	}

	public void swapDown(int top)
	{
		if (top>=1)
			return;
		if (list.get(top*2)>list.get(top))
			return;
		else if (list.get(top*2)<list.get(top))
		{
		   int num = list.get(top*2);
		   list.set(top*2,list.get(top));
		   list.set(top*2, num);
		   swapUp(top*2);
		}
		
	}
	
	private void swap(int start, int finish)
	{	//what is this
	}

	public void print()
	{
		out.println("\n\nPRINTING THE HEAP!\n\n");
		out.println(list);
		System.out.println(list.get(0));
		for (int i = 1; i < list.size(); i++)
		{
			if (Math.pow(2, i) == i)
				System.out.println();
			System.out.print(list.get(i) + " ");
//			System.out.println(Math.pow(2, i));
//			System.out.println(i+1);

			
			
		}
	}

	public String toString()
	{
		return list.toString();
	}
}