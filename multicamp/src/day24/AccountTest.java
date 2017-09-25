package day24;

import java.util.Scanner;

import day24Exception.AccountNotFoundException;
import day24Exception.BalanceNotEnoughException;
import day24Service.AccountService;

public class AccountTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		AccountService aService = new AccountService();
		boolean flag = true;

		while (flag) {
			System.out.println("1:계좌생성||2:계좌조회||3:계좌목록||4:입금||5:출금 ||6:이체||7:종료");
			int sel = scanner.nextInt();
			scanner.nextLine();
			try {
				switch (sel) {
				case 1: {
					System.out.print("계좌번호 : ");
					String aNum = scanner.nextLine();
					System.out.print("이름 : ");
					String owner = scanner.nextLine();
					System.out.print("잔액 : ");
					int balance = scanner.nextInt();
					int result = aService.create(aNum, owner, balance);
					break;
				}

				case 2: {
					System.out.print("계좌번호 : ");
					String aNum = scanner.nextLine();
					aService.showAccount(aNum);
					break;
				}

				case 3: {
					aService.showList();
					break;
				}
				case 4: {
					System.out.print("계좌번호 : ");
					String aNum = scanner.nextLine();
					System.out.print("입금금액 : ");
					int amount = scanner.nextInt();
					aService.depositBalance(aNum, amount);
					break;
				}

				case 5: {
					System.out.print("계좌번호 : ");
					String aNum = scanner.nextLine();
					System.out.print("출금금액 : ");
					int amount = scanner.nextInt();
					aService.withdrawBalance(aNum, amount);
					break;
				}

				case 6: {
					System.out.print("인출 계좌번호 : ");
					String aNum1 = scanner.nextLine();
					System.out.print("입금 계좌번호 : ");
					String aNum2 = scanner.nextLine();
					System.out.println(("송금 금액: "));
					int amount = scanner.nextInt();
					aService.transferBalance(aNum1, aNum2, amount);
					break;
				}

				case 7:
					flag = false;

				default:
					flag = false;

				}// end switch

			} catch (BalanceNotEnoughException e) {
				System.out.println(e.getMessage());
			} catch (AccountNotFoundException e) {
				System.out.println(e.getMessage());
			}

		}

	}

}
