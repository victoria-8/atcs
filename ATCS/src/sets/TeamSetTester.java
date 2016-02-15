package sets;

public class TeamSetTester {
	
	public static void main(String[] args)
	{
		TeamSet a = new TeamSet();
		

		a.addWrestler(new Wrestler("Bob",157));

		a.addWrestler(new Wrestler("Fred",129));

		a.addWrestler(new Wrestler("Jake",100));

		a.addWrestler(new Wrestler("Arnold",199));

		a.addWrestler(new Wrestler("Stan",120));

		
		System.out.println(a);
		System.out.println("avg = " + a.getAvg());
		System.out.println("lights = " + a.getLights());


		
		}
	}


