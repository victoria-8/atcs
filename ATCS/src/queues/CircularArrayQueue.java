package queues;

public class CircularArrayQueue

{ 
	private int head; 
	
	private int tail; 

	private int theSize; 

	private int[] elements;

	public CircularArrayQueue(int capacity)
	{ 
		elements = new int[capacity];
		head = 0;
		tail = 0;
		theSize = 0;
	} 

	public void add(int x) 
	{ 
		if (tail < elements.length)
		{
			elements[tail] = x;
			tail++;	
			theSize++;
		}
		else
		{
			boolean elementInput = false;
			for (int i = 0; i < elements.length; i++)
			{
				if (elements[i] == 0)
				{
					elements[i] = x;
					//tail = i; //
					elementInput = true;
					return;
				}
			}
			if (!elementInput)
			{
				int[] arr = new int[elements.length * 2];
				int count = 0;
				for (int i = 0; i < elements.length-head; i++)
				{
					arr[i] = elements[head+i];
					count++;
				}
				for (int i = 0; i < head; i++)
				{
					arr[count + i] = elements[i];
					//count++;
				}
				elements = arr;
				elements[tail] = x;
				tail++;
				head = 0;
			}
		}
	} 

	public int remove() 
	{ 
		int x = elements[head];
		elements[head] = 0;
		head = head+1;
		return x;
	} 

	public int size() 
	{
		return elements.length;
	} 
	
	public String toString()
	{
		String x = "";
		for (int i = 0; i < elements.length; i++)
		{
			x += elements[i] + " ";
		}
		return x;
	}

	
}