package queues;

public class MyQueue
{ 
	//using arrays
	
	private Object [] array = new Object [10];
	
	public Object offer(Object item)
	{
//		Object [] array2 = new Object [1];
//		array2[0] = item;
//		Object [] array3 = new Object[array.length + 1];
//		System.arraycopy(array,0,array3,array.length,array.length);
//		System.arraycopy(array2,0,array3,array.length+1,1);
//		//	arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
//		array = array3;
//		return item;
		Object [] array2 = new Object[array.length + 1];
		for (int i = 0; i < array2.length; i++)
		{
			array2[i] = array[i];
		}
		array2[array.length + 1] = item;
		array = array2;
		return array;
	}

	public Object poll()
	{
		Object x = array[0];
		Object [] array2 = new Object [array.length - 1];
		System.arraycopy(array,1,array2,array.length-1,array.length-1);
		array = array2;
		return x;

	}

	public Object peek()
	{
		return array[0];
	}

	public boolean isEmpty()
	{
		for (Object x : array)
		{
			if (x != null)
				return false;
		}
		return true;
	}

	public int size()
	{
		int count = 0;
		for (Object x : array)
		{
			if (x != null)
				count++;
		}
		return count;
	}
	
	public int search(Object a)
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
		for (Object o : array)
		{
			if (o!= null)
				x += o + " ";
		}
		return x;
	}

}