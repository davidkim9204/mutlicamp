package day02;
public class IcreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		System.out.println("------------------");
		x++;
		++x;
		System.out.println("x=" + x);//12
		System.out.println("------------------");
		y--;
		--y;
		System.out.println("y=" + y);//8
		System.out.println("------------------");
		z = x++;// z:12 , x:13
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("------------------");
		z = ++x; //z:14 , x:14
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("------------------");
		z = ++x + y++; // z:15+8:23, x:15, y:9
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		System.out.println("y=" + y);
	}
}
