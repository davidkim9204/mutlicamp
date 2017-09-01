package day10_designPattern3_single;

public class Mazinga extends Robot{
	private MissileAttack attack;
	private WalkingMove move;
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
