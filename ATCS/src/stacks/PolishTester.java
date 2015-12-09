package stacks;

public class PolishTester {

	public static void main(String[] args) {
		Polish p = new Polish("4 + 2 * 10 - 3 * 2");
		p.preSolve();
		System.out.println(p.solve());
		
		Polish p2 = new Polish("3 * (4 + 2) + 5");
		p2.preSolve();
		System.out.println(p2.solve());

	}

}
