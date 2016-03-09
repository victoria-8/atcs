package phones;

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
				p.add(array[0],array[1]);
				
			}
			
			p.display();
			System.out.println("Lazo = " + p.search("Lazo"));
			System.out.println("9810208 = " + p.reverseLookup("9810208"));
			System.out.println("remove(Lazo) = ");
			p.remove("Lazo");
			p.display();

			


			
		}
		
	}

}
