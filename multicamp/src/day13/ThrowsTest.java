package day13;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThrowsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date date = getDate("1992-04-11 11:11:11");
		System.out.println(getDate("1992:04-11 11:11:11"));
//		System.out.println(date);
	}
	
	public static Date getDate(String str) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		Date date = null;
		try {
			date = sdf.parse(str);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("입력 잘못함");
		}
		
		return date;
	}

}
