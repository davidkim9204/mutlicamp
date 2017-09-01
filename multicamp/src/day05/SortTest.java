package day05;

public class SortTest {
	public static void main(String[] args) {
		int[] arr = {5,2,3,4,1,6};
		
		for( int val : arr )
			System.out.print(val + " ");
		System.out.println();
		//0번째부터 끝까지 중에서 젤 큰 숫자의 위치를 찾아서
		//0번째와 값을 변경 ㄱ
		
		for(int j = 0; j < arr.length; j++)
		{
			//젤 큰 값의 위치를 저장할 변수를 만들고 일단 0번째가 젤 크다고 가정
			int maxIndex = j;
			int max = arr[j];
			//배열을 한바퀴 돌면서, 더 큰값의 위치가 찾아지면 그 위치를 기억
			for( int i = j; i < arr.length; i++ ){
				if( max < arr[i] ){
					max = arr[i];
					maxIndex = i;
				}
			}
			int tmp = arr[maxIndex];
			arr[maxIndex] = arr[j];
			arr[j] = tmp;
			for( int val : arr )
				System.out.print(val + " ");
			System.out.println();
		}
		
		
		
	}
}
