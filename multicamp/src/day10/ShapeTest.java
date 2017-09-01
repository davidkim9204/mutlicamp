package day10;

public class ShapeTest {
	
	static Shape[] s = new Shape[4];
	public static void main(String[] args) {
		
		Shape shape = new Shape(){
			public void draw() {
				System.out.println("1회용구현");
			}
		};
		shape.draw();
		
		init();
		print();
	}
	public static void init(){
		s[0] = new Rectangle();
		s[1] = new Triangle();
		s[2] = new Circle();
		s[3] = new Cylinder();
	}
	public static void print(){
		for(int i = 0; i < s.length; i++ )
			s[i].draw();
	}
}
