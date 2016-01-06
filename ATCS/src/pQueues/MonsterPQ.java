package pQueues;

import java.util.Queue;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;

public class MonsterPQ  
{
	private PriorityQueue<Monster> pQueue;

	public MonsterPQ()
	{
	}

	public void add(Monster obj)
	{
		pQueue.add(obj);
	}
	
	public Object getMin()
	{
		
		Monster o = pQueue.remove();
		pQueue.add(o);
		
		return o;
	}
	
	public Object removeMin()
	{
		return pQueue.remove();
	}
	
//	public String getNaturalOrder()
//	{
//		String output="";
//		while
//		return output;		
//	}

	public String toString()
	{
		String s = "";
		while (!pQueue.isEmpty())
		{
			s += pQueue.remove();
		}
		return s;
	}
}