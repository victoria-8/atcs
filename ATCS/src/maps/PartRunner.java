package maps;


import static java.lang.System.*;

import java.io.IOException;


//Files needed
 	//Part.java
 	//PartList.java

public class PartRunner
{
	public static void main(String[] args) throws IOException 
	{
		PartList p = new PartList("File/partinfo.dat");
		System.out.println(p.toString());
	}
}
