package sets;

//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		try (BufferedReader br = new BufferedReader(new FileReader("File/mathsetdata.dat")))
		{
		    String line;
		    while ((line = br.readLine()) != null) {
		      MathSet s = new MathSet(line, br.readLine());
		       System.out.println(s);
		       System.out.println("Union: " + s.union());
		       System.out.println("Intersection: " + s.intersection());
		       System.out.println("differenceAMinusB(): " + s.differenceAMinusB());
		       System.out.println("differenceBMinusA(): " + s.differenceBMinusA());
		       System.out.println("symmetricDifference(): " + s.symmetricDifference());
		       System.out.println();



		    }
		    
		}
	}
}
