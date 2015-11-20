package listNodes;


public class DLinkedList { 

private DListNode firstNode; 

private DListNode lastNode; 

/** 

 * Construct an empty list 

 */ 

public DLinkedList() { 

firstNode = null; 

lastNode = null; 

} 

/** 

 * Returns true if the list contains no elements 

 */ 

public boolean isEmpty(){
	
	return size() == 0;
	
	
}

/** 

 * Inserts the argument as the first element of this list. 

 */ 

public void addFirst(Object o) {
	
	DListNode temp = firstNode;
	if(firstNode == null){
		firstNode = new DListNode(o,null,null);
		//System.out.println("firstNode = " + firstNode);
	}
	else{
		 firstNode = new DListNode(o,temp,null);
			//System.out.println("firstNode = " + firstNode);

		
	}
	
}

/** 

 * Inserts the argument as the last element of this list. 

 */ 

public void addLast(Object o){
	
	DListNode temp = lastNode;
	if(lastNode == null){
		lastNode = new DListNode(o,null,null);
		
	}
	else
	{
		lastNode = new DListNode(o, null, temp);
		//System.out.println("lastNode = " + lastNode);
	}
	
}

/** 

 * Removes and returns the first element of this list. 

 */ 

public Object removeFirst(){
	
//	DListNode temp = firstNode;
//	firstNode.setValue(null);
//	return temp;
	
	DListNode temp = firstNode;
	
	return removeXthNode(firstNode, 1);
	//firstNode = firstNode.next();
	
	
}

public Object removeXthNode(DListNode list, int x)
{
	int count=1;
	DListNode rm = null;
	while (list.next() != null)
	{
		
		if (count == x)
		{
			rm = list;
			list.setNext(list.next().next());
			count+=1;
		}
		
		if (list.next() != null)
			list = list.next();
		count++;

	}
	return rm.getValue();
	
}		

/** 

 * Removes and returns the last element of this list. 

 */ 

public Object removeLast(){
	
//	DListNode temp = lastNode;
//	lastNode.setValue(null);
//	return temp;
	
	DListNode temp = lastNode;
	removeXthNode(firstNode, this.size());
	return temp;
	
}

/** 

 * Returns a String representation of the list. 

 */ 

//public String toString(){
//	
//	String output = "";
//	DListIterator iter = iterator();
//	while (iter.hasNext())
//	{
//		
//		output += iter.next().toString()+" ";
//		
//	}
//	return output;
//}

/** 

 * Returns the number of elements in the list as an int. 

 */

public int size() {
	
	DListIterator iter = iterator();
	int count = 0;
	while(iter.hasNext()){
		iter.next();
		count++;
	}
	return count;
	
}

/** 

 * Removes all of the elements from this list. 

 */ 

public void clear() { 
	/*DListIterator iter = iterator();
	while(iter.hasNext()){
		iter.next();
		iter.remove();
	}*/
	int count=1;
	
	while (firstNode.next() != null)
	{
		
		
			firstNode.setNext(firstNode.next().next());
			count+=1;
		
		
		if (firstNode.next() != null)
			firstNode = firstNode.next();
		count++;

	}
}

/** 

 * Returns a DListIterator. 

 */ 

public DListNode getFirstNode()
{
	return firstNode;
}

public DListNode getLastNode()
{
	return lastNode;
}

public DListIterator iterator() { 

return new DListIterator(this); 

}

public String toString()
{
	String x = "";
	DListNode node = firstNode;
	//x += firstNode.getValue() + " ";
	while (node.next() != null)
	{
		x += node.getValue() + " ";
		node = node.next();
	}
	
	return x;
		
}
}
