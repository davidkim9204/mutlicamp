package BankServer;

import java.util.ArrayList;
import java.util.List;

public class AccountManager {
	private List<Account> accountList;

	public AccountManager() {
		accountList = new ArrayList<>();
	}

	public boolean createAccount(String owner, String ano, int balance) {
		boolean isExist = false;

		for (Account a : accountList) {
			if (a.getAno().equals(ano))
				isExist = true;
		}
		if (isExist)
			return false;

		Account account = new Account();
		account.setOwner(owner);
		account.setAno(ano);
		account.setBalance(balance);
		accountList.add(account);
		return true;
	}

	public int getBalance(String ano) {
		int balance = 0;
		for (Account a : accountList) {
			if (a.getAno().equals(ano)) {
				balance = a.getBalance();
			}
		}
		return balance;
	}

	// 잔고가 0이하면 잔액부족 성공하면 출금액만큼 계좌잔고를 줄이고 출금성공
	public boolean withDraw(String ano, int amount) {
		for (Account a : accountList) {
			System.out.println(a);
			if (a.getAno().equals(ano)) {
				int originalBalace = a.getBalance();
				if (originalBalace > amount) {
					a.setBalance(originalBalace - amount);
					return true;
				} else
					return false;
			}
		}
		return false;
	}

	public void deposit(String ano, int amount) {
		for (Account a : accountList) {
			if (a.getAno().equals(ano)) {
				a.setBalance(a.getBalance() + amount);
			}
		}
	}

}
