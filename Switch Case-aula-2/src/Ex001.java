import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {

		Scanner entry = new Scanner(System.in);

		System.out.println("Choose one of these number and see what month it represents: 2, 7, 11");
		Integer month = entry.nextInt();

		switch (month) {

		case 2:
			System.out.println("February");
			break;
		case 7:
			System.out.println("July");
			break;
		case 11:
			System.out.println("November");
			break;
		default:
			System.out.println("Invalid number");
			break;
			
		}

	}

}
