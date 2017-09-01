package day03;

public class Fruits {
	public static void main(String[] args) {
		int num = (int)(Math.random() * 10) + 1;
		
		if( num == 1 )
			System.out.println("Bananas");
		else if( num == 2 )
			System.out.println("Oranges");
		else if( num == 3 )
		{
			System.out.println("Pears");
			System.out.println("Apples");
			System.out.println("Plums");
		}
		else if( num == 4 ){
			System.out.println("Apples");
			System.out.println("Plums");
		}
		else if( num == 5 )
			System.out.println("Plums");
		else if( num == 6 )
			System.out.println("Pineapples");
		else if( num == 7 ){}
		else
			System.out.println("Nuts");
//		System.out.println(num);
//		switch (num) {
//		case 1:
//			System.out.println("Bananas");
//			break;
//		case 2:
//			System.out.println("Oranges");
//			break;
//		case 3:
//			System.out.println("Pears");
//		case 4:
//			System.out.println("Apples");
//		case 5:
//			System.out.println("Plums");
//			break;
//		case 6:
//			System.out.println("Pineapples");
//			break;
//		case 7:
//			break;
//		default:
//			System.out.println("Nuts");
//			break;
//		}
	}
}
