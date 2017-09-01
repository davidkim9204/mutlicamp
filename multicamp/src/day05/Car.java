package day05;

public class Car {
	public int speed;
	public int mileage;
	public String color;
	public void speedUp() { // 속도 증가 메소드
		speed += 10;
	}

	public void speedDown() { // 속도 감소 메소드
		speed -= 10;
	}

	public String toString() { // 객체의 상태를 문자열로 반환하는 메소드
		return "속도: " + speed + " 주행거리: " + mileage + " 색상: "
			+ color;
	}
}
