package collection;

import java.util.ArrayList;

public class ArrayListInteger {

	private static final Float Null = null;

	public static void main(String[] args) {

		ArrayList<Float> marks = new ArrayList<Float>();
		marks.add(30.4F);
		marks.add(20.4F);
		marks.add(20.4F);
		marks.add(40.4F);
		marks.add(50.4F);
		marks.add(60.4F);
		marks.add(Null);

		System.out.println(marks);

		System.out.println(marks.clone());
		System.out.println(marks.isEmpty());
		System.out.println(marks.contains(40.4F));

		marks.remove(0);
		System.out.println(marks);
	}

}
