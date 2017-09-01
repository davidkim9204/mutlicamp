package day05;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		Car yourCar = new Car();
		myCar.speed = 80;
		yourCar.speed = 90;
		myCar.mileage = 240000;
		yourCar.mileage = 100000;
		myCar.color = "White";
		yourCar.color = "Black";
		System.out.println(myCar.toString());
		System.out.println(yourCar);
	}
}
