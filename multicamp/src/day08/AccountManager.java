package day08;

import java.util.Scanner;

public class AccountManager {
	private Account[] accountArray = new Account[100];
	private Scanner scanner = new Scanner(System.in);
	private int numOfAccounts = 0;
	
	public void createAccount() {
		System.out.println("----------");
		System.out.println("계좌생성");
		System.out.println("----------");
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		System.out.print("계좌주: ");
		String owner = scanner.next();
		System.out.print("최초입금액: ");
		int balance = scanner.nextInt();
		Account account = new Account(ano, owner, balance);
		accountArray[numOfAccounts] = account;
		numOfAccounts++;
		System.out.println("결과: 계좌가 생성되었습니다.");
	}

	public void accountList() {
		//0번째부터 모든 현재 계좌를 출력해야되는데, 몇갠지 알아야됨
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		for( int i = 0; i < numOfAccounts; i++ ){
			String ano = accountArray[i].getAno();
			String owner = accountArray[i].getOwner();
			int balance = accountArray[i].getBalance();
			System.out.println(ano + "\t" + owner + "\t" + balance);
		}
	}

	public void deposit() {
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		Account a = findAccount(ano);
		if( a == null )
			System.out.println("계좌가 존재하지 않습니다.");
		else{
			System.out.print("예금액: ");
			int amount = scanner.nextInt();
			a.setBalance( a.getBalance() + amount );
			System.out.println("결과: 예금이 성공되었습니다.");
		}
	}

	public void withdraw() {
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		Account a = findAccount(ano);
		if( a == null )
			System.out.println("계좌가 존재하지 않습니다.");
		else{
			System.out.print("출금액: ");
			int amount = scanner.nextInt();
			if( a.getBalance() > amount){
				a.setBalance( a.getBalance() + amount );
				System.out.println("결과: 출금이 성공되었습니다.");
			}
			else
				System.out.println("결과: 잔액이 부족합니다.");
		}
	}

	private Account findAccount(String ano) {
		Account account = null;
		for ( int i = 0; i < numOfAccounts; i++ ){
			if( ano.equals( accountArray[i].getAno() )  )
				account = accountArray[i];
		}
		return account;
	
	}
	
}
