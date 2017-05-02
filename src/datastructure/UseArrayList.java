package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes
		 * add,peek,remove,retrieve elements. Use For Each loop and while loop
		 * with Iterator to retrieve data. Store all the sorted data into one of
		 * the databases.
		 * 
		 */

		ArrayList<String> phones = new ArrayList<String>();
		phones.add("iPhone");
		phones.add("Samsung");
		phones.add("Nexus");
		System.out.println("Display array: " + phones);
		phones.remove("Nexus");
		System.out.println("Display arrayafter remove: " + phones);
		System.out.println("For each Loop: ");
		for (String items : phones) {
			System.out.println(items);

		}

		System.out.println("Iterator: ");
		Iterator it = phones.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
