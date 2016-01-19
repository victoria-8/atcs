package sets;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.*;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class OddRunner
{
	public static void main( String args[] ) throws IOException
	{
		try (BufferedReader br = new BufferedReader(new FileReader("File/oddevendata.dat"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		       OddEvenSets s = new OddEvenSets(line);
		       System.out.println(s);
		    }
		    
		}
     }
	}