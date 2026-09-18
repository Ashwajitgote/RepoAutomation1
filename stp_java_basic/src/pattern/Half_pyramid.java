package pattern;

public class Half_pyramid {

	public static void main(String[] args) {

		// row -- outer loop --1 to 4
		// col -- inner loop -- with respect to rows

		for (int a = 1; a <= 4; a++) {
			for (int b = 1; b <= a; b++) {
				// System.out.print(" *");
				System.out.print(a);
			}

			System.out.println();
		}

		// practice

		System.out.println("----------------");

		for (int c = 10; c <= 15; c++) {
			for (int d = 10; d <= c; d++) {
				System.out.print(c);
			}
			System.out.println();
		}
	
		System.out.println("----------------");
		for (int e=20; e<=25;e++) {
			for(int r=20;r<=e;r++) {
				System.out.print(e);
			}
			System.out.println();
		}
			}
		}
	
