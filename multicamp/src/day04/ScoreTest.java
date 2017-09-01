package day04;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		int total = 0;
		int size;
		Scanner scan = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하시오 : ");
		size = scan.nextInt();
		
		int[] score = new int[size];
		for(int i = 0; i < score.length; i++){
			System.out.println("성적을 입력하시오 : ");
			score[i] = scan.nextInt();					
		}
//		for(int i = 0; i < score.length; i++){
//			total += score[i];
//		}
//		System.out.println("평균 성적은" + total/size + "입니다.");
		
		//가장 큰값을 기억할 변수를 선언
		int max;
		//첫번째값이 젤 큰걸로 간주
		max = score[0];
		//score배열을 한바퀴 순회
		for( int i = 0; i < score.length; i++)
		{
			//순회하면서 만나는 score값이 기존 알고 있던 최대값보다 더 크면
			//그 값을 기억
			if ( max < score[i] )
				max = score[i];
		}
		System.out.println(max);
		score = new int[]{3,2,3};
	}	
}










