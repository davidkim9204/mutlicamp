package day19.tcp_multi_client;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;


public class TcpClient {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket(InetAddress.getByName("70.12.111.50"),
					5000);
			Thread t = Thread.currentThread();
			
			new TcpSenderThread(socket).start();
			new TcpReaderThread(socket).start();
		}
		catch(IOException e){
			
		}
	}
}
