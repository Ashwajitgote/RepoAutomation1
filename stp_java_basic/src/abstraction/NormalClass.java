package abstraction;

public class NormalClass extends A {
	

	public static void main(String[] args) {
		NormalClass n = new NormalClass ();
		n.add();
		n.sub();
		n.verify();
	}

	@Override
	public void verify() {
System.out.println("verify");		
	}

	@Override
	public void add() {
System.out.println("add");		
	}

	@Override
	public void sub() {
System.out.println("sub");		
	}

}
