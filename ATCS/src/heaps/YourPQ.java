package heaps;
import java.util.List;

import java.util.ArrayList;
import static java.lang.System.*;

public class YourPQ
{
	private List<Monster> list;

	public YourPQ()
	{
		list = new ArrayList<Monster>();
	}

	public void add(Monster m)
	{
		list.add(m);
		swapUp(m, list.size()-1);
	}

   public void swapUp(Monster m, int bot)
   {
	   if (list.size()==0)
		   list.add(m);
	   else if (list.get(bot/2).compareTo(list.get(bot))>0)
		   return;
	   else if (list.get(bot/2).compareTo(list.get(bot))<0)
	   {
		   Monster mm = list.get(bot/2);
		   list.set(bot/2,list.get(bot));
		   list.set(bot, mm);
		   swapUp(m,bot/2);
		   if (list.get(bot-1).compareTo(list.get(bot))<0)
			{
			   Monster num2 = list.get(bot-1);
				list.set(bot-1, list.get(bot));
				list.set(bot, num2);
				swapUp(num2, bot/2);
			}
	   }
   }

	public void remove( )
	{
		list.set(0,list.get(1));
		list.remove(1);
		if (list.get(0)<list.get(1))
			swap(0,1);
		if (list.size() >=3 && list.get(0)<list.get(2))
			swap(0,2);
		swapDown(1);
		swapDown(2);
		
		
	}

	public void swapDown(int top)
	{
		if (top >= list.size() || top*2 >=list.size())
			return;
		else if (list.get(top*2)>list.get(top) && list.get(top*2+1)>list.get(top))
		{
				return;
		}
			
		else if (list.get(top*2)<list.get(top))
		{
		   int num = list.get(top*2);
		   list.set(top*2,list.get(top));
		   list.set(top*2, num);
		   swapUp(top*2);
		   if (list.get(top+1)>list.get(top))
			{
			   int num2 = list.get(top+1);
				list.set(top+1, list.get(top));
				list.set(top, num2);
				swapUp(top*2);
			}
		   
		}
		else if (list.get(top*2+1)<list.get(top))
		{
		   int num = list.get(top*2+1);
		   list.set(top*2+1,list.get(top));
		   list.set(top*2+1, num);
		   swapUp(top*2+1);
		   if (list.get(top+1)>list.get(top))
			{
			   int num2 = list.get(top+1);
				list.set(top+1, list.get(top));
				list.set(top, num2);
				swapUp(top*2+1);
			}
		   
		}
		
		
	}
	
	private void swap(int start, int finish)
	{	
		int num = list.get(finish);
		list.set(finish, list.get(start));
		list.set(start,num);
	}

	public void print()
	{
		out.println("\n\nPRINTING THE HEAP!\n\n");
		//out.println(list);
		//System.out.println(list.get(0));
		for (int i = 0; i < list.size(); i++)
		{
			if (i==0 || i==1 || i==3 || i==7)
				System.out.println();
			
//			if (Math.pow(2, i) == i+1)
//				System.out.println();
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