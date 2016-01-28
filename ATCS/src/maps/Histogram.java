package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;


public class Histogram
{
	private Map<String,Integer> histogram = new TreeMap<String,Integer>();

	public Histogram()
	{
	}

	public Histogram(String sent)
	{
		String[] words = sent.split(" ");
		for (String s : words)
		{
			if (!histogram.containsKey(s))
			{
				histogram.put(s, 1);
			}
			else
			{
				histogram.put(s,histogram.get(s)+1);
			}
		}
	}
	
	public void setSentence(String sent)
	{
		histogram.clear();
		String[] words = sent.split(" ");
	for (String s : words)
	{
		if (!histogram.containsKey(s))
		{
			histogram.put(s, 1);
		}
		else
		{
			histogram.put(s,histogram.get(s)+1);
		}
	}
		
	}

	public String toString()
	{
		String output="";
		
		Iterator<Map.Entry<String, Integer>> entries = histogram.entrySet().iterator();
		while (entries.hasNext()) {
		    Map.Entry<String, Integer> entry = entries.next();
		    int value = entry.getValue();
		   output += entry.getKey() + "\t";

		    for (int i = 0; i < value; i++)
		    {
		    	output+= "*";
		    }
		    
		   output+="\n";
		}
		
		String allStars="";
		return output + "\n\n";
	}
}