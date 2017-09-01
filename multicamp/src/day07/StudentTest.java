package day07;

public class StudentTest {
	public static void main(String[] args) {
		Student s;
		s=new Student();
		Student s2;
		s2=new Student("Hong");
		
		System.out.println(s2.getName());
//		s2.name = "Kim";
		s2.setName("Kim");
		System.out.println(s2.getName());
	}
}
