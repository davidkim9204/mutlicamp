package day05;

class Student{
	public String name;
	private int score;
	public int age;
	
	public int getScore(){
		return score;
	}
	public void setScore(int s){
		if( score > 0)
			score = s;
	}
	
	public void study(){
		System.out.println(name + "이가 공부를 합니다.");
		score += 10;
	}
	
	public String toString(){
		return "이름 : " + name + "\t점수 : " + score + "\t나이 : "
				+ age;
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.name = "홍";
		s2.name = "김";
		
		System.out.println(s1.name);
		System.out.println(s2.name);
		
		System.out.println(s1);		
		s1.study();
		System.out.println(s1.getScore());
		s1.setScore(50);
		System.out.println(s1.getScore());
	}
}
