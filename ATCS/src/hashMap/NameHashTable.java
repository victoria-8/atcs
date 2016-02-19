package hashMap;

import java.util.ArrayList;

public class NameHashTable {
	// instance variables - replace the example below with your own
	private ArrayList<String>[] table;

	/**
	 * Constructor for objects of class NameHashTAble
	 */
	public NameHashTable() {
		table = new ArrayList[26];
		for (int i = 0; i < 26; i++)
			table[i] = new ArrayList<String>();

	}

	public void addInOrder(String x) {
		int i = (int) x.charAt(0);
		int lett = i - 'A';

		int index = 0;
		for (i = 0; i < table[lett].size(); i++) {
			if (x.compareTo(table[lett].get(i)) > 0)
				index++;
		}
		// Insert the string in the list. Remaining elements automatically move
		// in the list
		table[lett].add(index, x);

	}

	public void add(String x) {
		int i = (int) x.charAt(0);
		int lett = i - 65;

		table[lett].add(x);

		// table[x.charAt(0) - 'A'].add(x);
	}

	public void remove(String x) {

		int i = (int) x.charAt(0);
		int lett = i - 65;
		table[lett].remove(x);
	}

	public boolean contains(String x) {
		int i = (int) x.charAt(0);
		int lett = i - 65;
		return table[lett].contains(x);
	}

	public void display() {
		// String l =new String((char)(65+0));
		for (int i = 0; i < 26; i++) {
			// l = new String((char)(65+i));
			System.out.println((char) (i + 65) + "     " + table[i]);
		}
	}

	public void displayLengths() {
		// String l =new String((char)(65+0));
		for (int i = 0; i < table.length; i++) {

			System.out.println(i + "     " + table[i].size());
		}
	}

	public static void main(String[] args) {
		 NameHashTable club = new NameHashTable();
		 club.add("Aarons");
		 club.add("Daly");
		 club.add("Mealy");
		 club.add("Davis");
		 club.add("Burns");
		 club.add("Zhang");
		 club.add("Yellowstone");
		 club.add("McHale");
		 club.add("Yeung");
		 club.add("Burns");
		 club.add("Garcia");
		 club.add("Chen");
		 club.add("Yu");
		 club.add("Anderson");
		 club.add("Dooley");
		 club.add("Murphy");
		 club.add("Dean");
		 club.add("Bettys");
		 club.add("Gupta");
		 club.add("Chang");
		 System.out.println("HASH TABLE");
		 club.display();
//		 System.out.println();
//		 club.displayLengths();
		 club.remove("Chen");
		 System.out.println("Contains Yu?   " + club.contains("Yu"));
		 System.out.println("Contains Chen?   " + club.contains("Chen"));

//		NameHashTable club = new NameHashTable();
//		club.addInOrder("Aarons");
//		club.addInOrder("Daly");
//		club.addInOrder("Mealy");
//		club.addInOrder("Davis");
//		club.addInOrder("Burns");
//		club.addInOrder("Zhang");
//		club.addInOrder("Yellowstone");
//		club.addInOrder("McHale");
//		club.addInOrder("Yeung");
//		club.addInOrder("Burns");
//		club.addInOrder("Garcia");
//		club.addInOrder("Chen");
//		club.addInOrder("Yu");
//		club.addInOrder("Anderson");
//		club.addInOrder("Dooley");
//		club.addInOrder("Murphy");
//		club.addInOrder("Dean");
//		club.addInOrder("Bettys");
//		club.addInOrder("Gupta");
//		club.addInOrder("Chang");
//
//		club.remove("Yu");
//
//		System.out.println("HASH TABLE");
//		club.display();
//		club.remove("Chen");
//
//		System.out.println("Contains Yu?   " + club.contains("Yu"));
//		System.out.println("Contains Chen?   " + club.contains("Chen"));


	}
}