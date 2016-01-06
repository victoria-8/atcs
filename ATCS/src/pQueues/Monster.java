package pQueues;

public class Monster implements Comparable{
	
	private int height;
	private int weight;
	private int age;
	public Monster()
	{
		
	}
	public Monster(int h, int w, int a)
	{
		height = h;
		weight = w;
		age = a;
	}
	public int getHeight()
	{
		return height;
	}
	public int getWeight()
	{
		return weight;
	}
	public int getAge()
	{
		return age;
	}
	@Override
	public int compareTo(Object m) 
	{
		if (((Monster) m).getHeight() <= height && 
				((Monster) m).getWeight() <= weight && ((Monster) m).getAge() <= age)
		{
			return -1;
		}
			
		return 1;
	}
	
	public String toString()
	{
		return "" + height + " " + weight + " " + age;
	}

}
