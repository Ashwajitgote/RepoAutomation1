package array;

public class Multidimensional_allocatingmemory {

	public static void main(String[] args) {

		// by allocating memory
		// row--2--col--3

		int[][] a = new int[2][3];

		// row index --0 to 1 ---outer loop
		// cal --index--0 to 2 ---inner loop

		a[0][0] = 12;
		a[0][1] = 15;
		a[0][2] = 16;

		a[1][0] = 56;
		a[1][1] = 34;
		a[1][2] = 36;

		// nested for loop--outer loop--rows--inner- col

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(a.length);
		System.out.println(a[0][1]);
		System.out.println(a[1][1]);
	}

}
