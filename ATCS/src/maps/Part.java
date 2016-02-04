package maps;


public class Part implements Comparable<Part>
{
	private String make, mode, rest;
	private int year;

	public Part(String line) 
	{
		String[] list = line.split(" ");
		make = list[list.length - 3];
		mode = list[list.length - 2];
		year = Integer.parseInt(list[list.length - 1]);
		int num = list.length - 3;
		for (int i = 0; i < num; i++)
		{
			rest += list[i] + " ";
		}
		
		rest = rest.substring(4);
		
	}

	//have to have compareTo if implements Comparable
	public int compareTo( Part rhs )
	{
		String otherMake = rhs.getMake();
		if (make.substring(0, 1).compareTo(otherMake.substring(0,1))>0)
		{
			return 1;
		}
		else if (make.substring(0, 1).compareTo(otherMake.substring(0,1))<0)
			return -1;
		else if (make.substring(0, 1).compareTo(otherMake.substring(0,1))==0)
		{
			String otherMode = rhs.getModel();
			if (mode.substring(0, 1).compareTo(otherMode.substring(0,1))>0)
			{
				return 1;
			}
			else if (mode.substring(0, 1).compareTo(otherMode.substring(0,1))<0)
				return -1;
			else
			{
				String otherRest = rhs.getRest();
				if (rest.substring(0, 1).compareTo(otherRest.substring(0,1))>0)
				{
					return 1;
				}
				else if (rest.substring(0, 1).compareTo(otherRest.substring(0,1))<0)
					return -1;
			}
			
		}
		return 0;
	}

	public String toString()
	{
		
		return make + " " + mode + " " + year + " " + rest;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public String getModel()
	{
		return mode;
	}
	public int getYear()
	{
		return year;
	}
	public String getRest()
	{
		return rest;
	}
}