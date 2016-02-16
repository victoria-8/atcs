package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import sets.Wrestler;

public class ClassMap {
	
	private HashMap<String, ArrayList<Student>> map;
	
	public ClassMap()
	{
		map = new HashMap<String, ArrayList<Student>>();
	}
	
	public void addStudent(Student s)
	{
		if (map.size() == 0 || !map.containsKey(s.getClub()))
		{
			ArrayList<Student> list = new ArrayList<Student>();
			list.add(s);
			map.put(s.getClub(), list);
		}
		else
		{
			Iterator <Map.Entry<String, ArrayList<Student>>> entries = map.entrySet().iterator();
			while (entries.hasNext())
			{
			    Map.Entry<String, ArrayList<Student>> entry = entries.next();

				if (entry.getKey().equals(s.getClub()))
				{
					ArrayList<Student> list = entry.getValue();
					list.add(s);
					map.put(s.getClub(), list);
				}
			}
		}
	}
	
	public String toString()
	{
		String s = "";
		Iterator<Map.Entry<String, ArrayList<Student>>> entries = map.entrySet().iterator();
		while (entries.hasNext())
		{
		    Map.Entry<String, ArrayList<Student>> entry = entries.next();
		    s += entry.getKey() + "\t" + entry.getValue() + "\n";

		}
		return s;
	}
	
	public ArrayList<Student> getNames(String club)
	{
		return map.get(club);
	}
	

}
