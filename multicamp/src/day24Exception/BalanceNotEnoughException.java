package day24Exception;

public class BalanceNotEnoughException extends RuntimeException{
	public BalanceNotEnoughException(){
		super("잔액이 부족합니다.");
	}
}
