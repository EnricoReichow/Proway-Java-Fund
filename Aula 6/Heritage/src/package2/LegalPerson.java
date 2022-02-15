package package2;

public class LegalPerson extends Person{

	private String cnpj;
	
	public LegalPerson() {
		super();
	}

	public LegalPerson(String cnpj) {
		super();
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public void hire() {
		
		if(getStatus() == true) {
			System.out.println("The company can hire.");
		}else {
			System.out.println("The company cannot hire.");
		}
		
	}
	
	
}
