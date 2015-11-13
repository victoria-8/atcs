package listNodes;
public class HistoList
{
   //private HistoNode front;
	
	private ListNode front;

    public HistoList( )
    {
        front = null;
    }
    
    public void add(Object x)
    {
    	if(front == null)
            front = new ListNode(new ThingCount(x, 1), null);
        else
        {
            ListNode temp = front;
            while(temp.getNext() != null && temp.getValue() != x)
            {
                temp = temp.getNext();
            }
            if(temp.getValue() == x)
                temp.setValue(((ThingCount) temp.getValue()).getCount() + 1);
            else
                temp.setNext(new ListNode(new ThingCount(x, 1), null));
        }
    }
    
    
//    public void addLetter(char let)
//    {
//        
//    	if(front == null)
//            front = new HistoNode(let, 1, null);
//        else
//        {
//            HistoNode temp = front;
//            while(temp.getNext() != null && temp.getLetter() != let)
//            {
//                temp = temp.getNext();
//            }
//            if(temp.getLetter() == let)
//                temp.setLetterCount(temp.getLetterCount() + 1);
//            else
//                temp.setNext(new HistoNode(let, 1, null));
//        }
//    }
//
//    public int indexOf(char let)
//    {
//        int x = 0;
//        HistoNode temp = front;
//        while(front != null)
//        {
//            if(nodeAt(x).getLetter() == let)
//                return x;
//            x++;
//            temp = temp.getNext();
//        }
//        return -1;
//    }
//
//    private HistoNode nodeAt(int spot)
//    {
//        HistoNode current = front;
//        int count = -1;
//        while(front != null)
//        {
//            count++;
//            if(count == spot)
//                return current;
//            else
//                current = current.getNext();
//        }
//        return null;
//    }

//    public String toString()
//    {
//        String output = "";
//        output += front.getLetter() + " - " + front.getLetterCount();
//        HistoNode temp = front.getNext();
//        while(temp != null)
//        {
//            output += "\t" + temp.getLetter() + " - " + temp.getLetterCount();
//            temp = temp.getNext();
//        }
//        return output;
//    }

    public String toString()
    {
        String output = "";
        output += front.getValue() + " - " + front.getLetterCount();
        HistoNode temp = front.getNext();
        while(temp != null)
        {
            output += "\t" + temp.getLetter() + " - " + temp.getLetterCount();
            temp = temp.getNext();
        }
        return output;
    }
}