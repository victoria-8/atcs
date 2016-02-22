package hashMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PhoneBookTester {
	
	public static void main(String[] args) throws IOException
	{
		try(BufferedReader b = new BufferedReader(new FileReader("File/phone.txt")))
		{
			PhoneBook p = new PhoneBook(26);
			String line;
			while ((line = b.readLine()) != null)
			{
				String[] array = line.split("\t");
				PhoneEntry e = new PhoneEntry(array[0],array[1]);
				p.add(e);
				
			}
			p.display();
			System.out.println("capacity = " + p.getCapacity());
			System.out.println("size = " + p.getSize());
			System.out.println("number of nulls = " + p.getNumberOfNulls());
			System.out.println("longest list = " + p.getLongestList());
			System.out.println("Wakeman = " + p.lookup("Wakeman"));
			System.out.println("changeNumber(Wakeman, 9999999) = " + p.changeNumber("Wakeman", "9999999"));
			System.out.println("Wakeman = " + p.lookup("Wakeman"));






		}
		
	}

}
