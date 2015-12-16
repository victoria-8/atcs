package queues;

public class MyQueue
{ 
	//using arrays
	
	private String [] array = new String [0];
	
	public String offer(String item)
	{
//		String [] array2 = new String [1];
//		array2[0] = item;
//		String [] array3 = new String[array.length + 1];
//		System.arraycopy(array,0,array3,array.length,array.length);
//		System.arraycopy(array2,0,array3,array.length+1,1);
//		//	arraycopy(String src, int srcPos, String dest, int destPos, int length)
//		array = array3;
//		return item;
		if (array.length == 0)
		{
			String [] arr = new String[1];
			arr[0] = item;
			array = arr;
		}
		else
		{
			String [] array2 = new String[array.length + 1];
			for (int i = 0; i < array.length; i++)
			{
//				if (array[i]!= null)
					array2[i] = array[i];
				//	System.out.println("array[i] = " + array[i]);
			}
			array2[array.length] = item;
			array = array2;

		}
		return item;
	}

	public String poll()
	{
		String x = array[0];
		String [] array2 = new String [array.length - 1];
		for (int i = 0; i < array.length-1; i++)
		{
//			if (array[i]!= null)
				array2[i] = array[i+1];
			//	System.out.println("array[i] = " + array[i]);
		}
		array = array2;
		return x;

	}

	public String peek()
	{
		if (array.length != 0)
			return array[0];
		return null;
	}

	public boolean isEmpty()
	{
		for (String x : array)
		{
			if (x != null)
				return false;
		}
		return true;
	}

	public int size()
	{
		int count = 0;
		for (String x : array)
		{
			if (x != null)
				count++;
		}
		return count;
	}
	
	public int search(String a)
	{
		for (int i = 0; i < array.length; i++)
		{
			if ((array[i]).equals(a))
				return i+1;
		}
		return -1;
		
	}

	public String toString()
	{
		String x = "";
		for (String o : array)
		{
			if (o!= null)
				x += o + " ";
		}
		return x;
	}

}