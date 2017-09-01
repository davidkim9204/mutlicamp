package day10_designPattern_template;

public class Test {
	public static void main(String[] args) {
		Robot r1 = new Taekwon();
		Robot r2 = new Mazinga();
		r1.fight();
		r2.fight();
		Robot r3 = new Atom();
		r3.fight();
	}
}
