package linkedLists;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class Polynomial {
	
	LinkedList<Term> terms;
	
	public Polynomial()
	{
		terms = new LinkedList<Term>();
	}
	
	public Polynomial(LinkedList<Term> list)
	{
		terms = list;
	}
	
	public LinkedList<Term> getPoly()
	{
		return terms;
	}
	
	public void addTerm(Term t)
	{
		
		ListIterator<Term> iter = terms.listIterator();
		boolean hasSameExp = false;
		
		while(iter.hasNext())
		{
			Term first = iter.next();
			if (first.getPwr() == t.getPwr())
			{
				iter.set(first.add(t));
				hasSameExp = true;
			}
		}
	
		if (!hasSameExp)
		{
			terms.addFirst(t);
		}
	}
		
	public Polynomial add(Polynomial p)
	{
		
		ListIterator<Term> iter = terms.listIterator();
		while (iter.hasNext())
		{
			p.addTerm(iter.next());
		}
		
		return p;
	}
	
	public Polynomial multiply(Polynomial p)
	{
		ListIterator<Term> iter = terms.listIterator();
		ListIterator<Term> iter2 = p.getPoly().listIterator();
		Polynomial newPoly = new Polynomial();
		
		while (iter.hasNext())
		{
			Term t = iter.next();
			iter2 = p.getPoly().listIterator();

			while (iter2.hasNext())
			{
				Term t2 = iter2.next();
				newPoly.addTerm(t.multiply(t2));
			}
		}
		
		return newPoly;
	}
	
	public String toString()
	{
		sort();
		ListIterator<Term> iter = terms.listIterator();
		String poly = "";
		System.out.print(iter.next().toString());
		while(iter.hasNext())
		{
			Term t = iter.next();
			if (t.getPwr() == 0)
			{
				poly += " + " + t.getCoeff();
			}
			else if (t.getCoeff() == 0)
			{
				poly += "";
			}
			else if (t.getCoeff() == 1)
			{
				poly += " + x^" + t.getPwr();
			}
			else
				poly += " + " + t.toString();
		}
		return poly;
	}

	
	public Polynomial deriv()
	{
		ListIterator<Term> iter = terms.listIterator();
		LinkedList<Term> newTerms = new LinkedList<Term>();
		while(iter.hasNext())
		{
			Term t = iter.next();
			newTerms.add(new Term(t.getPwr() * t.getCoeff(),t.getPwr()-1));
		}
		return new Polynomial(newTerms);
	}
	
	public void sort()
	{
		Collections.sort(terms);
	}

}