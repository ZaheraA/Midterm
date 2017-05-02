package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool
		 * elements. Use For Each loop and while loop with Iterator to retrieve
		 * data.
		 * 
		 */

		LinkedList<String> list = new LinkedList<String>();
		Queue<String> queue = new LinkedList<String>();

		System.out.println("Before add and offer: " + queue.peek());
		queue.add("House");
		queue.offer("Car");
		queue.add("Phone");

		System.out.println("After add and offer: " + queue.peek());

		// For each loop
		System.out.println("For each Loop: ");
		for (String items : queue) {
			System.out.println(items);
		}

		// Iterator
		System.out.println("Iterator: ");
		Iterator it = queue.iterator();
		while (it.hasNext()) {

			System.out.println(queue.remove());
			System.out.println(queue.poll());
		}

	}

}
