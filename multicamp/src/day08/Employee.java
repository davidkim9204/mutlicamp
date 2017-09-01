package day08;

public class Employee {
	public static int numOfEmployees;
	private String name;
	private int salary;
	private static String COMPANY_NAME = "SAMSUNG";
	public Employee(){
	}
	
	
	public static void work(){
		System.out.println("개같이일을한다");
		System.out.println("개같이일을한다");
		System.out.println("개같이일을한다");
	}
	public static String getCompanyName(){
		return COMPANY_NAME;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
}

