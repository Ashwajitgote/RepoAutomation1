package collection;

import java.util.HashMap;

public class HashMapClass {

	public static void main(String[] args) {

		HashMap<Integer, String> name = new HashMap<Integer, String>();

		name.put(1, "Ashwajit");
		name.put(2, "Riya");
		name.put(3, "Ayush");
		name.put(4, "Sejal");
		name.put(5, "Ashawjit");
		name.put(6, "Vaishali");
		name.put(7, "Rinku");

		System.out.println(name);

		System.out.println(name.clone());
		System.out.println(name.containsKey(5));
		System.out.println(name.containsValue("Riya"));
		System.out.println(name.remove(4, "Sejal"));
		System.out.println(name);

		System.out.println(name.replace(6, "Manual"));
		name.clear();
		System.out.println(name);

	}

}
