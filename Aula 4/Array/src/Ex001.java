import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Integer[] fourNumbers = new Integer[5];
		fourNumbers[0] = 0;
		fourNumbers[1] = 0;
		fourNumbers[2] = 0;     //setting values because that doesn't give an error
		fourNumbers[3] = 0;
		fourNumbers[4] = 0;
//		System.out.println("Inform 4 numbers and see it in your screen");
		/*
		 * fourNumbers[0] = scan.nextInt(); fourNumbers[1] = scan.nextInt();
		 * fourNumbers[2] = scan.nextInt(); fourNumbers[3] = scan.nextInt(); Integer sum
		 * = fourNumbers[0] + fourNumbers[1] + fourNumbers[2] + fourNumbers[3];
		 * 
		 * System.out.println("The sum of the numbers that you typed is: "
		 * +fourNumbers[0]+ " + " +fourNumbers[1]+ " + " +fourNumbers[2]+ " + "
		 * +fourNumbers[3]+ " = " +sum);
		 */

		for (int counter = 1; counter <= 4; counter++) { //from the position 1 to position 4 

			System.out.println("Inform the " + counter + " number:"); //giving different values to counter to the sentence make sense
			fourNumbers[counter] = scan.nextInt(); //scanning the counter position

		}

		Integer sum = fourNumbers[1] + fourNumbers[2] + fourNumbers[3] + fourNumbers[4]; //sum to print in the screen
		System.out.println("The sum is: " + sum);
	}

}
