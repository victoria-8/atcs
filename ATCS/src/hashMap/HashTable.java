package hashMap;


import java.util.LinkedList;

import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
	private LinkedList<Number>[] table = new LinkedList[10];

	public HashTable( )
	{
		for (int i = 0 ; i < table.length; i++)
		{
			LinkedList<Number> l = new LinkedList<Number>();
			table[i] = l;
		}
		
	}

	public void add(int obj)
	{
		Number num = new Number(obj);
		int i = num.hashCode();
		
		if (!(table[i].contains(num)))
			table[i].add(num);
		else
		{
			
		}
		
		
	}

	public String toString()
	{
		String output="HASHTABLE\n";
		int num = 0;
		for (LinkedList<Number> l : table)
		{
			output += "bucket " + num + " ";
			for (Number n : l)
			{
				output += n.toString() + " ";
			}
			output += "\n";
			num++;
		}

		return output;
	}
}