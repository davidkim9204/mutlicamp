package day10_designPattern5_strategy;
public class Robot {
	private Attack attack;
	private Move move;
	public void setAttack(Attack attack){
		this.attack = attack;
	}
	public void setMove(Move move){
		this.move = move;
	}
	public void fight(){
		System.out.println("전투시작-----------");
		move.move();
		attack.attack();
		move.move();
		System.out.println("전투종료-----------");
	}
}
