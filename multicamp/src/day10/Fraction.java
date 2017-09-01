package day10;

public class Fraction {
	private int numeration;
	private int denomination;
	public int getNumeration() {
		return numeration;
	}
	public void setNumeration(int numeration) {
		this.numeration = numeration;
	}
	public int getDenomination() {
		return denomination;
	}
	public void setDenomination(int denomination) {
		this.denomination = denomination;
	}
	public Fraction add(Fraction f){
		//this.numeration, this.denomination
		//f.numeration, f.denomination 을 활용해서
		// 두 분수의 합을 연산... 후 새로운 분수객체를 만들어 리턴...
		
		int resultNumeration = this.numeration * f.denomination 
				+ this.denomination * f.numeration;
		int resultDenomination = this.denomination * f.denomination;
		Fraction result = new Fraction();
		result.setNumeration(resultNumeration);
		result.setDenomination(resultDenomination);
		this.reduction();
		return result;
	}
	public Fraction subtract(Fraction f){
		int resultNumeration = this.numeration * f.denomination 
				- this.denomination * f.numeration;
		int resultDenomination = this.denomination * f.denomination;
		Fraction result = new Fraction();
		result.setNumeration(resultNumeration);
		result.setDenomination(resultDenomination);
		this.reduction();
		return result;
	}
	public void reduction(){
		int gcd = this.getGcd(numeration, denomination);
		this.numeration /= gcd;
		this.denomination /= gcd;
	}
	public int getGcd(int a, int b){
		int r;
		while( b != 0 ){
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}





