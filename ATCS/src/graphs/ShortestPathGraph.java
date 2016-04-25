package graphs;
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -  
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

import static java.lang.System.*;

public class ShortestPathGraph extends Graph
{
	private int shortestPath = 0;
	
	public ShortestPathGraph(String x)
	{
		super(x);
	}
	public boolean directCheck(String first, String second){
		if(first.equals(second))
		{
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
	public boolean check(String first, String second)
	{
		if(directCheck(first,second)){
			shortestPath++;
			return true;
		}
		else{
			String x=map.get(first);
			for(int i=0;i<x.length();i++){
				if(check(x.substring(i, i+1),second))
				{
					shortestPath++;
					return true;
				}
			}
			return false;
					
		}
	}
	public int getShortestPath(String y)
	{
		
		
		return shortestPath;
	}
}