package day04;

import java.util.Scanner;

public class ElecFee {
	public static void main(String[] args) {
		//사용자에게 전기사용량을 입력받아서 전기요금을 출력하는 프로그램
		
		//상수 정의
		final double B_FEE_1 = 910;
		final double B_FEE_2 = 1600;
		final double B_FEE_3 = 7300;
		
		final double U_FEE_1 = 93.3;
		final double U_FEE_2 = 187.9;
		final double U_FEE_3 = 280.6;
		final double U_FEE_4 = 709.5;
		
		//사용자에게 입력받아야 되니깐 스캐너 준비
		Scanner scan = new Scanner(System.in);
		//사용자에게 전기 사용량 입력을 안내
		System.out.println("전기 사용량을 입력하세요(kWh)");
		//사용자가 입력하는 값을 use변수에 저장
		int use = scan.nextInt();
		double fee;
		//사용 구간 별 요금 계산
		if( use <= 200 ){
			fee = B_FEE_1 + use * U_FEE_1;
		}
		else if( use <= 400 ){
			fee = B_FEE_2 + 200 * U_FEE_1 + (use - 200) * U_FEE_2;
		}
		else if( use <= 1000 ){
			fee = B_FEE_3 + 200 * U_FEE_1 + 200 * U_FEE_2
					+ (use - 400) * U_FEE_3;
		}
		else{
			fee = B_FEE_3 + 200 * U_FEE_1 + 200 * U_FEE_1
					+ 600 * U_FEE_3 + (use-1000) * U_FEE_4;
		}
		System.out.println(fee);
			
		
	}
}
