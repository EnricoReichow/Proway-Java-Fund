import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Type a number and see the multiplication table...");
		Integer x = scan.nextInt();
		
		
		for(int counter = 1; counter <= 10; counter++) {
			
			Integer multiplication = x * counter;
			
			System.out.println(x+ " x " +counter+ " = " +multiplication);
			
			
		}
		
	}

}
