package pQueues;
import java.util.Queue;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	private Queue<String> pQueue;

	public PQTester()
	{
		pQueue = new PriorityQueue();
	}

	public PQTester(String list)
	{
		pQueue = new PriorityQueue();
		pQueue.add(list);

	}

	public void setPQ(String list)
	{
		pQueue.add(list);

	}
	
	public Object getMin()
	{
		String p = "" + pQueue.remove();
		pQueue.add(p);
		return p;
	}
	
	public String getNaturalOrder()
	{
		String output="";
		while(!pQueue.isEmpty())
		{
			output+= pQueue.remove() + " ";
		}
		return output;		
	}

	public String toString()
	{
		String s1 = "";
		for (String s : pQueue)
		{
			s1 += s + " ";
		
		}
		return s1;
	}
}