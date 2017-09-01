package day10_designPattern_template;

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
