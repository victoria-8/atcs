package sets;


import hashMap.Student;

import java.util.Iterator;
import java.util.HashSet;

public class cpClub {
	// instance variables - replace the example below with your own
	private HashSet<Student> org;

	/**
	 * Constructor for objects of class GuidanceGroup
	 */
	public cpClub() {
		org = new HashSet<Student>();

	}

	public boolean join(Student x) {
		return org.add(x);
	}

	public HashSet<Student> union(cpClub x) {
		HashSet<Student> un = new HashSet<Student>();
		Iterator<Student> one = org.iterator();
		while (one.hasNext())
			un.add(one.next());
		Iterator<Student> two = x.org.iterator();
		while (two.hasNext())
			un.add(two.next());

		// un.addAll(x.org);
		// un.addAll(org);
		return un;
	}

	public HashSet<Student> union2(cpClub x) {
		HashSet<Student> un = new HashSet<Student>();

		for (Student one : org)
			un.add(one);
		for (Student two : x.org)
			un.add(two);

		return un;
	}

	public HashSet<Student> intersection(cpClub x) {
		Student current;
		HashSet<Student> inter = new HashSet<Student>();
		Iterator<Student> i = org.iterator();
		while (i.hasNext()) {
			current = i.next();
			if (!x.org.add(current))
				inter.add(current);
		}
		return inter;
	}

	public HashSet<Student> intersection2(cpClub x) {
		HashSet<Student> inter = new HashSet<Student>();
		for (Student one : org) {
			if (x.org.contains(one))

				inter.add(one);
		}
		return inter;
	}

	public String toString() {
		Iterator i = org.iterator();
		String a = "";
		for (int j = 0; j < org.size(); j++)
			a += "  " + i.next() + "\n";
		return a;

	}

	public HashSet aToM() {

		HashSet a = new HashSet();
		String current = "";
		Iterator i = org.iterator();
		for (int j = 0; j < org.size(); j++) {
			current = ((Student) i.next()).getName();
			if (current.compareTo("N") < 0)
				a.add(current);
		}
		return a;
	}

	public static void main(String[] args) {
		cpClub IPLE = new cpClub();
		cpClub MUN = new cpClub();
		IPLE.join(new Student("Aarons", 123456));
		IPLE.join(new Student("Daley", 6575));
		IPLE.join(new Student("Chen", 4356));
		MUN.join(new Student("Daley", 6575));
		MUN.join(new Student("Davis", 4345));
		MUN.join(new Student("Gupta", 12675));
		MUN.join(new Student("Aarons", 123456));
		MUN.join(new Student("Yu", 2345));
		MUN.join(new Student("Daley", 6575));
		System.out.println("IPLE");
		System.out.println(IPLE);
		System.out.println("MUN");
		System.out.println(MUN);
		System.out.println("union: Students belonging to either club");
		System.out.println(IPLE.union2(MUN));
		System.out.println("");
		System.out.println("intersection: Students belonging to both clubs");
		System.out.println(IPLE.intersection2(MUN));
	}
}


