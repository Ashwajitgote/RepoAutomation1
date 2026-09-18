package multilevelinheritance;

public class Password extends Login {

	float f = 56.6f;

	public static void pass() {
		System.out.println("enter password");
	}

	public static void main(String[] args) {
		Password v = new Password();
		System.out.println(v.a);
		v.username();
		System.out.println(v.f);
		pass();
	}

}
