package package2;

public class PhysicalPerson extends Person{

	private String cpf;
	private Integer age;
	
	public PhysicalPerson() {
		super();
	}

	public PhysicalPerson(String cpf, Integer age) {
		super();
		this.cpf = cpf;
		this.age = age;
	}
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void findJob() {
		
	}
	
	
}
