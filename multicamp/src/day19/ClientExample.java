package day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {

	public static void main(String[] args) {
		Socket socket;
		try {
			socket = new Socket("127.0.0.1", 5003);
			OutputStream os = socket.getOutputStream();
			
			String filePath = "C:/Users/Public/Pictures/Sample Pictures/코알라.jpg";
			File file = new File(filePath);
			
			String fileName = file.getName();
			byte[] buf = fileName.getBytes();
			os.write(buf);
			os.flush();
			System.out.println("파일 보내기 ㅅㅣ작");
			FileInputStream fi = new FileInputStream(file);
			int length;
			buf = new byte[1024];
			while((length = fi.read(buf))>0) {
				os.write(buf, 0, length);
			}
			os.flush();
			System.out.println("보내기 완료");
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
