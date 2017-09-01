package day07;

public class EmployeeTest {
	public static void main(String[] args) {
		Salary sal = new Salary(150,10);
		Employee e1 = new Employee();
		e1.setName("Hong");
		e1.setSalary(sal);
		e1.setPosition("알바");
		
		sal.setBasicFee(100);
		sal.setCommission(5);
		Employee e2 = new Employee("Kim", sal, "알바2");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(sal);
	}
}
