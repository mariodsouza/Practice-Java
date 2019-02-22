package practise;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Item1");
		linkedlist.add("Item5");
		linkedlist.add("Item3");
		linkedlist.add("Item6");
		linkedlist.add("Item2");
		
		System.out.println(linkedlist);
		
		Collections.sort(linkedlist);
		System.out.println(linkedlist);
		
		System.out.println(linkedlist.get(1));

	}

}
