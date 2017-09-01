package day03;

public class IfExample {
	public static void main(String[] args) {
		
		//기존 실행구조는 순차구조..
		int age = 24;
		System.out.println("아침에 일어난다");
		if( age < 65 )
		{
			int workingHours = 8;
			System.out.println(workingHours + "시간 일을 한다");
			System.out.println("많이 한다");
		}
//		System.out.println(workingHours + "시간 일 했어요...");
		System.out.println("집에 간다");
	}
}
