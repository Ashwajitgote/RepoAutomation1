package string1;

public class String_methods {

	public static void main(String[] args) {

		String s = "Automation";
		String s1 = "";

		// isEmpty
		s.isEmpty();
		System.out.println(s.isEmpty());
		System.out.println(s1.isEmpty());

		// length
		// length start from 1
		s.length();
		System.out.println(s.length());
		System.out.println(s1.length());

		// index of char
		// index of string start from 0
		s.indexOf(0);
		System.out.println(s.indexOf("m"));
		System.out.println(s.indexOf("t"));
		System.out.println(s.indexOf("n"));

		// index of int and char
		s.indexOf(0, 0);
		System.out.println("index of o:" + s.indexOf('o', 3));
		System.out.println("index of m:" + s.indexOf('m', 1));

		// index of beginIndex ,endIndex
		s.indexOf(0, 0, 0);
		System.out.println(s.indexOf('t', 2, 6));

		// replace
		s.replace('A', 'a');
		System.out.println(s.replace('A', 'a'));

		// char at
		System.out.println(s.charAt(9));

		// toLowecase

		System.out.println(s.toLowerCase());

	}

}
