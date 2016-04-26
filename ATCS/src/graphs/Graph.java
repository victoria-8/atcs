package graphs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Graph
{
	public TreeMap<String, String> map;
	private boolean[] checked;
	private int shortestPath = 0;
	

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
		if(first.equals(second))
		{
			shortestPath++;
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
				shortestPath++;
				return true;
			}
			else{
				String x=map.get(first);
				for(int i=0;i<x.length();i++){
					if(!placesUsed.contains(x.substring(i,i+1))){
						if(check(x.substring(i, i+1),second,placesUsed))
						{
							shortestPath++;
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
	
	public boolean getShortestPath(String first, String second, String placesUsed)
	{
		placesUsed+=first;
		if(directCheck(first,second)){
			shortestPath++;
			return true;
		}
		else{
			String x=map.get(first);
			for(int i=0;i<x.length();i++){
				if(!placesUsed.contains(x.substring(i,i+1))){
					if(check(x.substring(i, i+1),second,placesUsed))
					{
						shortestPath++;
						return true;

					}
				}
						
			}
			return false;
		}
		//start with node, check all sides -> follow thru for each side
			//if true, save num, start on next side
			//if false, start on next side
	}

	public void clearPath()
	{
		shortestPath = 0;
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