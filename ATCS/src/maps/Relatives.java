package maps;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Scanner;

import static java.lang.System.*;

public class Relatives
{
	private Map<String,Set<String>> map = new HashMap<String, Set<String>>();

	public Relatives()
	{



	}

	public void setPersonRelative(String line)
	{
		String[] personRelative = line.split(" ");
		if (!map.containsKey(personRelative[0]))
		{
			Set<String> s = new HashSet<String>();
			s.add(personRelative[1]);
			map.put(personRelative[0], s);
		}
		else
		{
			Set<String> s = map.get(personRelative[0]);
			if (personRelative.length > 1)
			{
				s.add(personRelative[1]);
				map.put(personRelative[0],s);
			}
			
		}
	}


	public String getRelatives(String person)
	{
		String s = "";
		Set<String> d = map.get(person);
		for (String r : d)
		{
			s += " " + r;
		}

		return s;
	}


	public String toString()
	{
		String output="";

		Iterator<Map.Entry<String, Set<String>>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
		   Map.Entry<String, Set<String>> mapEntry = entries.next();
		   output += mapEntry.getKey() + " is related to " + mapEntry.getValue();
		   output += "\n";
		}
		
		return output;
	}
}