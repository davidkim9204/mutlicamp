package day24;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Test {
	public static void main(String[] args) throws Exception {
		while(true){
			URL myURL = new URL("http://finance.naver.com/"
					+ "sise/sise_index.nhn?code=KOSPI");
			InputStream is = myURL.openStream();
			BufferedReader br = new BufferedReader(
					new InputStreamReader(is, "euc-kr"));
			String msg = null;
			while( (msg = br.readLine()) != null	){
				if( msg.contains("<em id=\"now_value\">"))
				{
					int tmp = msg.indexOf("<em id=\"now_value\">");
					System.out.println(msg.substring(36, 44));
//				System.out.println(msg);
				}
			}
			Thread.sleep(3000);
			
		}
	}
}




