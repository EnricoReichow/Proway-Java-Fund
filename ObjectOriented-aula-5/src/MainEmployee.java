
public class MainEmployee {

	public static void main(String[] args) {

Employee employee = new Employee();
		
		Employee employee2 = new Employee("Roberth", "999.999.999-99", 3299.99);
		
		employee.setName("Enrico");
		employee.setCpf("333.333.333-33");
		employee.setSalary(5500.55);
		
		System.out.println("The first employee name is " +employee.getName()+ " carrier of the CPF " +employee.getCpf()+ " and who recieves " +employee.getSalary()+ " of salary");
		System.out.println("//---//---//---//---//");
		System.out.println("The first employee name is " +employee2.getName()+ " carrier of the CPF " +employee2.getCpf()+ " and who recieves " +employee2.getSalary()+ " of salary");
	
		System.out.println("---------");
		employee.recieveBonus();
		System.out.println("The salary with the bonus of the employee " +employee.getName()+ " is " +employee.getSalary());
		
		System.out.println("---------");
		employee2.recieveBonus();
		System.out.println("The salary with the bonus of the employee " +employee2.getName()+ " is " +employee2.getSalary());

		System.out.println("---------");
		employee.payPenalty();
		System.out.println("The salary of the employee " +employee.getName()+ " with the penalty is: " +employee.getSalary());
		
		System.out.println("---------");
		employee2.payPenalty();
		System.out.println("The salary of the employee " +employee2.getName()+ " with the penalty is: " +employee2.getSalary());
		
		
	}

}
