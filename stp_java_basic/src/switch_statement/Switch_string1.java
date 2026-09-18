package switch_statement;

public class Switch_string1 {

	public static void main(String[] args) {

		String day_name = "sunday";

		switch (day_name) {

		case "monday":
			System.out.println("day number is as:" + 1);
			break;
		case "tuesday":
			System.out.println("day number is as:" + 2);
			break;
		case "wednesday":
			System.out.println("day number is as:" + 3);
			break;
		case "thursday":
			System.out.println("day number is as:" + 4);
			break;
		case "friday":
			System.out.println("day number is as:" + 5);
			break;
		case "saturday":
			System.out.println("day number is as:" + 6);
			break;
		case "sunday":
			System.out.println("day number is as:" + 7);
			break;

		default:
			System.out.println("invalid day number");
			break;

		}

	}

}
