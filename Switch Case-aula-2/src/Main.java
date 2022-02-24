
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner entry = new Scanner(System.in);
		
		System.out.println("Choose a fruit: apple/banana/watermelon");
		String fruit = entry.next();
		
		switch(fruit) {
		
		case "banana":
		System.out.println("Looks like you love bananas.");
		break;
		
		case "apple":
			System.out.println("Look like you like apple or you are a IOS fan");
		break;
		
		case "watermelon":
			System.out.println("I guess that you are a Harry Styles Fan");
		break;
			
		default:
			System.out.println("I think that's not a fruit that you can choose");
		break;
		
		}
		

	}

}
