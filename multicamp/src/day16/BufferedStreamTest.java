package day16;

import java.io.*;

public class BufferedStreamTest {
	public static void main(String[] args) {
		// 1. 참조변수 선언
		// 2. 객체 생성
		// 3. 리소스 정리코드 작성
		// 4. IO구현

		BufferedInputStream in = null;
		BufferedOutputStream out = null;

		try {
			out = new BufferedOutputStream(new FileOutputStream("data.txt"),5);
			in = new BufferedInputStream(new FileInputStream("data.txt"));

			for (int i = 0; i < 6; i++) {
				out.write(i);
			}
//			out.flush();
			int c;
			while ((c = in.read()) != -1) {
				System.out.print(c + " ");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (in != null) {
					in.close();
				}
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
			}
		}
	}
}
