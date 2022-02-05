import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//FOR Syntax
		
		String word = "Gray";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choose one of these numbers: 1, 2, 3");
		Integer number = scan.nextInt();
		
		for(int x = number; x <=3; x++) {
			
			switch(x) {
			
			case 1:
				
				word = "Blue";					
			System.out.println(word);
				
			break;
			case 2:
				
				word = "Red";					
				System.out.println(word);
				
				break;
			case 3:
				
				word = "Yellow";					
				System.out.println(word);
				
				break;
			
			}
		
			
		}

	}

}
