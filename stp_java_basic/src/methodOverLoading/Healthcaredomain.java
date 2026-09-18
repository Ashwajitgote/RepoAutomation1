package methodOverLoading;

public class Healthcaredomain {

	public void test1(int c, float f) {
		System.out.println("enter multiple parameter");
	}

	public void test1(int a) {
		System.out.println("enter integer parameter");
	}

	public void test1(double b) {
		System.out.println("enter double parameter");
	}

	public void test1(String g) {
		System.out.println("enter string parameter");
	}

	public void test1() {
		System.out.println("enter no parameter");
	}

	public static void main(String[] args) {
		Healthcaredomain v = new Healthcaredomain();
		v.test1();
		v.test1(23.3);
		v.test1(14);
		v.test1("ashwajit");
		v.test1(25, 35.2f);

	}

}
