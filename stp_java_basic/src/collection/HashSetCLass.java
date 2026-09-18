package collection;

import java.util.HashSet;

public class HashSetCLass {

	public static void main(String[] args) {

		HashSet<String> companies = new HashSet<String>();

		companies.add("Wipro");
		companies.add("Wipro");
		companies.add("QK");
		companies.add("Google");
		companies.add("TCS");
		companies.add("Microsoft");
		companies.add("Oracal");
		companies.add("PWC");
		companies.add("Infosys");
		companies.add("Mahindra");

		System.out.println(companies);

		System.out.println(companies.clone());
		System.out.println(companies.contains("Infosys"));
		System.out.println(companies.size());

		companies.remove("PWC");
		System.out.println(companies);

		companies.clear();
		System.out.println(companies);
	}

}
