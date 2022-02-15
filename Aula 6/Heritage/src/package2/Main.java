package package2;

public class Main {

	public static void main(String[] args) {

		PhysicalPerson physical = new PhysicalPerson();
		
		physical.setName("Carlos");
		physical.setCpf("444.444.444-44");
		physical.setStatus(true);
		physical.setAdress("Apple Avenue, 33");
		physical.setAge(22);
		
		LegalPerson legal = new LegalPerson();
		
		legal.setName("Twitter");
		legal.setCnpj("19.499/9999-50");
		legal.setAdress("Bird Avenue, 77");
		legal.setStatus(false);

		legal.compareStatus();
		legal.hire();
		
	}

}
