package array;

public class SingleDstring {

	public static void main(String[] args) {

		String[] name = new String[7];

		name[0] = "rohit";
		name[1] = "nidhi";
		name[2] = "atish";
		name[3] = "savi";
		name[4] = "ashwajit";
		name[5] = "riya";
		name[6] = "vaishali";

		// for each
		for (String k : name) {
			System.out.println(k);
		}

		System.out.println("------------");

		System.out.println("the length of is:" + name.length);

		System.out.println("the value index is :" + name[6]);

		System.out.println("-----------------");

		// for loop

		for (int m = 0; m < 7; m++) {
			System.out.println(name[m]);

		}

	}

}
