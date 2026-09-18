package methods;

public class instant_method {
// package second_package;
//syntax-- test
	public void test () {
		System.out.println("Instance method");
	    int a= 8 ;
		System.out.println(a);
	
	}
	
	public void test2() {
		String h = "automation" ;
		System.out.println(h) ;
		
		float f= 32.2f; 
	System.out.println(f);
	
	}	
	
	
	public static void main(String[] args) {
		//
		
		instant_method i= new instant_method () ;
		i.test();
	    i.test2();
	}

}