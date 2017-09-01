package day02;

import java.util.Scanner;

public class FindMax {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 1 입력 하세요.");
		int num1 = scan.nextInt();
		System.out.println("숫자 2 입력 하세요.");
		int num2 = scan.nextInt();
		System.out.println("숫자 3 입력 하세요.");
		int num3 = scan.nextInt();
		
//		int tmp = num1 > num2 ? num1 : num2;
//		int max = num3 > tmp ? num3 : tmp;
		int tmp1 = num1 > num2 ? num1 : num2;
		int tmp2 = num1 > num3 ? num1 : num3;
		int tmp3 = num3 > num2 ? num3 : num2;
		
		int tmp4 = tmp1 < tmp2 ? tmp1 : tmp2;
		int mid = tmp4 < tmp3 ? tmp4 : tmp3;
		System.out.println(mid);
	}
}
