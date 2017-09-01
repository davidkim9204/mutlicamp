package day02;

import java.util.Scanner;

public class Pay {
	public static void main(String[] args) {
//		사용자로부터 금액을 입력받아서
//		큰 돈부터 필요한 금액권 수를 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		int price; //사용자가 입력하는 금액을 저장할 변수를 준비
		
		//사용자에게 금액을 입력할 것을 안내
		System.out.println("금액을 입력하시오");
		//사용자가 입력하는 값을 준비해둔 변수에 줍줍
		price = scan.nextInt();
		//만원권 계산...
		System.out.println("만원권 : " + (price / 10000));
		System.out.println("천원권 : " + (price % 10000 / 1000 ) );
		System.out.println("오백원권 : " + (price % 1000 / 500));
		System.out.println("백원권 : " +(price % 500 / 100));
		
		
	}
}
