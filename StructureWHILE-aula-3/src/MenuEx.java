import java.util.Scanner;

public class MenuEx {

	public static void main(String[] args) {

		Scanner scan = new Scanner (System.in);
		
		Integer number = 1;
		int counter = 0;
		
		while (number != 0) {
			
			System.out.println("Choose a number: 1, 2 or 3 and 0 to exit:");
			
			number = scan.nextInt();
			
			switch(number) {
			
			case 0:
				System.out.println("Exit");
				break;
			case 1:
				System.out.println("Blue");
				break;
			case 2:
				System.out.println("Apple");
				break;
			case 3:
				System.out.println("Mustang");
				break;
			default:
				System.out.println("Invalid Option");
				break;
				
				
			}	
				
		}
		
	}

}
