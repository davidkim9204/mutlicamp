package day24Service;

import java.util.List;


import day24Dao.AccountDao;
import day24Model.Account;
import day24Exception.BalanceNotEnoughException;
import day24Exception.AccountNotFoundException;

public class AccountService {
	
	private AccountDao aDao;
	
	public AccountService(){
		aDao = new AccountDao();
	}
	
	public int create(String aNum, String owner, int balance){
		Account account = new Account();
		account.setaNum(aNum);
		account.setOwner(owner);
		account.setBalance(balance);
		int result = aDao.createAccount(account);
		return result;
	}
	
	public void showAccount(String aNum){
		Account account = aDao.selectAccount(aNum);
		if(account == null)
			throw new AccountNotFoundException();
		account.setaNum(account.getaNum());
		account.setOwner(account.getOwner());
		account.setBalance(account.getBalance());
		System.out.println(account.toString());
	}
	
	public void showList(){
		List<Account> account = aDao.selectAll();
		for(Account a : aDao.selectAll()){
			System.out.println(a);
		}
	}
	
	public void depositBalance(String aNum, int amount){
		Account account = aDao.selectAccount(aNum);
		if(account == null)
			throw new AccountNotFoundException();
		if(account.getaNum().equals(aNum)){
			account.setBalance(account.getBalance() + amount);
			aDao.updateAccount(account);
		}
			
	}
	
	public void withdrawBalance(String aNum, int amount){
		Account account = aDao.selectAccount(aNum);
		if(account == null)
			throw new AccountNotFoundException();
		if(account.getaNum().equals(aNum)){
			account.setBalance(account.getBalance() - amount);
			aDao.updateAccount(account);
		}
			
	}
	
	public void transferBalance(String aNum1, String aNum2, int amount){
		withdrawBalance(aNum1, amount);
		depositBalance(aNum2, amount);
		
		
	}
	

}
