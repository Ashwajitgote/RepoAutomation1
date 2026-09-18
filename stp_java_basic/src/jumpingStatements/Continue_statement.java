package jumpingStatements;

public class Continue_statement {

	public static void main(String[] args) {
		// 1 to 10

		for (int a = 1; a <= 10; a++) {
			if (a == 5) {
				continue;
			}
			System.out.print(a + " ");
		}

		System.out.println();
		System.out.println("---using while---");
		// 10 to 5

		int b = 10;
		while (b >= 5) {
			b--;
			if (b == 7) {
				continue;
			}
			System.out.print(b + " ");

		}

	}

}
