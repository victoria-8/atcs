package hashMap;

public class Student implements Comparable{
	
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
	
	public int compareTo(Object s)
	{
		Student a = (Student)s;
		
		return (last.compareTo(a.getLast()));
	}
	
	public String toString()
	{
		return "\n\t" + last + " " + first;
	}

	
	

}
