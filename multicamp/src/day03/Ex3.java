package day03;

public class Ex3 {
	public static void main(String[] args) {
//		int num = 3;
//		int sum = 0;
//		while( num < 100 ){
//			sum += num;
//			System.out.println(num);
//			num = num + 3;
//		}
//		System.out.println(sum);
		
		int num = 1;
		int sum = 0;
		while( num <= 100 )
		{
			if( num % 3 == 0 )
			{
				System.out.println(num);
				sum += num;
			}
			
			num++;
		}
		System.out.println(sum);
	}
}
