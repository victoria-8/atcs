package hashMap;

public class PhoneEntry implements Comparable{
	
	private String name;
	private String number;
	
	public PhoneEntry(String n, String nn)
	{
		name = n;
		number = nn;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getNum()
	{
		return number;
	}

	@Override
	public int compareTo(Object arg0) {
		
		return name.compareTo((String)arg0);
	}
	
	

}
