package hashMap;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class PhoneBook {
	
	private Hashtable<String, TreeSet<PhoneEntry>> table;
	
	public PhoneBook()
	{
		
	}
	
	public PhoneBook(int numSlots)
	{
		table = new Hashtable<String,TreeSet<PhoneEntry>>(numSlots);
		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		for (char c : alphabet)
		{
			String s = "" +c;
			table.put(s, new TreeSet<PhoneEntry>());
		}
		
	}
	
	public void add(PhoneEntry p)
	{
		TreeSet<PhoneEntry> list = table.get(p.getName().substring(0,1));
		list.add(p);
		table.put(p.getName().substring(0,1), list);
		
	}
	
	public void display()
	{
		Set<String> keys = table.keySet();
		for (String key : keys)
		{
			System.out.print(key + "\t");
			System.out.println(table.get(key));
		}
	}
	
	public int getCapacity()
	{
		return table.size();
	}
	
	public int getSize()
	{
		int num = 0;
		Set<String> keys = table.keySet();
		for (String key : keys)
		{
			num += table.get(key).size();
		}
		return num;
	}
	
	public int getNumberOfNulls()
	{
		int i = 0;
		Set<String> keys = table.keySet();
		for (String key : keys)
		{
			if (table.get(key).size() == 0)
			{
				i++;
			}
		}
		return i;
	}
	
	public int getLongestList()
	{
		int largest = 0;
		Set<String>keys = table.keySet();
		for (String key : keys)
		{
			int amt = table.get(key).size();
			if (amt > largest)
				largest = amt;
		}
		return largest;
	}
	
	public String lookup(String lookfor)
	
	

}
