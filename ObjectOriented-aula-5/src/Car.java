
public class Car { //class creation

	//creating attributes
	private String model;
	private String color;
	private String year;
	
	
	//creating a constructor
	public Car() {
						
	}
	
	//creating the methods of the class
	public void speedUp() {
		System.out.println("The car is speeding up");
	}
	
	//creating methods GET and SET
	//GET
	public String getModel() {
		return this.model;
	}
	
	public void setModel (String model) {
		this.model = model;
		
	
	}
	
	public String getColor() {
		return this.color;
		
	}
	
	public void setColor (String color) {
		this.color = color;
		
	}
	
	public String getYear() {
		return this.year;
		
	}
		
	public void setYear(String year) {
		this.year = year;
		
	}
	
	}


