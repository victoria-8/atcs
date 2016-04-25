package graphs;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GraphRunner
{
	public static void main( String[] args ) throws IOException
	{
		Scanner file = new Scanner(new File("File/graph1.dat"));
		int howManyTimes = file.nextInt();
		file.nextLine();
		for(int x=0; x<howManyTimes; x++)
		{
			Graph y=new Graph(file.nextLine());
			String z=file.nextLine();
			if(y.check(z.charAt(0)+"", z.charAt(1)+"", "")){
				System.out.println();
				System.out.println(z.charAt(0)+" connects to "+ z.charAt(1));
				System.out.println("shortest route = " + y.getShortestPath());
				y.clearPath();

			}
			else
			{
				System.out.println(z.charAt(0)+" does not connect to "+ z.charAt(1));

				y.clearPath();

			}
		}
	}
}