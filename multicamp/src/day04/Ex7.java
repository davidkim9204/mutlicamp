package day04;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scan = new Scanner(System.in);
		while( run ){
			System.out.println("-----------------");
			System.out.println("1예금|2출금|3잔고|4종료");
			System.out.println("-----------------");
			System.out.print("선택>");
			int sel = scan.nextInt();
			if( sel == 1 ){
				System.out.print("예금액>");
				int bal = scan.nextInt();
				balance += bal;
			}
			else if( sel == 2 ){
				System.out.print("출금액>");
				int bal = scan.nextInt();
				balance -= bal;
			}
			else if( sel == 3 ){
				System.out.println("잔고>" + balance);
			}
			else if( sel == 4 )
			{
				run = false;
			}
		}
	}
}
