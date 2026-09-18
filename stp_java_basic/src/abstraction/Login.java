package abstraction;

public abstract class Login {
     
	//abstract methods
	public abstract void name();
	public abstract void address();
	public abstract void bankdetails();
	
	
	//instance method and static method --- concrete method
	public void persondetails() {
		System.out.println("enter person details");
	}
		
	public static void educationaldetails() {
		System.out.println("enter educational details");
	}
	
	
	public static void main(String[] args) {

	}

}
