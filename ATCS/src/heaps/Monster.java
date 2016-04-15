package heaps;

public class Monster implements Comparable{
	
	private int height;
	private int weight;
	private int age;
	private Monster left, right;
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
	public void setLeft(Monster l)
	{
		left = l;
	}
	public void setRight(Monster r)
	{
		right = r;
	}
	public Monster getLeft()
	{
		return left;
	}
	public Monster getRight()
	{
		return right;
	}
	@Override
	public int compareTo(Object m) 
	{
		if (((Monster) m).getHeight() >= height )
		{
			return -1;
		}
	//&& ((Monster) m).getWeight() >= weight && ((Monster) m).getAge() >= age
		return 1;
	}
	
	public String toString()
	{
		return "" + height + " " + weight + " " + age;
	}

}
