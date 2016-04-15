package graphs;
import java.util.Map;
import java.util.TreeMap;

public class Graph
{
	private TreeMap<String, String> map;
	private boolean yahOrNay;

	public Graph(String line)
	{
		String[] array = line.split(" ");
		for (String s : array)
		{
			if (!(map.containsKey(s.substring(0, 1))))
			{
				map.put(s.substring(0,1),s.substring(1,2));
			}
			else
			{
				
			}
		}
	
	}

	public boolean contains(String letter)
	{
	   return true;
	}

	public void check(String first, String second, String placesUsed)
	{
	}

	public String toString()
	{
		return "";
	}
}