package heaps;
import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.PriorityQueue;

import pQueues.Monster;

public class PQRunner
{
	public static void main ( String[] args )
	{
		YourPQ pq = new YourPQ();
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
			System.out.print("(" + m + ")" + " ");
		}
		System.out.println("getMin(): " + pq.remove());

			
	}
}