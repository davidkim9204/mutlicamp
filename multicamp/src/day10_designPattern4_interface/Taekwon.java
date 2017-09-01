package day10_designPattern4_interface;

public class Taekwon extends Robot{
	private Attack attack;
	private Move move;
	public Taekwon() {
		// TODO Auto-generated constructor stub
		attack = new PunchAttack();
		move = new FlyingMove();
	}
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		attack.attack();
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		move.move();
	}
}
