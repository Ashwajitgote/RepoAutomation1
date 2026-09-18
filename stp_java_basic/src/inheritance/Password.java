package inheritance;

// is-a-relationship--extend
public class Password extends Username {

	public static void main(String[] args) {
		Password p = new Password();
		System.out.println(p.a);
		p.name();
	}

}
