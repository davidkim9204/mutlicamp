package day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest1 {
	public static void main(String[] args) {
		// 1. 사용할 입출력 객체를 참조할 참조변수 선언
		FileInputStream in = null;
		FileOutputStream out = null;
		int c;

		// 2. IOException을 처리하는 try/catch 구문에서 스트림 객체를 생성
		try {
			in = new FileInputStream("data.txt");
			out = new FileOutputStream("data_copy.txt");
			
			// 4. 이제부터 IO 코드 작성 시작
			long start = System.currentTimeMillis();
			// 배열의 크기는 한번에 복사할 용량의 크기 정해주는 것.
			byte[] buf = new byte[512];
			int length;
			while((length=in.read(buf)) >0)
				out.write(buf,0,length);
			
			/*
			  한 줄씩 읽는 방법
			  while((c=in.read())!= -1)
				out.write(c);
			*/
			long end = System.currentTimeMillis();
			System.out.println(end - start);
			System.out.println("완료");

		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			// 3. finally 블록에서 생성했떤 스트림을 닫아주는 코드를 작성
			try {
				if (in != null)
					in.close();
				if (out != null)
					out.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

	}

}
