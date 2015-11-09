package linkedLists;

public class Term implements Comparable<Term>{
	
	private double coeff;
	private double power;
	
	public Term(double c, double p)
	{
		coeff = c;
		power = p;
	}
	
	public double getCoeff()
	{
		return coeff;
	}
	
	public double getPwr()
	{
		return power;
	}
	
	//must have same powers
	public Term add(Term t)
	{
		return new Term(coeff + t.getCoeff(), power);
	}
	
	public Term multiply(Term t)
	{
		return new Term(coeff * t.getCoeff(), power + t.getPwr());
	
	}
	
	public String toString()
	{
		return "" + coeff + "x^" + power;
	}

	@Override
	public int compareTo(Term t) {
		if (t.getPwr() > power)
			return 1;
		if (t.getPwr() < power)
			return -1;
		return 0;
	}

}