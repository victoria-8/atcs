package pQueues;

import java.util.PriorityQueue;
import java.util.Scanner;

public class MonsterPQRunner
{
	public static void main ( String[] args )
	{
		PriorityQueue<Monster> pq = new PriorityQueue<Monster>();
		Scanner s = new Scanner(System.in);
		System.out.println("How many monsters do you wish to enter?");
		int num = s.nextInt();
		for (int i = 0; i < num; i++)
		{
			System.out.println("height?");
			int height = s.nextInt();
			System.out.println("weight?");
			int weight = s.nextInt();
			System.out.println("age?");
			int age = s.nextInt();
			Monster m = new Monster(height, weight, age);
			pq.add(m);
		}
		
		for (Monster m : pq)
		{
			System.out.print("(" + m + ")" + " ");
		}
		
		System.out.println("getMin(): " + pq.remove());
		for (Monster m : pq)
		{
			System.out.println("(" + m + ")" + " ");
		}
		System.out.println("getMin(): " + pq.remove());

	}
	
		
}