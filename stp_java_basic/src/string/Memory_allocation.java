package string;

public class Memory_allocation {

	//by literal way
	String s = "Automation";
	
	//using new keyword
	String s1 = new String ("Automation");
		
	public static void main(String[] args) {
		
		System.out.println("memory allocation s and s1 will be in SCP area of HCP: s=s1=automation");
		
		System.out.println("memory allocation s and s1 will be in SCP area of HCP: s2= manual");
		

	}

}
