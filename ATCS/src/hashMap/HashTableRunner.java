package hashMap;

import java.util.LinkedList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import maps.Relatives;
import static java.lang.System.*;

public class HashTableRunner
{
	public static void main( String args[] ) throws IOException
	{
		try (BufferedReader br = new BufferedReader(new FileReader("File/numbers.dat")))
		{
		    String line;
		    HashTable h = new HashTable();
		    
		    while ((line = br.readLine()) != null) {
		    	
		    	
		    	 int num = Integer.parseInt(line.trim());
		    	// Number n = new Number(num);
		    	 h.add(num);

		    }
		    System.out.println(h.toString());
		    
		
		    
		}
	}
}