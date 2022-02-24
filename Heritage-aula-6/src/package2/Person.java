package package2;

public class Person {
	
	private String name;
	private String adress;
	private Boolean status;
	
	public Person() {
		super();
	}

	public Person(String name, String adress, Boolean status) {
		super();
		this.name = name;
		this.adress = adress;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public void compareStatus() {
		if(status == true) {
			System.out.println("The registration of " +this.name+ " is positive.");
		}else {
			System.out.println("The registration of " +this.name+ " is negative.");
		}
	}

}
