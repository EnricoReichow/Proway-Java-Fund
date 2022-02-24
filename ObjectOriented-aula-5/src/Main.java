import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		//creating an object of the class Car
		//Car - the class identification to create the object
		//car - the name of the object
		//new - new object creating
		//Car - empty constructor of the class Car
		Car car = new Car();
		
		car.speedUp();//pulling the method to the main class
		
		car.getModel();
		
		System.out.println("What is you car model?");
		String userModel = scan.next();
		car.setModel(userModel);
		
		System.out.println("What is your car color?");
		String userColor = scan.next();
		car.setColor(userColor);
		
		System.out.println("What is your car year of fabrication");
		String userYear = scan.next();
		car.setYear(userYear);
		
		System.out.println("//-----//-----//-----//-----");
		System.out.println("Car Informations:");
		System.out.println("The model of your car is: " + car.getModel());
		System.out.println("-----------------------------------");
		System.out.println("The color is: " + car.getColor());
		System.out.println("-----------------------------------");
		System.out.println("The year of fabrication is: " + car.getYear());
		System.out.println("-----------------------------------");
		
		
	}

}
