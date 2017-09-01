package day09;

public class Car {
	public int speed;
	public int gear;
	public String color;
	
	public Car(){
		System.out.println("자동차생성");
	}
	
	
	public void setGear(int gear){
		this.gear = gear;
	}
	public void speedUp(int increment){
		speed += increment;
	}
	public void speedDown(int decrement){
		speed -= decrement;
	}
}
