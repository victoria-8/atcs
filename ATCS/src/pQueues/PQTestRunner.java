package pQueues;

import java.util.PriorityQueue;
 

public class PQTestRunner
{
	public static void main ( String[] args )
	{
		PQTester pq = new PQTester();
		pq.setPQ("five");
		pq.setPQ("four");
		pq.setPQ("seven");
		pq.setPQ("two");
		pq.setPQ("one");
		pq.setPQ("three");
		pq.setPQ("six");
		System.out.println("toString() - " + pq.toString());
		System.out.println("getMin() - " + pq.getMin());
		System.out.println("getNaturalOrder() - " + pq.getNaturalOrder());
		
//		PQTester pq2 = new PQTester();
//		pq.setPQ("1");
//		pq.setPQ("2");
//		pq.setPQ("3");
//		pq.setPQ("4");
//		pq.setPQ("5");
//		pq.setPQ("three");
//		pq.setPQ("five");
//		pq.setPQ("two");
//		pq.setPQ("four");
//		pq.setPQ("one");
//
//		System.out.println("toString() - " + pq2.toString());
//		System.out.println("getMin() - " + pq2.getMin());
//		System.out.println("getNaturalOrder() - " + pq2.getNaturalOrder());

		


	}
}