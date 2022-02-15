
public class Vehicle {
	
	private String model;
	private String color;
	private Boolean stopped;
	
	public Vehicle() {
		
	}
	
	public Vehicle(String model, String color, Boolean stopped) {
		this.model = model;
		this.color = color;
		this.stopped = stopped;
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

	public Boolean getStopped() {
		return stopped;
	}

	public void setStopped(Boolean stopped) {
		this.stopped = stopped;
	}
	
	public void speedUp() {
		this.stopped = true;
	}
	public void stop() {
		this.stopped = false;
	}
	public void isStopped() {
		if(stopped == true) {
			System.out.println("The car is in motion!");
		}else {
			System.out.println("The car is stopped!");
		}
	}
	
	
}
