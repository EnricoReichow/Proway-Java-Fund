
public class Employee {

	private String name;
	private String cpf;
	private Double salary;
	
	public Employee(String name, String cpf, Double salary) {
		this.name = name;
		this.cpf = cpf;
		this.salary = salary;
	}
	
	public Employee() {
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Double getSalary() {
		return this.salary;
	}
	
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public void recieveBonus() {
		this.salary = salary + (salary/10);
	}
	
	public void payPenalty() {
		this.salary = salary - (salary * 0.05);
	}
	
	public void showSalary() {
		
	}
}
