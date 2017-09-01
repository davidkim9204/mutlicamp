package day10_designPattern;

public class Taekwon {
	public void attack(){
		System.out.println("펀치로 공격!");
	}
	public void move(){
		System.out.println("날아서 이동!");
	}
	public void fight(){
		System.out.println("전투시작-----------");
		move();
		attack();
		move();
		System.out.println("전투종료-----------");
	}
}
