package maps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

public class AcroRunner
{
	public static void main( String args[] ) throws IOException
	{
		try (BufferedReader br = new BufferedReader(new FileReader("File/acro.dat")))
		{
		    String line;
		    int num = -1;
		    
		    Acronyms a = new Acronyms();
		    
		    while ((line = br.readLine()) != null) {
		    	
		    	num++;
		    	if (num < 8)
		    	{
		    		a.putEntry(line);
		    		System.out.println(line);

		    	}
		    	else
		    		System.out.println(a.convert(line));
		    	

		    }
		    System.out.println(a.toString());
		
		    
		}
	}
}