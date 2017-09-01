package day08;

public class EmployeeManager {
	
	private static EmployeeManager instance;
	
	public static EmployeeManager getInstance(){
		if( instance == null )
			instance = new EmployeeManager();
		return instance;
	}
	
	private Employee[] empArr;
	private int countOfEmp;
	private EmployeeManager(){
		empArr = new Employee[100];
		countOfEmp = 0;
	}
	public void addEmployee(String name, int salary){
		Employee e = new Employee();
		e.setName(name);
		e.setSalary(salary);
		empArr[countOfEmp] = e;
		countOfEmp++;
	}
	public void printEmp() {
		System.out.println("----급여가 1000 이상인 친구들-----");
		for (int i = 0; i < countOfEmp; i++) {
			if (empArr[i].getSalary() >= 1000)
				System.out.println(empArr[i]);
		}
		System.out.println("-----------------------------");
	}
	public void printSum() {
		// 급여 총합 구하기
		int sum = 0;// 총합을 담을 변수를 준비
		for (int i = 0; i < countOfEmp; i++)
			sum += empArr[i].getSalary();
		System.out.println("직원 총급여 : " + sum);
	}
}
