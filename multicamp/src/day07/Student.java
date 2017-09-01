package day07;

public class Student {
	private String name;
	private int age;
	private int score;
	
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	
	
	public Student(String n, int a, int s){
//		System.out.println("학생생성");
		name = n;
		age = a;
		score = s;
	}
	public Student(){
		this("noname", 20, 0);
	}
	public Student(String n)
	{
		this(n, 20, 0);
	}
}







