package queues;

public class CircularArrayQueue

{ 
	private int head; 
	
	private int tail; 

	private int theSize; 

	private Object[] elements;

	public CircularArrayQueue(int capacity)
	{ 
		elements = new Object[capacity];
		head = 0;
		tail = 0;
		theSize = capacity;
	} 

	public void add(Object x) 
	{ 
		if (elements.length < theSize)
		{
			elements[tail] = x;
			tail++;	
		}
		else
		{
			Object[] arr = new Object[elements.length * 2];
			for (int i = 0; i < elements.length; i++)
			{
				arr[i] = elements[i];
			}
			elements[tail] = x;
			tail++;
			elements = arr;
			
		}
	} 

	public Object remove() 
	{ 
		Object x = elements[head];
		elements[head] = null;
		head = head+1;
		return x;
	} 

	public int size() 
	{
		return elements.length;
	} 

	
}