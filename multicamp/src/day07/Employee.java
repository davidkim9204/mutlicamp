package day07;

public class Employee {
	private String name;
	private Salary salary;
	private String position;
	public Employee(){
		name = "noname";
		salary = new Salary();
		position = "인턴";
	}
	public Employee(String name, Salary salary, String position){
		this.name = name;
		int basicFee = salary.getBasicFee();
		int commission = salary.getCommission();
		this.salary = new Salary(basicFee, commission);
		
		this.position = position;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Salary getSalary() {
		return salary;
	}
	public void setSalary(Salary salary) {
//		this.salary = salary;
		int basicFee = salary.getBasicFee();
		int commission = salary.getCommission();
		this.salary.setBasicFee(basicFee);
		this.salary.setCommission(commission);
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name 
				+ ", salary=" + salary.getSalary()
				+ ", position=" + position + "]";
	}
	
	
	
}
