package day17;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in = null;
		FileWriter out = null;
		String s = "dream come true";

		try {
			out = new FileWriter("test.txt");
			out.write(s);
			out.append('.');
			out.flush();

			in = new FileReader("test.txt");
			int c;
			while ((c = in.read()) != -1) {
				System.out.println((char) c);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();
				if (out != null)
					out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
