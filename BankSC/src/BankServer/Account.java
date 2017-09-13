package BankServer;

public class Account {
	private String owner;
	private String ano;
	private int balance;
	
	
	
	
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
		return "Account [owner=" + owner + ", ano=" + ano + ", balance=" + balance + "]";
	}

}
