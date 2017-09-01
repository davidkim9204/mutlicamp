package day02;

public class LeapYear {
	public static void main(String[] args) {
		//윤년을 판정해봅시다...
		int year = 1900;
		
		String result = ((year % 4 ==0) && 
				(year % 100 != 0) ) || 
				(year % 400 == 0) ? "윤년": "평년";
		
		System.out.println(result + "입니다.");
	}
}
