package day03;

import java.util.Scanner;

public class Gcd {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 1 입력 : ");
		int x = scan.nextInt();
		System.out.print("숫자 2 입력 : ");
		int y = scan.nextInt();
		
		int r;
		while( y != 0 ){
			r = x % y;
			x = y;
			y = r;
		}
		//y가 0이되면 코드실행이 여기에 도달함
		System.out.println("최대공약수 : " + x);
	}
}
