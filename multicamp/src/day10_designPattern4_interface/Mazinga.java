package day10_designPattern4_interface;

public class Mazinga extends Robot{
	//private MissileAttack attack;
	private Attack attack;
	private Move move;
	public Mazinga(){
		attack = new MissileAttack();
		move = new WalkingMove();
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
