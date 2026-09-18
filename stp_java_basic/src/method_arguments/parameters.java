package method_arguments;

public class parameters {

	int a ;
	byte t;
	String y ;
	char u ;
	static float f;
	
	public void test1(int b,int i ,String l, char z ) {
		a=b;
		t=(byte) i;
		y=l;
		u=z;
		System.out.println(a);
		System.out.println(t);
		System.out.println(y);
		System.out.println(u);
	}
	
	public static void test2(float r) {
	f=r;
		System.out.println(f);
		
		//parameters p=new parameters();
		//System.out.println(p.a);
		
	}
	
	public static void main(String[] args) {
		test2(20.4f);
		parameters p = new parameters ();
     p.test1(35,10, "automation" , 's');
	}

}
