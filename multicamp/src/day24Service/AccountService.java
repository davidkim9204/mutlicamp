package day24Service;

import java.util.List;

import day24Dao.AccountDao;
import day24Model.Account;

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
		
		if(account.getaNum().equals(aNum)){
			account.setBalance(account.getBalance() + amount);
			aDao.updateAccount(account);
		}
			
	}
	
	public void withdrawBalance(String aNum, int amount){
		Account account = aDao.selectAccount(aNum);
		
		if(account.getaNum().equals(aNum)){
			account.setBalance(account.getBalance() - amount);
			aDao.updateAccount(account);
		}
			
	}
	
	public void transferBalance(String aNum1, String aNum2, int amount){
		Account senderAccount = aDao.selectAccount(aNum1);
		Account receiverAccount = aDao.selectAccount(aNum2);
		
		if(senderAccount.getaNum().equals(aNum1) && receiverAccount.getaNum().equals(aNum2)
				&& senderAccount.getBalance()>0){
			senderAccount.setBalance(senderAccount.getBalance()-amount);
			receiverAccount.setBalance(receiverAccount.getBalance()+amount);
			aDao.updateAccount(senderAccount);
			aDao.updateAccount(receiverAccount);

		}
		
	}
	

}
