package day09;

public class ComplexTest {
	public static void main(String[] args) {
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		c1.setReal(3);
		c1.setImage(4);
		c2.setReal(-2);
		c2.setImage(3);
		Complex c3 = c1.add(c2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}
