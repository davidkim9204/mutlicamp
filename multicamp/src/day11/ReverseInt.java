package day11;

public class ReverseInt {
	public int reverseInt(int n){
		String s1 = Integer.toString(n);
		int[] array = new int[s1.length()];
		int temp;
		String Sresult ="";
		int result;
		
		
		for(int i=0;i<s1.length();i++) {
			array[i] = s1.charAt(i) - '0';
		}
		
		for (int i=0;i<array.length;i++) {
			for(int j=i;j<array.length;j++) {
				if(array[i]<array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			//System.out.println(array[i]);
		}
		for (int i=0;i<array.length;i++) {
			Sresult += Integer.toString(array[i]);
		}
		System.out.println();
		result = Integer.parseInt(Sresult);
		return result;
	}
  
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void  main(String[] args){
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}
}