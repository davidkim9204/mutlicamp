package day06;

public class Car {
	private int speed;
	private int mileage;
	private String color;
	
	public Car(){
		System.out.println("객체생성ㅋㅋ");
		speed = mileage = 0;
		color = "Pink";
	}
	public Car(String c){
		this(0,0,c);
	}
	public Car(int s, int m, String c){
		System.out.println("매개변수3짜리 생성자");
		speed = s;
		mileage = m;
		color = c;
	}
	
	
	
	
	
	
	
	
	
	
	
	//접근자 : 멤버변수의 값을 대신 갖다주는 멤버함수
	//접근자 규칙
	// - 이름은 get + 변수명,
	// - 반환유형은 내가 갖고 오고자 하는 멤버변수와 같은 타입
	// - 매개변수 x
	public int getSpeed(){
		return speed;
	}
	public int getMileage(){
		return mileage;
	}
	public String getColor(){
		return color;
	}
	
	
	//설정자 : 멤버변수에 값을 대신 넣어주는 멤버함수
	//설정자 규칙
	// - 이름은 set + 변수명,
	// - 반환유형은 void
	// - 매개변수는 설정하고자 하는 멤버변수와 같은 타입 한개
	public void setSpeed(int s){
		System.out.println("speed값이 변경됩니다. 정수버전");
		if( s > 0 )
			speed = s;
	}
	public void setSpeed(double s){
		System.out.println("spped값이 변경됩니다. 실수버전");
		speed += (int)(s + 0.5);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void setMileage(int m){
		mileage = m;
	}
	public void setColor(String c){
		color = c;
	}
	
	
	public void speedUp(){
		speed += 10;
	}
	public void speedDown(){
		speed -= 10;
	}
	public String toString(){
		return "속도 : " +speed + "\t주행거리 : " + mileage
				+ "\t색상 : " + color;
	}
}
