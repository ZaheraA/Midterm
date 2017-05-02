package datastructure;

import java.util.Iterator;
import java.util.Stack;

public class UseStack {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Stack that includes push,peek,search,pop
		 * elements. Use For Each loop and while loop with Iterator to retrieve
		 * data.
		 * 
		 */

		Stack<String> stack = new Stack<String>();

		stack.push("Gold");
		stack.push("Diamond");
		stack.push("Silver");

		System.out.println("Search: " + stack.search("Diamond"));

		System.out.println("Peek: " + stack.peek());

		System.out.println("For each Loop: ");
		for (String items : stack) {
			System.out.println(items);

		}

		System.out.println("Iterator: ");
		Iterator it = stack.iterator();
		while (it.hasNext()) {

			System.out.println("Peek in iteration: " + stack.peek());
			System.out.println(stack.pop());

		}

	}

}
