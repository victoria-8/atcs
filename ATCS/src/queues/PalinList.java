package queues;
import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList()
	{
		setList("");
	}

	public PalinList(String list)
	{
		setList(list);
		
	}

	public void setList(String list)
	{
		int lastSpace = 0;
		for (int i = 0; i < list.length()-1; i++)
		{
			if (list.substring(i, i+1).equals(" "))
			{
				queue.add(list.substring(lastSpace, i));
				stack.add(list.substring(lastSpace, i));
				lastSpace = i;
			}
		}
	}

	public boolean isPalin()
	{
		String q = "";
		for (String s : queue)
		{
			q += s + " ";
		}
		String s = "";
		for (String a : stack)
		{
			s += a + " ";
		}
		return s.equals(q);
	}


	//write a toString method
}