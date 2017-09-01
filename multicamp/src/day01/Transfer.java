package day01;

import java.util.Scanner;

public class Transfer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double rate = 1137.25;//원-달러 전환율
		int won;//사용자가 입력하는 원화를 저장할 변수
		double result; //계산결과 달러값을 저장할 변수
		System.out.println("원화를 입력하세요");
		won = scan.nextInt();
		
		//원화를 달러로 전환
		result = won / rate;
		System.out.printf("%d원은 달러로 %.2f달러 입니다.",won,result);
	}
}
