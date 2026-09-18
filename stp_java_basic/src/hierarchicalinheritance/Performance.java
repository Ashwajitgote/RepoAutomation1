package hierarchicalinheritance;

public class Performance extends Functional {
String p = "load testing";
public static void secmodule() {
	System.out.println("enter load testing details");
}
	public static void main(String[] args) {
		Performance p1= new Performance();
				System.out.println(p1.s);
						p1.Test2();
				secmodule();
				System.out.println(p1.p);
	}

}
