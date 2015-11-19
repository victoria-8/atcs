package listNodes;

public class DTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLinkedList d = new DLinkedList();
		
		d.addFirst("go");
		
		DListIterator iter = d.iterator();

		
		d.addLast("a");
		
		System.out.println(d);

	}

}
