package hashMap;

public class Student {
	
	private String last;
	private String first;
	private String id;
	private String club;
	
	public Student(String l, String f, String id, String c)
	{
		last = l;
		first = f;
		this.id = id;
		club = c;
	}
	
	public String getfirst()
	{
		return first;
	}
	
	public String getLast()
	{
		return last;
	}
	
	public String getID()
	{
		return id;
	}
	
	public String getClub()
	{
		return club;
	}
	

}
