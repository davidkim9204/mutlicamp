package day11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*long start = System.currentTimeMillis();
		System.out.println("do");
		long end = System.currentTimeMillis();
		System.out.println(end - start);*/
		/*int sum,is1,is2;
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		
		is1 = Integer.parseInt(s1);
		is2 = Integer.parseInt(s2);
		sum = is1 + is2;
		System.out.println(sum);*/
		Calendar d = Calendar.getInstance();
		System.out.println(d);
		System.out.println(d.get(Calendar.YEAR));
		System.out.println(d.getWeekYear());
		

	}

}
