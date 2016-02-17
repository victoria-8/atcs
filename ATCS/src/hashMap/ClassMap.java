package hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeSet;

import sets.Wrestler;

public class ClassMap {
	
	private HashMap<String, TreeSet<Student>> map;
	
	public ClassMap()
	{
		map = new HashMap<String, TreeSet<Student>>();
	}
	
	public void addStudent(Student s)
	{
		if (!map.containsKey(s.getClub()))
		{
			TreeSet<Student> list = new TreeSet<Student>();
			list.add(s);
			map.put(s.getClub(), list);
		}
		else
		{
			TreeSet<Student> set = map.get(s.getClub());
			set.add(s);
			map.put(s.getClub(), set);
		}
	}
	
	public String toString()
	{
		String s = "";
		Iterator<Map.Entry<String, TreeSet<Student>>> entries = map.entrySet().iterator();
		while (entries.hasNext())
		{
		    Map.Entry<String, TreeSet<Student>> entry = entries.next();
		    s += entry.getKey() + "\t" + entry.getValue() + "\n";

		}
		return s;
	}
	
	public TreeSet<Student> getNames(String club)
	{
		return map.get(club);
	}
	

}
