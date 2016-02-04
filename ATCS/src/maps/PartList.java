package maps;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.Scanner;

import static java.lang.System.*;

public class PartList
{
	private TreeMap<Part, Integer> partsMap = new TreeMap<Part, Integer>();
	
	public PartList()
	{

	}
	
	public PartList(String fileName) throws IOException
	{
		try (BufferedReader br = new BufferedReader(new FileReader("File/partinfo.dat")))
		{
		    
			String line;
		   
		    
		    while ((line = br.readLine()) != null) {
		    	
		    	Part p = new Part(line);
		    	if (!partsMap.containsKey(p))
		    	{
		    		partsMap.put(p, 1);
		    	}
		    	else
		    	{
		    		partsMap.put(p, partsMap.get(p) + 1);
		    	}

		    }
		
		
		    
		}
	}
	
	public String toString()
	{
		String output = "";
		Iterator<Map.Entry<Part, Integer>> parts = partsMap.entrySet().iterator();

		while (parts.hasNext()) {
		    Map.Entry<Part, Integer> entry = parts.next();
		 output += entry.getKey() + " - " + entry.getValue() + "\n";
		}
		return output;
	}
}