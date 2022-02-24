
public class Ex002 {

	public static void main(String[] args) {

		String[] cars = {"ONIX", "GOL", "TESLA", "UNO", "MUSTANG"};
		String[] colors = {"blue", "white", "black"};
		
		/*
		 * System.out.println("I bought a " +cars[0]+ " and the color is "
		 * +colors[0]);
		 * System.out.println("-------------------------------------------------");
		 * System.out.println("I bought a " +cars[1]+ " and the color is "
		 * +colors[1]);
		 * System.out.println("-------------------------------------------------");
		 * System.out.println("I bought a " +cars[2]+ " and the color is "
		 * +colors[2]);
		 * System.out.println("-------------------------------------------------");
		 * System.out.println("I bought a " +cars[3]+ " and the color is "
		 * +colors[0]);
		 * System.out.println("-------------------------------------------------");
		 * System.out.println("I bought a " +cars[4]+ " and the color is "
		 * +colors[1]);
		 * System.out.println("-------------------------------------------------");
		 * System.out.println("And now I don't have any money :( ");
		 */
		
		for(int counterCar = 0; counterCar < cars.length; counterCar++) {
			
			for(int counterColor = 0; counterColor < colors.length; counterColor++) {
				System.out.println("I bought a car " +cars[counterCar]+ " and the color is " +colors[counterColor]);
				
			}

		}
				
	}

}
