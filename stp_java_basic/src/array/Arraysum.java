package array;

public class Arraysum {

	public static void main(String[] args) {

		// int[] s = { 10, 20, 30, 40, 50 };
	
		int[] s = new int[5];
		s[0] = 10;
		s[1] = 20;
		s[2] = 30;
		s[3] = 40;
		s[4] = 50;

		int sum = 0;

		for (int a : s) {
			sum = sum + a;
		}

		System.out.println("sum of the value is as:" + sum);
	}

}
