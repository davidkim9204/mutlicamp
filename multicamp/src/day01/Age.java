package day01;

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int age;
		int result;
		
		System.out.println("나이를 입력하세욥");
		age = scan.nextInt();
		result = age / 10 * 10;
		System.out.printf("당신은%3d대 이시군요", result);
	}
}
