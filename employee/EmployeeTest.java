public class EmployeeTest {
	
	public static void printEmployeeInfo(Employee e) {
		System.out.printf("O salário anual de %s é: R$ %,.2f.\n", e.getFirstName(), e.getSalary());
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("José", "Silva", 30000);
		Employee e2 = new Employee("João", "Ninguém", 20000);
		
		printEmployeeInfo(e1);
		printEmployeeInfo(e2);
		
		e1.setSalary(-1);
		printEmployeeInfo(e1);
		
		e1.setSalary(e1.getSalary() * 1.10);
		e2.setSalary(e2.getSalary() * 1.10);
		printEmployeeInfo(e1);
		printEmployeeInfo(e2);
	}
}