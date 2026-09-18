package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatetimeSystem {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d.toString());
		
		System.out.println("-------------------------------------");
		
		SimpleDateFormat s1 = new SimpleDateFormat ();
		System.out.println(s1.format(d));
		

		
	}

}
