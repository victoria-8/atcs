package listNodes;

import java.util.*;
import static java.lang.System.*;

public class HistoList
{
   private HistoNode front;

	public HistoList( )
	{
		front = null;
	}

	//addLetter will add a new node to the front for let if let does not exist
	//addLetter will bump up the count if let already exists
	public void addLetter(char let)
	{
		if (front == null)
		{
			front = new HistoNode(let, 1, null);
			//System.out.println(front);

		}
		
		else if (indexOf(let) == -1)
		{
			HistoNode temp = front;
			front = new HistoNode(let, 1, temp);
			//System.out.println(front);

		}
		
		else if (front.getLetter() == let)
		{
			front.setLetterCount(front.getLetterCount() + 1);
			//System.out.println(front);

		}
		else
		{
			int node = indexOf(let);
			HistoNode h = nodeAt(node);
			h.setLetterCount(h.getLetterCount() + 1);
			//System.out.println(h);

		}
		
		
				
//		if (front != null)
//		{
//			if (front.getNext() != null && front.getLetter() != let)
//			{
//				while (front.getNext() != null)
//				{
//					front = front.getNext();
//
//					if (front.getLetter() == let )
//					{
//						front.setLetterCount(front.getLetterCount() + 1);
//						//System.out.println(front);
//
//					}
//					else
//					{
//						HistoNode temp = front;
//						front = new HistoNode(let, 1, temp);
//					}
//					//System.out.println(front);
//
//				}
//			}
//			else
//			{
//				HistoNode temp = front;
//				front = new HistoNode(let, 1, temp);
//			}
//		}

	}

	//returns the index pos of let in the list if let exists
	public int indexOf(char let)
	{
		int counter = 0;
		if (front.getLetter() == let)
			return counter;
		
		while (front.getNext() != null)
		{
			front = front.getNext();
			counter++;
			if (front.getLetter() == let)
				return counter;
		}
		
		return -1;
	}

	//returns a reference to the node at spot
	private HistoNode nodeAt(int spot)
	{
		if (spot == 0)
			return front;
		
		int counter = 0;
		HistoNode current=null;
		
		while (front.getNext() != null)
		{
			front = front.getNext();
			counter++;
			if (counter == spot)
				return front;
		}

		return current;
	}

	//returns a string will all values from list
	public String toString()
	{
		String output = "";
		
		while (front.getNext() != null)
		{
			front = front.getNext();
			output += front.getLetter() + " - " + front.getLetterCount();
		}

		return output;
	}
}