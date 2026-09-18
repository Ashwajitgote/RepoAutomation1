package encapsulation;

public class DataHidden {

	private int pin_code = 8016;

	private void password(int a) {
		pin_code = a;
		System.out.println(a);
	}

	public static void main(String[] args) {
		DataHidden d = new DataHidden();
		d.password(1007);
	}

}
