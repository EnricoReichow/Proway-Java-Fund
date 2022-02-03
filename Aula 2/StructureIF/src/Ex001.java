import java.util.Scanner;

public class Ex001 {
	
	public static void main (String[] args) {
		
		Scanner entry = new Scanner (System.in);
		System.out.println("Inform your age:");
		
		Integer age = entry.nextInt();
		
		if(age >= 18) {
			
			System.out.println("Your are above the minimum age!");
			
		}else {
			
			System.out.println("You are under the minimum age!");
			
		}
		
		Integer a = 140;
		Integer b = 25;
		
		//if(a==b) {
			//System.out.println("Equal");	
		//}else if (a > b) {
			//System.out.println("Higher");
		//}else if (a < b) {
			//System.out.println("Menor");
		//}
		
		

	};
	

	

}
