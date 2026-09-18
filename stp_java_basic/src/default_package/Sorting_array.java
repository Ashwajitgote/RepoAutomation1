package default_package;

import java.util.Arrays;

public class Sorting_array {

	public static void main(String[] args) {

		int a[] = { 1000, 500, 800, 600, 900, 200 };

		System.out.println("before sorting---------");
		System.out.println(Arrays.toString(a));

		Arrays.sort(a);
		System.out.println("after sorting-------------");
		System.out.println(Arrays.toString(a));
	}
}
