package operators;

public class logical_operator {

	public static void main(String[] args) {
		//logical-and--&&
		//logical-or--||
		//logical-not-- !
		
		//logical and && 
		
		// T    T---F 
        // T    F---F
        // F    T---F
        // F    F---F
        
        //logical or ||
		
		// T   T---T 
		// T   F---T 
		// F   T---T
		// F   F---F 
		
		//logical not !
		
		// T---F
		// F---T
		
		//logical and &&
		
		int a =9;
		int b =7;
		
		boolean c= a>b && b<a; 
		System.out.println(c);
		
		boolean d= a>b && b>a;
		System.out.println(d);
		
		boolean e = a<b && b>a ;
		System.out.println(e);
		
		boolean f = a<b && a>b;
		System.out.println(f);
		
		//logical 
	}

}
