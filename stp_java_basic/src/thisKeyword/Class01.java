package thisKeyword;

public class Class01 {

	int a=15;
	float f = 20.4f;
	static String s = "ashwajit";
	
	public void name () {
		System.out.println("instance method");
	}
	
	public Class01() {
		System.out.println(this.a);
		System.out.println(this.f);
		System.out.println(this.s);
		this.name();
		System.out.println("user defined constructor");
	}
	
	
public static void main(String[] args) {
	Class01 c=new Class01 ();
	}

}
