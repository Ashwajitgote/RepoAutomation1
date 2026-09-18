package jumpingStatements;

public class Break_statement {

	public static void main(String[] args) {

		// 1 to 10
		// break key word in for loop

		for (int a = 1; a <= 10; a++) {
			System.out.println(a);
			if (a == 5) {
				break;
			}
		}

		System.out.println();
		System.out.println("------break keyword in while loop------");

		// 10 to 1
		int b = 10;
		while (b >= 1) {
			System.out.print(b + "  ");
			if (b == 6) {
				break;
			}
			b--;
		}

		// 1 to 10
		System.out.println();
		System.out.println("----break keyword in dowhile loop----");

		int c = 1;
		do {
			System.out.print(c + " ");
			if (c == 7) {
				break;
			}
			c++;
		} while (c <= 10);

	}

}
