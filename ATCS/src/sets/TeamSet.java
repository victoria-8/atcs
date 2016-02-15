package sets;

import java.util.HashSet;

public class TeamSet {
	
	private HashSet<Wrestler> set;
	
	public TeamSet()
	{
		set = new HashSet<Wrestler>();
	}
	
	public void addWrestler(Wrestler w)
	{
		set.add(w);
	}
	
	public double getAvg()
	{
		int weights = 0;
		for (Wrestler w : set)
		{
			weights += w.getWeight();
		}
		return weights / set.size();
	}
	
	public HashSet<Wrestler> getLights()
	{
		HashSet<Wrestler> lightSet = new HashSet<Wrestler>();
		for (Wrestler w : set)
		{
			if (w.getWeight() < 120)
				lightSet.add(w);
		}
		return lightSet;
	}
	
	public String toString()
	{
		String s = "";
		for (Wrestler w : set)
		{
			s += w.toString() + "\n";
		}
		return s;
	}

}
