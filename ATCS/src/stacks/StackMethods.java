package stacks;

import java.util.Iterator;
import java.util.Stack;

public class StackMethods 
{ 

	public static double getAverage(Stack<Integer> one)
	{
		double d = 0;
		int count = 0;
		for (Integer x : one)
		{
			d += x;
			count++;
		}
		return d/count;
	}

	public static Stack<String> alternateStack (Stack<String>  one, Stack<String> two)
	{
		Stack<String> three = new Stack<String>();
		while (!one.isEmpty() || !two.isEmpty())
		{
			if (!one.isEmpty())
				three.push(one.pop());
			if (!two.isEmpty())
				three.push(two.pop());
		}
		Stack<String> four = new Stack<String>();
		while (!three.isEmpty())
		{
			four.push(three.pop());
		}
		return four;
	}

        //Good Question: For alternating stacks, are they the same size??…Do they have to be??? 

	public static Stack<String> removeEveryOther(Stack<String> one)
	{
		
		Stack<String> s = new Stack<String>();
		for (int i = 0; i < one.size(); i++)
		{
			if (i%2 == 0)
			{
				s.push(one.pop());
			}
			else
				one.pop();
		}
		Stack<String> newS = new Stack<String>();
		while (!s.isEmpty())
			newS.push(s.pop());
		System.out.println(one.size());

		return newS;
	}

      //Removes every other element in the stack – but the order of others shouldn’t change. 

	public  static void display(Stack<String> one) 
	{
		for (String s : one)
			System.out.println(s);
		
	} 

      //We want to print in the order that it comes off the stack
	
	public static void main(String[] args)
	{

		Stack<Integer> a = new Stack<Integer>(); 

		a.push(5); 

		a.push(2); 

		a.push(7);

		Stack<String> b = new Stack<String>(); 

		b.push("one");

		b.push("two");

		Stack<String> c = new Stack<String>();

		c.push("three");

		c.push("four");

		c.push("five");
		
		//two one
		//three four five
		//three two four one five
		//five four two three one
		
		display(alternateStack(b,c));

		System.out.println();

		Stack<String> d = new Stack<String>();

		d.push("six"); 

		d.push("seven"); 

		d.push("eight"); 

		d.push("nine"); 

		d.push("ten"); 

		display(removeEveryOther(d));
		
		//ten nine eight seven six
		//ten eight six
		
	}


}