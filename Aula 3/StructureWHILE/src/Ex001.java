import java.util.Scanner;

public class Ex001 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number");
		Integer number = scan.nextInt();
		
		int counter = 1;
		
		while(counter <= number) {
			
			System.out.println(counter);
			counter++;
			
		}
		
	}

}
