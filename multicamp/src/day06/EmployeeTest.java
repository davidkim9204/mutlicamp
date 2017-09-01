package day06;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e);
		e.setName("Hong");
		e.setSalary(1000);
		e.setPosition("알바");
		System.out.println(e);
	}
}
