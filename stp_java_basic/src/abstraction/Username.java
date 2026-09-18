package abstraction;

public class Username extends Login {

	public static void main(String[] args) {
		Username q = new Username();
		q.name();
		q.address();
		q.bankdetails();
		q.persondetails();
		educationaldetails();

	}

	@Override
	public void name() {
		System.out.println("enter name");
	}

	@Override
	public void address() {
		System.out.println("enter address");
	}

	@Override
	public void bankdetails() {
		System.out.println("enter bank details ");
	}

}
