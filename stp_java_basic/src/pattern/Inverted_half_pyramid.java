package pattern;

public class Inverted_half_pyramid {

	public static void main(String[] args) {
		
		// outer loop -- 4 to 1 -- rows
		// inner loop -- with respect to rows
		
		for (int a = 4 ; a >= 1 ; a--) {
			for (int b = 1 ; b <= a ; b++) {
				System.out.print(" *");
			}
			
			System.out.println();
		}

	}

}
