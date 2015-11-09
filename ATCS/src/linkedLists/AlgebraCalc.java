package linkedLists;

public class AlgebraCalc {
	
	public static void main(String[] args)
	{
		Term a = new Term(3,5);
		Term b = new Term(-3,4);
		Term c = new Term(4,6);
		
		Term d = new Term(3,4);
		Term e = new Term(-2,0);
		Term f = new Term(1,3);
		
		System.out.println();
		System.out.println("tests adding 2 terms with same power");
		
		System.out.println(a.add(b));
		
		System.out.println();
		System.out.println("tests multiplying 2 terms");
		
		System.out.println(b.multiply(c));
		
		System.out.println();
		System.out.println("tests forming a polynomial");
		
		Polynomial p = new Polynomial();
		p.addTerm(a);
		p.addTerm(b);
		p.addTerm(c);
		System.out.println(p);
		
		System.out.println();
		System.out.println("tests getting the derivative");
		System.out.println(p.deriv());
		
		Polynomial p2 = new Polynomial();
		p2.addTerm(d);
		p2.addTerm(e);
		p2.addTerm(f);
		
		System.out.println();
		System.out.println("tests adding 2 polynomials");
		System.out.println(p.add(p2));
		
		System.out.println();
		System.out.println("tests multiplying 2 polynomials");
		System.out.println(p.multiply(p2));

	}

}