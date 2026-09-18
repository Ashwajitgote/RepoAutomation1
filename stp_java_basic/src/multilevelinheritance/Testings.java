package multilevelinheritance;

public class Testings extends Password {

	int q = 90;

	public void functionality() {
		System.out.println("verify functionality");
	}

	public static void main(String[] args) {
		Testings t = new Testings();
		System.out.println(t.a);
		t.username();
		System.out.println(t.f);
		pass();
		System.out.println(t.q);

	}

}
