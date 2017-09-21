package day24Model;

public class Account {
	
	private String aNum;
	private String owner;
	private int balance;
	public String getaNum() {
		return aNum;
	}
	public void setaNum(String aNum) {
		this.aNum = aNum;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [aNum=" + aNum + ", owner=" + owner + ", balance=" + balance + "]";
	}
	
	

}
