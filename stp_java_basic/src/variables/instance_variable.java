package variables;

public class instance_variable {

	int a=5 ;
	// access--- to access instance variable in an instance method directly , we can call in the instance method  
	public void test1 () {
	
	System.out.println(a);
		
	}
	
	public static void name() {
		// to access an instance variable in a static method , we need to create a object 
		instance_variable i = new instance_variable  ();
		
		System.out.println(i.a);
	}
	
	
	
	public static void main(String[] args) {
		name();
		instance_variable i = new instance_variable  ();
        i.test1();
     System.out.println(i.a);
	}

} 
