package interface01;

public class NormalClass implements Username_interface {
	
	public static void main(String[] args) {
		NormalClass n = new NormalClass();
		n.name();
		n.name2();
		// we can not access static method from interface in normal class
		// n.name3();

		// but we get it this type of method
		// Classname.methodname();
		Username_interface.name3();
	
		
	}

	@Override
	public void name() {
		System.out.println("this is the name method from Username_interface");
	}

	@Override
	public void name2() {
		System.out.println("this is the name2 method from Username_interface");
	}

}















