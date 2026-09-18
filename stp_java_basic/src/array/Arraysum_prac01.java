package array;

public class Arraysum_prac01 {

	public static void main(String[] args) {
//int a [] = { 10,15,25,65,45,85};
	
		int[] a = new int[6];
		
		a[0] = 10;
		a[1] = 15;
		a[2] = 25;
		a[3] = 65;
		a[4] = 45;
		a[5] = 85;

		int sum = 0;
		for (int e : a) {
			sum = sum + e;
		}
		
		System.out.println(+sum);
	}

}
