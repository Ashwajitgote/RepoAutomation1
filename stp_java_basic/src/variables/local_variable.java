package variables;

public class local_variable {

	static int e = 67 ;
			
	static float f = 34.2f ; 
	
	public static void name1() {
		String g = "automation" ;
		System.out.println(g);	
		System.out.println(f);
		
	}
	
	public static void name2() {
		char c = 's' ;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		name1();
           name2();
System.out.println(local_variable.e);
	}

}
