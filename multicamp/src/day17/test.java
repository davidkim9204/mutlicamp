package day17;

import java.io.UnsupportedEncodingException;

public class test {
	public static void main(String[] args) {
		String a1 = "?c방각하"; 
		System.out.println(a1); 
		String a2;
		String a3;
		try {
			a2 = new String(a1.getBytes("MS949"),"UTF-8");
			System.out.println(a2); 
			a3 = new String(a2.getBytes("UTF-8"),"MS949");
			System.out.println(a3);
			
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
