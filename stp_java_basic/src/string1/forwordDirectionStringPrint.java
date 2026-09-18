package string1;

public class forwordDirectionStringPrint {

	public static void main(String[] args) {

		String a = "Automation";

		for (int i = 0; i < a.length(); i++) {
			System.out.print(a.charAt(i));
		}

		System.out.println("---------------------");
		
		
		// reverse direction

		for (int i = (a.length() - 1); i >= 0; i--) {
			System.out.print(a.charAt(i));
		}
	}

}
