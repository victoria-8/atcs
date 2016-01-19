package sets;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -  
//Lab  -  

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;
import static java.lang.System.*;

public class MathSet
{
	private Set<Integer> one = new TreeSet<Integer>();
	private Set<Integer> two = new TreeSet<Integer>();

	public MathSet()
	{
	}

	public MathSet(String o, String t)
	{
		String [] oo = o.split(" ");
		for (String ooo : oo)
		{
			if (!ooo.equals(""))
				one.add(Integer.parseInt(ooo));
		}
		if (!t.equals(""))
		{
			String [] tt = t.split(" ");
			for (String ttt : tt)
			{
				two.add(Integer.parseInt(ttt));
			}
		}
		
	}

	public Set<Integer> union()
	{
		Set<Integer> s = new TreeSet<Integer>();
		for (Integer i : one)
		{
			s.add(i);
		}
		for (Integer i : two)
		{
			s.add(i);
		}
		return s;
	}

	public Set<Integer> intersection()
	{
		Set<Integer> s = new TreeSet<Integer>();
		for (Integer i : one)
		{
			if (two.add(i)==false)
			{
				s.add(i);
				two.remove(i);
			}
		}
		return s;
	}

	public Set<Integer> differenceAMinusB()
	{
		Set<Integer> s = new TreeSet<Integer>();
		for (Integer i : one)
		{
			if (two.add(i)==true)
			{
				s.add(i);
				two.remove(i);
			}
		}
		return s;
	}

	public Set<Integer> differenceBMinusA()
	{
		Set<Integer> s = new TreeSet<Integer>();
		for (Integer i : two)
		{
			if (one.add(i)==true)
			{
				s.add(i);
				one.remove(i);
			}
		}
		return s;
	}
	
	public Set<Integer> symmetricDifference()
	{		
		Set<Integer> s = new TreeSet<Integer>();
		for (Integer i : one)
		{
			if (two.add(i)==false)
			{
				s.add(i);
				two.remove(i);
			}
		}
		for (Integer i : two)
		{
			if (one.add(i)==false)
			{
				s.add(i);
				one.remove(i);
			}
		}
		return s;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}