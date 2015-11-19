package listNodes;

public class DTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DLinkedList d = new DLinkedList();
		
		d.addFirst("go");
		
		DListIterator iter = d.iterator();
		
		iter.add("a");
		iter.add("b");
		iter.add("c");
		iter.add("d");
		iter.add("e");

		d.addLast("z");
		
		System.out.println(d);
		
		d.removeFirst();
		
		System.out.println("remove first");
		System.out.println(d);
		
		d.removeLast();
		
		System.out.println("remove last");
		System.out.println(d);
		
		System.out.println("size = " + d.size());



	}

}
