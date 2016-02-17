package hashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import sets.MathSet;

public class ClubMapTester {
	
	public static void main(String[] args) throws IOException
	{
		try(BufferedReader br = new BufferedReader(new FileReader("File/student")))
		{
			ClassMap map = new ClassMap();
			String line;
			while((line = br.readLine()) != null) 
			{
				String[] a = line.split("\t");
				
				Student s = new Student(a[0], a[1], a[2], a[3]);
				map.addStudent(s);
				
			     
			}
			System.out.println(map);
			System.out.println("Math = " + map.getNames("Math"));
		}
		
		
	}

}
