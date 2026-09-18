package wrapperClass;

public class PrimitivetoWrapper {

	public static void main(String[] args) {

		int a = 40;
		Integer y = Integer.valueOf(a);
		System.out.println(y);

		System.out.println("----------------------");

		short b = 55;
		Short h = Short.valueOf(b);
		System.out.println(h);

		System.out.println("----------------------");

		float d = 60.2f;
		Float f = Float.valueOf(d);
		System.out.println(f);

		System.out.println("----------------------");

		double j = 80.89;
		Double k = Double.valueOf(j);
		System.out.println(k);

		System.out.println("----------------------");

		char m = 'S';
		Character t = Character.valueOf(m);
		System.out.println(t);

	}

}
