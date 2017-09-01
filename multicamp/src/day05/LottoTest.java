package day05;

public class LottoTest {
	public static void main(String[] args) {
		//로또번호들을 저장할 배열은 선언
		int[] lotto;
		lotto = new int[6];
		
		//배열의 인덱스를 나타낼 변수를 선언
		int i = 0;
		while( i < 6 ){
			//랜덤한 로또번호 추출
			int num = (int)(Math.random()*45) + 1;
			boolean flag = false;
			for( int j = 0; j < i; j++)
			{
				if( num == lotto[j])
					flag = true;
			}
			if(flag)
				continue;
			else{
				lotto[i] = num;
				i++;
			}
		}
		for(int val : lotto)
			System.out.print(val + " ");
		System.out.println();
		
		int max = lotto[0];
		int maxIndex = 0;
		for(i = 0; i < lotto.length; i++)
		{
			if( max < lotto[i] )
			{
				max = lotto[i];
				maxIndex = i;
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최대값의 위치 : " + maxIndex);
		int tmp;
		tmp = lotto[maxIndex];
		lotto[maxIndex] = lotto[0];
		lotto[0] = tmp;
		
		
		for(int val : lotto)
			System.out.print(val + " ");
		System.out.println();		
		
	}
}
