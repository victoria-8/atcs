package weightedEdges;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class GraphRunner {
	public static void main( String[] args ) throws IOException
	{
	Scanner file = new Scanner(new File("Files/graph2.dat"));
	int howManyTimes = file.nextInt();
	file.nextLine();
	for(int x=0; x<howManyTimes; x++)
	{
		Graph y=new Graph();
		String z=file.nextLine();
		String[] edges = z.split(",");
		for (String s : edges)
		{
			String[] info = s.split(" ");
			Edge e = new Edge(Integer.parseInt(info[1]),Integer.parseInt(info[2]),
					Integer.parseInt(info[3]),info[0]);
			y.addEdge(e);
			
		}
		System.out.println(y);
		
		z=file.nextLine();
		if(y.check(z.charAt(0)+"", z.charAt(1)+"", "")){
			System.out.println(z.charAt(0)+" and "+ z.charAt(1)+" are connected :)");
			System.out.println();
			System.out.print("fewest miles: ");
			ArrayList<Edge>i=y.findFewestMiles(z.charAt(0)+"", z.charAt(1)+"", "");
			for(int index=i.size()-1;index>=0;index--){
				System.out.print(i.get(index).getPoints().substring(0,1));
			}
			System.out.println();
			i=y.findQuickest(z.charAt(0)+"", z.charAt(1)+"", "");
			System.out.print("quickest route: ");
			for(int index=i.size()-1;index>=0;index--){
				System.out.print(i.get(index).getPoints().substring(0,1));
			}
			System.out.println();
			
			System.out.print("cheapest route: ");
			i=y.findLeastExpensive(z.charAt(0)+"", z.charAt(1)+"", "");
			for(int index=i.size()-1;index>=0;index--){
				System.out.print(i.get(index).getPoints().substring(0,1));
			}
			System.out.println();
			System.out.println("--");
			System.out.println();
		}
		else
			System.out.println(z.charAt(0)+" and "+ z.charAt(1)+" are not connected :(");
		//add code here
	}
}
}