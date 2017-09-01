package day07;

public class CircleTest {
	public static void main(String[] args) {
		Point p1 = new Point(2,3);
		Circle c = new Circle();
		System.out.println(c);
		c.setRadius(10);
		c.setCenter(p1);
		System.out.println(p1);
		System.out.println(c);
		
		p1.setX(20);
		
		System.out.println(p1);
		System.out.println(c);
		//원점의 x좌표를 15로 변경하시오.
		c.getCenter().setX(15);
		System.out.println(c.getRadius());
	}
}
