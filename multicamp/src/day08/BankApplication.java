package day08;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		AccountManager am = new AccountManager();
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				am.createAccount();
			} else if (selectNo == 2) {
				am.accountList();
			} else if (selectNo == 3) {
				am.deposit();
			} else if (selectNo == 4) {
				am.withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

}
