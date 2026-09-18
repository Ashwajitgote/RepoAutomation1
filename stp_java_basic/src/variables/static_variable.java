package variables;

public class static_variable {

	static int a = 100 ;
	// access-- static variable we can directly call into static method and instance method 
	
	public void name1() {
		System.out.println(a);
	}
	
	public static void name2() {
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
	
      name2();
      static_variable i = new static_variable () ;
      
      i.name1();
      System.out.println(a);
	}

}
