
public class Airplane extends Vehicle {

	private String airline;
	
	public Airplane() {
		
	}

	public Airplane(String airline) {
		super();
		this.airline = airline;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}		
	
}
