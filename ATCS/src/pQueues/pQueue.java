package pQueues;

import java.util.ArrayList;

public class pQueue implements PriorityQueue{

	private ArrayList<Patient> queue = new ArrayList<Patient>();

	@Override
	public boolean isEmpty() {
		return queue.isEmpty();
	}

	@Override
	public void add(Object x) {
		queue.add((Patient) x);
		
	}

	@Override
	public Object poll() {
		Object priority = queue.get(0);
		for (Object o : queue)
		{
			if (((Patient) o).compareTo(priority) < 0)
				priority = o;
		}
		queue.remove(priority);
		return priority;
	}

	@Override
	public Object peek() {
		Object priority = queue.get(0);
		for (Object o : queue)
		{
			if (((Patient) o).compareTo(priority) < 0)
				priority = o;
		}
		return priority;
	}

	@Override
	public int size() {
		return queue.size();
	}
	
	public String toString()
	{
		Object o = poll();
		String s = "[" + o.toString() + "] ";
		for (Patient p : queue)
		{
			s += "[" + p.toString() + "] ";
		}
		queue.add((Patient) o);
		return s;
	}

}
