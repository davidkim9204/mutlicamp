package day06;

public class Employee {
	private String name;
	private int salary;
	private String position;
	
	public Employee(){
		name = "noname";
		position = "주임";
		salary = 0;
	}
	public Employee( String name, int salary, String position){
		this.name = name;
		
//		this.salary = salary;
		this.setSalary(salary);
		this.position = position;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String n){
		name = n;
	}
	public int getSalary(){
		return salary;
	}
	public void setSalary(int s ){
		if( s > 0 )
			salary = s;
	}
	public String getPosition(){
		return position;
	}
	public void setPosition(String p){
		position = p;
	}
	public String toString(){
		return "이름 : " + name + "\t연봉 : " + salary
				+ "\t직급 : " + position;
	}
	
	
}
