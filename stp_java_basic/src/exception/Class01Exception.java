package exception;

public class Class01Exception {

	public static void main(String[] args){
try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	e.printStackTrace();
}
	}

}
