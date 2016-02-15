package sets;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TeamMap {
	
	private HashMap<Wrestler, Integer> map;
	public TeamMap()
	{
		map = new HashMap<Wrestler, Integer>();
	}
	
	public void add(Wrestler w)
	{
		int weight = w.getWeight();
		
		int group = weight % 100 / 10;
		
		map.put(w, group);
		
//		if (weight >= 100 && weight < 110)
//			map.put(w,0);
//		else if (weight >= 110 && weight < 120)
//			map.put(w, 1);
//		else if (weight >= 120 && weight < 130)
//			map.put(w, 2);
//		else if (weight >= 130 && weight < 140)
//			map.put(w, 3);
//		else if (weight >= 140 && weight < 150)
//			map.put(w, 4);
//		else if (weight >= 150 && weight < 160)
//			map.put(w, 5);
//		else if (weight >= 160 && weight < 170)
//			map.put(w, 6);
//		else if (weight >= 170 && weight < 180)
//			map.put(w, 7);
//		else if (weight >= 180 && weight < 190)
//			map.put(w, 8);
//		else if (weight >= 190 && weight < 200)
//			map.put(w, 9);
	}
	
	public void changeWeightGroup(Wrestler w, Integer group)
	{
		map.put(w, group);
	}
	
	public Integer get(Wrestler w)
	{
		return map.get(w);
	}
	
	public String toString()
	{
		String s = "";
		Iterator<Map.Entry<Wrestler, Integer>> entries = map.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry<Wrestler, Integer> entry = entries.next();
		   s += entry.getKey() + " weight group = " + entry.getValue() + "\n";   
		}
		return s;
	}

}
