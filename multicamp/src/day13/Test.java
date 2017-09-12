package day13;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		int x = 8;
		int y = 3;
		int result =0;
		try {
			result = x/y;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("안돼");
		}
		System.out.println(result);
		System.out.println("끝");

	}

}
