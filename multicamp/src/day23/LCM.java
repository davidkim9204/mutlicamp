package day23;

public class LCM {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 12;
		int r=1;
		int temp;
		int lcm;
		
		int temp1 =a;
		int temp2 = b;
		while(r>0){
			r = a % b;
			a = b;
			b = r;
		}
		lcm = temp1*temp2/a;
		System.out.println(lcm);
	}

}
