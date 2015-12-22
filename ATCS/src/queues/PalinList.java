package queues;
import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue = new LinkedList<String>();
	private Stack<String> stack = new Stack<String>();
	private String list;

	public PalinList()
	{
		setList("");
		
	}

	public PalinList(String list)
	{
		setList(list);
		this.list = list;
		
	}

	public void setList(String list)
	{
		this.list = list;
		queue = new LinkedList<String>();
		int lastSpace = 0;
		for (int i = 0; i < list.length(); i++)
		{                                                                                                                                                                                                                                                                      
			if (list.substring(i, i+1).equals(" "))
			{
				queue.add(list.substring(lastSpace, i));
				//stack.add(list.substring(lastSpace, i-1));
				lastSpace = i+1;
			}
		}
		queue.add(list.substring(lastSpace));
	}

	public boolean isPalin()
	{
		stack = new Stack<String>();
//		for (String s : queue)
//			System.out.println(s);
		int size = queue.size();
		for (int i = 0; i < size/2; i++)
		{
			stack.push(queue.poll());
		}
		
		if (size%2 == 1)
			queue.poll();
		
		while (!queue.isEmpty())
		{
			if (!stack.pop().equals(queue.poll()))
				return false;
		}
		return true;
	}

	public String toString()
	{
		return list;
	}
}