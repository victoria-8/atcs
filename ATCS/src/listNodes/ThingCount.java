package listNodes;

public class ThingCount implements Comparable
{
	private int count;
	private Object thing;
	
	public ThingCount()
	{
	}
	
	public ThingCount(Object thang, int cnt)
	{
		thing = thang;
		count = cnt;
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount(int cnt)
	{
		count = cnt;
	}

	public void setThing(Object obj)
	{
		thing = obj;
	}	
	
	public Object getThing()
	{
		return thing;
	}
	
	public boolean equals(Object obj)
	{
		ThingCount other = (ThingCount)obj;
		if (count == other.getCount())
			return true;
		return false;
	}
	
	public int compareTo(Object obj)
	{
		ThingCount other = (ThingCount)obj;
		if (other.getCount()==count)
			return 0;
		if (other.getCount() < count)
			return 1;
		return -1;		
	}
	
	public String toString()
	{
		return ""+ getThing() + " - " + getCount();
	}
}