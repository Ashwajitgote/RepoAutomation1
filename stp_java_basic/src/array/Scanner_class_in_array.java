package array;

import java.util.Arrays;
import java.util.Scanner;

public class Scanner_class_in_array {

	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc  = new Scanner(System.in);
// for loop 
		for (int i = 0; i < 5; i++) {
			System.out.println("enter vallues of index :" + i);
			a[i] = sc.nextInt();

		}
		System.out.println("printing of an array as :" + Arrays.toString(a));
	}

}
