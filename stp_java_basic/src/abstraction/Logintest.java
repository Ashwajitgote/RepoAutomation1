package abstraction;

public class Logintest extends BaseTest {

	public static void main(String[] args) {
		Logintest l = new Logintest();
		l.Runtest();
		l.Setup();
		l.tearDown();
		l.ashwajit();
	}

	@Override
	public void Runtest() {
System.out.println("enter Run test");		
	}

	@Override
	public void ashwajit() {
System.out.println("ashwajit");		
	}

}
