package maps;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import sets.MathSet;
import static java.lang.System.*;

public class SpanRunner
{
	public static void main( String args[] ) throws IOException
	{
		try (BufferedReader br = new BufferedReader(new FileReader("File/spantoeng.dat")))
		{
		    String line;
		    int num = 0;
		    SpanishToEnglish s = new SpanishToEnglish();
		    
		    while ((line = br.readLine()) != null) {
		    	
		    	if (num<46)
		    	{
		    	 s.putEntry(line);
		    	 String [] word = line.split(" ");
		    	 
		    	 //System.out.print(s.translate(word[0]) + " = ");

		    	}
		    	else
		    	{
		    	
		    		System.out.println(s.translate(line));
		    	}
		    	num++;
		    	

		    }
		    
		}
	}
}