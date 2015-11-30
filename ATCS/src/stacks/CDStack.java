package stacks;

import java.util.Iterator;
import java.util.Stack;
public class CDStack {
	Stack <String> myStack;
	
	public CDStack(){
		myStack = new Stack<String>();
			myStack.push("Journey");
			myStack.push("Iggy Pop");
			myStack.push("Hall & Oats");
			myStack.push("Genesis");
			myStack.push("Foreigner");
			myStack.push("Eagles");
			myStack.push("Deep Purple");
			myStack.push("Cheap Trick");
			myStack.push("Beatles");
			myStack.push("Aerosmith"); //first thing that will play
	}
	
	public String nextCD(){
		return myStack.peek(); //does not remove any elements
	}
	
	public String playNextCD(){
		return myStack.pop(); //removes 
	}
	
	public void printCD() { //i didn't finish whoops
		while(!myStack.empty())
			System.out.println(myStack.pop());
	}
	
	public void printWithIter()
	{
		Iterator<String> iter = myStack.iterator();
		while (iter.hasNext())
		{
			System.out.println(iter.next());
			
		}
	}
	
	public void printCDs3()
	{
		for (String s : myStack)
		{
			System.out.println(s);
		}
	}
	
	public void printCDRecursive()
	{
		if (myStack.empty())
			return;
		System.out.println(myStack.pop());
		printCDRecursive();
	}
	
	public void reverseStack()
	{
		Stack <String> temp = new Stack<String>();

		while (!myStack.empty())
		{
			temp.push(myStack.pop());
		}
		
		myStack = temp;
		
	}
	
	public String binary(int num)
	{
		String binary = "";
		while(num != 1)
		{
			binary += num%2;
			num = num / 2;
		}
		binary += num%2;
		return binary;
	}
		
}