package maps;

import java.util.HashMap;
import java.util.Map;


public class Acronyms
{
	private Map<String,String> acronymTable = new HashMap<String, String>();

	public Acronyms()
	{
	}

	public void putEntry(String entry)
	{
		String[] words = entry.split(" ");
		String s = "";
		
		
		for (int i = 0 ; i < words.length; i ++)
		{
			if (i > 1)
			{
				s += words[i] + " ";
			}
		}
		acronymTable.put(words[0], s);

	}

	public String convert(String sent)
	{
		String d = "";
		boolean hasPeriod = false;
		String [] words = sent.split(" ");
		for (String s : words)
		{
			hasPeriod = false;
			if (s.contains("."))
			{
				hasPeriod = true;
				s = s.substring(0, s.length()-1);
			}
			String e = acronymTable.get(s);
			if (e != null)
			{
				d += e + " ";
			}
			else
				d += s + " ";
			if (hasPeriod)
			{
				d = d.substring(0, d.length() -1);
				d += ".";
			}
		}
		return d;
	}

	public String toString()
	{
		return "";
	}
}