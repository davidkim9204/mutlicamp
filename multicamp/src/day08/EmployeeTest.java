package day08;

public class EmployeeTest {
	public static void main(String[] args) {
//		String name1 = "Hong";
//		String name2 = "Hong";
//		System.out.println(name1 == name2);
//		String name3 = new String("Hong");
//		String name4 = new String("Hong");
//		System.out.println(name3 == name4);
//		System.out.println();
//		System.out.println(name1 == name3);
//		System.out.println();
//		System.out.println(name1.equals(name2));
//		System.out.println(name2.equals(name3));
//		System.out.println(name3.equals(name4));
		EmployeeManager manager = EmployeeManager.getInstance();
		manager.addEmployee("Hong", 1200);
		manager.printEmp();
		manager.addEmployee("Kim", 700);
		manager.addEmployee("Lee", 1000);
		manager.printEmp();
	}
}
