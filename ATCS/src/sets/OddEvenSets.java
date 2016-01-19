package sets;


import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class OddEvenSets
{
	private Set<Integer> odds = new TreeSet<Integer>();
	private Set<Integer> evens = new TreeSet<Integer>();

	public OddEvenSets()
	{
	}

	public OddEvenSets(String line)
	{
		String[] s = line.split(" ");
		for (String num : s)
		{
			int x = Integer.parseInt(num);
			if (x%2 == 0)
				evens.add(x);
			else
				odds.add(x);
		}
	}

	public String toString()
	{
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}