
public class Car extends Vehicle {

	private String Year;
	
	public Car () {
		
	}

	public Car(String year) {
		super();
		Year = year;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}
		
	public void stop () {
		this.setStatus(false);
		System.out.println("The car stopped.");
	}
	
}
