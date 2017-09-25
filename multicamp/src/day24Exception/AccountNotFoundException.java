package day24Exception;

public class AccountNotFoundException extends RuntimeException{
	
	public AccountNotFoundException(){
		super("계좌가 존재하지 않습니다.");
	}
}
