package collection;

import java.util.LinkedList;

public class LinkedListInterface {

	public static void main(String[] args) {

		LinkedList<String> Domain = new LinkedList<String>();
		Domain.add(0, "Healthcare");
		Domain.add(1, "banking");
		Domain.add(2, "Ecommerce");
		Domain.add(3, "ERP");
		Domain.add(4, "Property management");
		Domain.add(5, "LOS");
		Domain.add(6, "LMS");
		Domain.add(7, "Telecom");
		Domain.add(8, "Telecom");
		Domain.add(9, "Null");
		System.out.println(Domain);

		System.out.println(Domain.clone());
		System.out.println(Domain.getFirst());
		System.out.println(Domain.getLast());
		System.out.println(Domain);

		Domain.remove(4);
		System.out.println(Domain);
	}

}
