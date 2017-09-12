package day17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HttpTest {
	public static void main(String[] args) throws IOException {
		URL url =new URL("https://www.naver.com");
		URLConnection uc= url.openConnection();
		InputStream is= uc.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		
		String msg = null;
		while((msg = reader.readLine())!=null)
			System.out.println(msg);
		
		/*int c;
		while( (c = reader.read()) != -1 )
			System.out.println(c);*/
	
		reader.close();
	}
	
}
