package day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TcpClient {
	public static void main(String[] args) {
		Socket socket = null;
		Thread t = Thread.currentThread();
		
		try {
			socket = new Socket(InetAddress.getByName("70.12.111.58"),
					5003);
			
			new TcpSenderThread(socket,t).start();
			new TcpReaderThread(socket,t).start();
			
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

					socket.close();
					System.exit(1);
				}
			}
			/*InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			BufferedReader br = new BufferedReader(
					new InputStreamReader(is));
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(os));
			
			bw.write("어서와 TCP는 처음이지?  \n");
			bw.flush();
			String msg = br.readLine();
			System.out.println(msg);*/
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
