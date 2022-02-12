import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inform 2 numbers");
		System.out.println("The first: ");
		Integer a = scan.nextInt();
		System.out.println("Now the second: ");
		Integer b = scan.nextInt();
		
		Calculator calculator = new Calculator();
		
		Integer resultSum = calculator.sum(a, b);
		Integer resultSubtraction = calculator.subtraction(a, b);
		Integer resultDivision = calculator.division(a, b);
		Integer resultMultiplication = calculator.multiplication(a, b);
		
		System.out.println("Sum = " +resultSum);
		System.out.println("Subtraction= " +resultSubtraction);
		System.out.println("Division = " +resultDivision);
		System.out.println("Multiplication = " +resultMultiplication);
		
		
		

	}

}
