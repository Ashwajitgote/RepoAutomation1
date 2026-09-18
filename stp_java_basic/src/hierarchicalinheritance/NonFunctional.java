package hierarchicalinheritance;

public class NonFunctional extends Functional {
double d = 89.9;
public void data() {
	System.out.println("enter data");
}
	public static void main(String[] args) {
		NonFunctional n = new NonFunctional ();
		System.out.println(n.s);
		n.Test2();
		System.out.println(n.d);
		n.data();
	}

}
