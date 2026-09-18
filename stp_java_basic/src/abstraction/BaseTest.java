package abstraction;

public abstract class BaseTest {

	
	public abstract void Runtest();
	public abstract void ashwajit();
		
	
	public void Setup() {
		System.out.println("Launching Browser and opening URL...");
	}
	
	public static void tearDown() {
		System.out.println("Closing Browser and clearing sessions...");
	}
	public static void main(String[] args) {

	}

}
