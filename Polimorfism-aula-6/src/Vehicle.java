//A abstract class doesn't permit generate objects from itself
//Only secondary classes extended from it
public abstract class Vehicle { 
	
	private String model;
	private String color;
	private boolean status;
	
	public Vehicle() {
		
	}
	public Vehicle(String model, String color, boolean status) {
		super();
		this.model = model;
		this.color = color;
		this.status = status;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}	

	public void speedUp () {
		this.status = true;
		System.out.println("The vehicle is speeding up.");
	}
	public void stop () {
		this.status = false;
		System.out.println("The vehicle stopped.");
	}
	public void showStatus () {
		if(this.status = true) {
			System.out.println("The vehicle is in motion.");
		}else {
			System.out.println("The vehicle is stopped.");
		}
	}
	
}
