package array;

public class D2without_allocatingmemory {

	public static void main(String[] args) {

		int[][] a = { { 2, 4 }, { 9, 7 }, { 5, 3 } };
		// nested for loop - row 0 to 2 -- col 0 to 3

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("----------------------");

		System.out.println(a.length);
	}

}
