package constructor;

public class UserDefinedConstructor {
public UserDefinedConstructor () {
System.out.println("it is a user defined constructor");	
}
public void login () {
	System.out.println("login functionality");
}
	public static void main(String[] args) {
		UserDefinedConstructor p= new UserDefinedConstructor();
	p.login();
		}
	}

