package singleinheritance;

public class B extends A {

	float f = 23.5f;

	public static void main(String[] args) {

		B r = new B();

		System.out.println(r.f);
		r.test();
		System.out.println(r.a);

	}

}
