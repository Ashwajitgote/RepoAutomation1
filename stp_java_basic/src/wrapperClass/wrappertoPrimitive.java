package wrapperClass;

public class wrappertoPrimitive {

	public static void main(String[] args) {
		
		Long l = new Long(500);  // object create (wrapper)
		long p = l.longValue();
		System.out.println(p);
	}

}
