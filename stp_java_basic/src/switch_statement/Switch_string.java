package switch_statement;

public class Switch_string {

	public static void main(String[] args) {

		String month_name = "jan";

		switch (month_name) {

		case "jan":
			System.out.println("month number is as:" + 1);
			break;
		case "feb":
			System.out.println("month number is as:" + 2);
			break;
		case "mar":
			System.out.println("month number is as:" + 3);
			break;
		case "apr":
			System.out.println("month number is as:" + 4);
			break;
		case "may":
			System.out.println("month number is as:" + 5);
			break;
		case "jun":
			System.out.println("month number is as:" + 6);
			break;
		case "july":
			System.out.println("month number is as:" + 7);
			break;
		case "aug":
			System.out.println("month number is as:" + 8);
			break;
		case "sept":
			System.out.println("month number is as:" + 9);
			break;
		case "oct":
			System.out.println("month number is as:" + 10);
			break;
		case "nav":
			System.out.println("month number is as:" + 11);
			break;
		case "dec":
			System.out.println("month number is as:" + 12);
			break;

		default:
			System.out.println("invalid month number");
			break;

		}

	}

}
