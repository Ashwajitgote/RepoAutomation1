package array;

public class Single_dimensional {

	public static void main(String[] args) {

		// integer number - 1 d - by allocating memory

		int[] a = new int[5];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;

		// for each loop
		for (int i : a) {
			System.out.println(i);

		}

		System.out.println("------------------");

		// for loop

		for (int j = 0; j < 5; j++) {
			System.out.println(a[j]);
		}

		System.out.println("the length of aaray is:" +a.length);
		
		System.out.println("the value index is 3 as:"+a[3]);
		
	}
}
