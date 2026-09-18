package array;

public class DuplicatesNumber_InArray {

	public static void main(String[] args) {
int a[]= {400,100,400,900,500,300,800,900,800,600,400,300,700,700,700,300,300,300};
int number  = 300 ;
int count =0;

// enhance for loop  
for (int values : a) {
	if (values == number) {
		count ++;}
			
		}
System.out.println(count);
	}

}
	


