package model;

public class Loan {
	private int monthPayment;
	private int monthOrigin;
	private int monthInterest;
	private int balance;
	public int getMonthPayment() {
		return monthPayment;
	}
	public void setMonthPayment(int monthPayment) {
		this.monthPayment = monthPayment;
	}
	public int getMonthOrigin() {
		return monthOrigin;
	}
	public void setMonthOrigin(int monthOrigin) {
		this.monthOrigin = monthOrigin;
	}
	public int getMonthInterest() {
		return monthInterest;
	}
	public void setMonthInterest(int monthInterest) {
		this.monthInterest = monthInterest;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
