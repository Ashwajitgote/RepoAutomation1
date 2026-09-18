package array;

public class Arraysum_prac02 {

	public static void main(String[] args) {
		int[] n = new int[4];

		n[0] = 80;
		n[1] = 10;
		n[2] = 65;
		n[3] = 55;

		int sum = 0;
		for (int r : n) {
			sum = sum + r;

		}
		System.out.println(+sum);
	}

}
