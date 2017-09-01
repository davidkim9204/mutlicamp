package day04;

public class Ex5 {
	public static void main(String[] args) {
		//4x + 5y = 60의 모든 해를 출력
		//x의 최대값은 10
		//y의 최대값은 10
		
		
		for(int x = 1; x <= 10; x++)
		{
			for(int y = 1; y <= 10; y++){
				if( 4*x + 5*y == 60 )
					System.out.printf("(%2d, %2d)\n", x,y);
			}
		}
		
		
	}
}
