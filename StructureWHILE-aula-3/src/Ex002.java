import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number");
		Integer number = scan.nextInt();

		String even = "";
		String odd = "";

		int counter = 1;

		while (counter <= number) {

			if ((counter % 2 == 0)) {

				// The number is even
				even += counter + ",";

			} else {

				// The number is odd
				odd += counter + ",";

			}

			counter++;

		}

		System.out.println("Even number: " + even);
		System.out.println("Odd number: " + odd);

	}

}
