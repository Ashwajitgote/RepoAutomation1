package constructor;

public class ParameterizedConstructor {
	public ParameterizedConstructor(int a, float f, String g) {
		System.out.println("it is Parameterized Constructor");
		System.out.println("value of a is:" + a);
		System.out.println("value of f is:" + f);
		System.out.println("value of g is:" + g);
	}

	public static void main(String[] args) {
		ParameterizedConstructor p = new ParameterizedConstructor(45, 50.5f, "ashwajit");
	}

}
