package day10_designPattern4_interface;

public abstract class Robot {
	public abstract void attack();
	public abstract void move();
	public void fight(){
		System.out.println("전투시작-----------");
		move();
		attack();
		move();
		System.out.println("전투종료-----------");
	}

}
