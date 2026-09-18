package methods;

public class Bothmethods {

	public void test1() {
		System.out.println("instant method_1");
	}
	
	public static void test2() {
		System.out.println("static method_2");
	}
	
	public void test3() {
		System.out.println("instant method_3");
	}
	
	public static void test4() {
		System.out.println("static method_4");
	}
	
	public static void main(String[] args) {
		
		//create object 
		
		Bothmethods b=new Bothmethods (); 
        b.test1();
        b.test3();
        test2();
        test4();
	}

}
