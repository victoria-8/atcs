package maps;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class RelativesRunner
{
	public static void main( String args[] ) throws IOException
	{
		try (BufferedReader br = new BufferedReader(new FileReader("File/relatives.dat")))
		{
		    String line;
		    int num = 0;
		    Relatives r = new Relatives();
		    
		    while ((line = br.readLine()) != null) {
		    	
		    	
		    	 r.setPersonRelative(line);

		    }
		    System.out.println(r.toString());
		    System.out.println("Dot is related to" + r.getRelatives("Dot"));
		
		    
		}
	}
}