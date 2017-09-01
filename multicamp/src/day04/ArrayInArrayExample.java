package day04;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		// int[][] mathScores = new int[2][3];
		//// System.out.println(mathScores.length);
		//// System.out.println(mathScores[0].length);
		//// System.out.println(mathScores[1].length);
		// for( int i = 0; i < mathScores.length; i++ ){
		// for( int j = 0; j < mathScores[i].length; j++ ){
		// System.out.printf("mathScores[%d][%d] : %d \n"
		// ,i,j,mathScores[i][j] );
		// }
		// }

//		int[][] engScores = new int[2][];
//		// System.out.println(engScores.length);
//		engScores[0] = new int[2];
//		engScores[1] = new int[3];
//		for (int i = 0; i < engScores.length; i++) {
//			for (int j = 0; j < engScores[i].length; j++) {
//				System.out.printf("engScores[%d][%d] : %d \n", i, j, engScores[i][j]);
//			}
//		}
	
		int[][] array={
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;
		for( int i = 0; i < array.length; i++ ){
			for( int j = 0; j < array[i].length; j++){
				sum += array[i][j];
				cnt++;
			}
		}
		avg = sum / (double)cnt;
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
	}
}

















