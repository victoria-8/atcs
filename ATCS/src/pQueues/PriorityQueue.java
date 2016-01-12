package pQueues;

public interface PriorityQueue {
	
	boolean isEmpty();
	void add(Object x);
	Object poll();
	Object peek();
	int size();

}
