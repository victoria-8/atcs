package queues;

public class PalinListRunner
{
	public static void main ( String[] args )
	{
		PalinList p = new PalinList("one two three two one");
		System.out.println("one two three two one :" + p.isPalin());
		p.setList("1 2 3 4 5 one two three four five");
		System.out.println("1 2 3 4 5 one two three four five :" + p.isPalin());
		p.setList("a b c d e f g x y z g f h");
		System.out.println("a b c d e f g x y z g f h :" + p.isPalin());
		p.setList("racecar is racecar");
		System.out.println("racecar is racecar :" + p.isPalin());
		p.setList("chicken is a chicken");
		System.out.println("chicken is a chicken :" + p.isPalin());
		
	}
}