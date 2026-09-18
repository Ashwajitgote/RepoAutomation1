package collection;

import java.util.Iterator;

public class LinkedHashSet {

	public static void main(String[] args) {

		java.util.LinkedHashSet<Integer> Emp_id = new java.util.LinkedHashSet<Integer>();

		Emp_id.add(3000);
		Emp_id.add(200);
		Emp_id.add(null);
		Emp_id.add(50);
		Emp_id.add(10);
		Emp_id.add(30);
		Emp_id.add(40);
		Emp_id.add(50);
		Emp_id.add(100);
		Emp_id.add(60);
		Emp_id.add(70);
		Emp_id.add(null);

		System.out.println(Emp_id);

		Iterator<Integer> i = Emp_id.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
