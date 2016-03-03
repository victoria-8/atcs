package binarySearchTrees;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhoneBookTester {
	public static void main(String[]args) throws IOException
	{
		try(BufferedReader br = new BufferedReader(new FileReader("File/phone2.txt")))
		{
			String line = "";
			PhoneBook p = new PhoneBook();
			while((line = br.readLine())!=null)
			{
				String[] array = line.split("\t");
				PhoneEntry e = new PhoneEntry(array[0],array[1],null,null);
				p.add(e);
				
			}
			
			
		}
		
	}

}
