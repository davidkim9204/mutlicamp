package day17;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Writer;

public class BufferedReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = null;
		Writer writer = null;
		String s = "dream come true";

		try {
			writer = new FileWriter("test.txt");
			reader = new BufferedReader(new InputStreamReader(new FileInputStream("test.txt")));
			writer.write(s);
			writer.append('.');
			writer.flush();
			
			String msg = null;
			while((msg = reader.readLine())!=null)
				System.out.println(msg);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (reader != null)
					reader.close();
				if (writer != null)
					writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
