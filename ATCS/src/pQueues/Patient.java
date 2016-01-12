package pQueues;

public class Patient implements Comparable{
	
	private String name;
	private int num;

	public Patient()
	{
		
	}
	public Patient(String n, int number)
	{
		name = n;
		num = number;
		
	}
	public String getName()
	{
		return name;
	}
	public int getNumber()
	{
		return num;
	}
	public String toString()
	{
		return name + ", " + num;
	}
	@Override
	public int compareTo(Object p)
	{
		p = (Patient)p;
		if (((Patient) p).getNumber() <= num)
		{
			return 1;
		}
		if (((Patient) p).getNumber() >= num)
		{
			return -1;
		}
		return 0;
	}
	
}