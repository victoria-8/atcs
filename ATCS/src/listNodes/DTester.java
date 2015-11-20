package listNodes;

public class DTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLinkedList d = new DLinkedList();
		d.addFirst("a");
		DListIterator iter = d.iterator();

		d.addFirst("a");
		d.addFirst("b");
		d.addFirst("c");
		d.addFirst("d");
		d.addFirst("e");

		d.addLast("z");
		d.addLast("z");

		
		System.out.println(d);
		
		System.out.println("remove first");

		System.out.println("removing " + d.removeFirst());
		
		System.out.println(d);
		
		d.removeLast();
		
		System.out.println("remove last");
		System.out.println(d);
		
		System.out.println("size = " + d.size());
		
		d.clear();
		System.out.println("clear");
		System.out.println(d);
		






	}

}
