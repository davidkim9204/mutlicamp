package day10_designPattern;

public class Mazinga {
	public void attack(){
		System.out.println("미사일로 공격!");
	}
	public void move(){
		System.out.println("걸어서 이동!");
	}
	public void fight(){
		System.out.println("전투시작-----------");
		move();
		attack();
		move();
		System.out.println("전투종료-----------");
	}
}
