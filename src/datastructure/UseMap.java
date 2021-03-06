package datastructure;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving
		 * elements. Add List<String> into a Map. Like, Map<String,
		 * List<string>> list = new HashMap<String, List<String>>(); Use For
		 * Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve
		 * data.
		 */

		Map<String, String> materialList = new LinkedHashMap<String, String>();
		materialList.put("House", "Wood");
		materialList.put("Phone", "Plastic");
		materialList.put("Shirt", "Cloth");

		System.out.println("For Each loop: ");
		for (Map.Entry<String, String> map : materialList.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
		}

		System.out.println("Iterator: ");
		Iterator it = materialList.entrySet().iterator();
		while (it.hasNext()) {

			System.out.println(materialList);

			break;

		}

	}

}
