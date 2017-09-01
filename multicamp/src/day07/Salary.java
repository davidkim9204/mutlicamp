package day07;

public class Salary {
	private int basicFee;
	private int commission;
	public Salary(){
		basicFee = 1000000;
		commission = 0;
	}
	public Salary(int basicFee, int commission){
		this.basicFee = basicFee;
		this.commission = commission;
	}
	public int getBasicFee() {
		return basicFee;
	}
	public void setBasicFee(int basicFee) {
		this.basicFee = basicFee;
	}
	public int getCommission() {
		return commission;
	}
	public void setCommission(int commission) {
		this.commission = commission;
	}
	@Override
	public String toString() {
		return "Salary [basicFee=" + basicFee + ", commission=" + commission + "]";
	}
	
	public int getSalary()
	{
		int salary = basicFee * 12 + commission;
		return salary;
	}
}
