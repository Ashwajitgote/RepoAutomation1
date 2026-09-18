package default_values;

import java.sql.Array;

public class default_values_datatypes {
	// integer
	int i;
	short s;
	long l;
	byte b  = 8 ;
	
	//floating
	float f ;
	double d ;
	
	//non numeric
	char c ;
	boolean b1 ; 
	
	// non primitive
	String v;
	Array [] [] w;
	
	
	public static void main(String[] args) {
		
		default_values_datatypes g = new default_values_datatypes(); 
       
		System.out.println("the default value byte as:"+g.b);
		System.out.println("the default value short as:"+g.s);
		System.out.println("the default value int as:"+g.i);
		System.out.println("the default value long as:"+g.l);
		
		System.out.println("floating_datatypes");
		System.out.println("the defaults value of floate as:"+g.f);
		System.out.println("the defaults value of double as:"+g.d);
		
		System.out.println("the defaults value of char as:"+g.c);
		System.out.println("the defaults value of boolean as:"+g.b1);
		
		System.out.println("the defaults value of string as:"+g.v);
		System.out.println("the default value of Array as:"+g.w);
	}

}
