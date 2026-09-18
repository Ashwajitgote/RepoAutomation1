package nested_loop;

public class Ex1 {

	public static void main(String[] args) {
		
		//1st-outer loop - raws - 1 to 4
		//2nd-inner loop - column- 1-3
		
		for (int a = 1; a <= 4; a++) {
			System.out.print("value of outer loop as:"+a);
			System.out.println();
			
			for (int b = 1; b <= 3; b++) {
				System.out.print(b);
				System.out.println();
			}
		}

	}

}
