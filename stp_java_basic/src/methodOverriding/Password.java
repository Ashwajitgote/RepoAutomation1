package methodOverriding;

public class Password {

	public void functional() {
		System.out.println("functional method from child class");
	}

	public void QDE() {
		System.out.println("QDE method from child class");
	}

	public static void name() {
		System.out.println("static method from child class");
	}

	public static void main(String[] args) {
//is a relationship - create object of child class
		Password p = new Password();
		p.functional();
		p.QDE();
		name();

		//
		Username u = new Username();
		u.functional();
		u.QDE();
		name();

		// has a relationship - create object of child class
		Username p1 = new Username();
		p1.functional();
		p1.QDE();
		name();

	}

}
