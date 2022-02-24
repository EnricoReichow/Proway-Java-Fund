
public class Main {

	public static void main(String[] args) {
		
		Car car = new Car();
		
		car.setAno("2021");
		car.setColor("Black");
		car.setStopped(false);
		car.setModel("Tesla");
		
		car.stop();
		car.speedUp();
		car.isStopped();
		
		
	}

}
