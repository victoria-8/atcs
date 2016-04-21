package graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Graph
{
	private TreeMap<String, String> map;
	private boolean[] checked;
	private ArrayList<Integer> paths;

	public Graph()
	{
		
	}
	public Graph(String line)
	{
		if(map==null)
			map=new TreeMap();
		for(int x=0; x<line.length(); x=x+3){
			if(!map.containsKey(line.substring(x, x+1))){
				map.put(line.substring(x, x+1), line.substring(x+1, x+2));
			}
			else{
				map.replace(line.substring(x, x+1), map.get(line.substring(x, x+1))+line.substring(x+1, x+2));
			}
			if(!map.containsKey(line.substring(x+1, x+2))){
				map.put(line.substring(x+1, x+2), line.substring(x, x+1));
			}
			else{
				map.replace(line.substring(x+1, x+2), map.get(line.substring(x+1, x+2))+line.substring(x, x+1));
			}
		}
	}

	public boolean contains(String letter)
	{
	   return map.containsKey(letter);
	}

	public boolean directCheck(String first, String second){
		paths = new ArrayList<Integer>();
		if(first.equals(second))
		{
			paths.add(1);
			return true;

		}
		if(!map.containsKey(first)||!map.containsKey(second)){
			return false;
		}
		else{
			CharSequence x=second;
			return (map.get(first)).contains(x);
		}
	}
	public boolean check(String first, String second, String placesUsed)
	{
		placesUsed+=first;
			if(directCheck(first,second)){
				return true;
			}
			else{
				String x=map.get(first);
					
				for(int i=0;i<x.length();i++){
					if(!placesUsed.contains(x.substring(i,i+1))){
						if(check(x.substring(i, i+1),second,placesUsed))
						{
							paths.add(i);
							return true;

						}
					}
							
				}
				return false;
			}

//		get the current list of connections for one
//		loop through all of the connections
//		If you have not checked the current spot
//		add current spot to been
//		check to see a connection exists between spot and the destination ( recursive call )

		
	}
	
	public int getShortestPath()
	{
		Iterator<Integer> i = paths.listIterator();
		Integer num = i.next();

		while (i.hasNext())
		{
			Integer num2 = i.next();
			if (num2<num)
				num = num2;
		}
		
		
		return num;
	}

	public String toString()
	{
		String output="";
		Iterator<String> a=map.keySet().iterator();
		while(a.hasNext()){
			String character=a.next();
			output+=character+"\t";
			String lim=map.get(character+"");
			
			output+=lim+"\n";
		}
		return output;
	}
}