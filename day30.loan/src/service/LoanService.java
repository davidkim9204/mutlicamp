package service;

import java.util.ArrayList;
import java.util.List;

import model.Loan;

public class LoanService {

	public List<Loan> calLevelPayment(int balance, double rate, int period) {
		int monthPayment = (int) ((balance * rate / 12 * Math.pow((1 + rate / 12), period))
				/ (Math.pow((1 + rate / 12), period) - 1));
		rate = rate / 100;
		List<Loan> list = new ArrayList<>();
		for (int i = 1; i <= period; i++) {
			int monthInterest = (int) (balance * rate / 12);// 이번달 이자
			int monthOrigin = monthPayment - monthInterest;// 이번달 원금
			balance -= monthOrigin;
			Loan loan = new Loan();
			loan.setMonthPayment(monthPayment);
			loan.setMonthInterest(monthInterest);
			loan.setMonthOrigin(monthOrigin);
			loan.setBalance(balance);
			list.add(loan);
		}
		return list;
	}
}
