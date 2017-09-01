package day01;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int salary;
		int total;
		
		System.out.println("월급을 입력하세요.");
		salary = scan.nextInt();
		
		total = 12 * salary * 10 ;
		
//		System.out.print("당신이 10년간 받을 월급은 ");
//		System.out.print(total);
//		System.out.println(" 입니다.");
		
//		System.out.printf("당신이 10년간 받을 월급은 %d 입니다.",total);
		
		System.out.println("너님의 10년치 월급은 " + total + "입니다.");
		
		
		
		
		
		
	}
}
