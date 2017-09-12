package day17;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class HelloReaderTest {
	public static void main(String[] args) {
		Reader reader = null;
		try{
			reader = 
					// 인코딩이 어떤 타입으로 되어 있던 cp949 인코딩 타입으로 파일 읽겠다.
					new InputStreamReader(new FileInputStream("hello.txt"),"cp949");
			int c;
			while( (c = reader.read()) != -1 )
				System.out.print((char) c);
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally{
			try {
				if(reader != null)
					reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
