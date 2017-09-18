package day19;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws Exception{
		ServerSocket serverSocket = new ServerSocket(5003);
		
		System.out.println("서버 시작");
		
		while(true) {
			Socket socket = serverSocket.accept();
			InputStream is = socket.getInputStream();
			
			byte[] buf = new byte[1000];
			int readByteCount = -1;
			is.read(buf);
			
			String fileName = new String(buf).trim();
			
			System.out.println("파일 받기 시작" + fileName);
			FileOutputStream fo = new FileOutputStream("src/" + fileName);
			while((readByteCount = is.read(buf))>0) {
				fo.write(buf,0,readByteCount);
			}
			fo.flush();
			System.out.println("파일받기 완료");
			fo.close();
			is.close();
			socket.close();
			
		}
	}

}
