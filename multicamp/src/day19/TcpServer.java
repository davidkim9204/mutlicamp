package day19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		Thread t = Thread.currentThread();
		try {
			serverSocket = new ServerSocket(5003);
			socket = serverSocket.accept();
			
			new TcpSenderThread(socket,t).start();
			new TcpReaderThread(socket,t).start();
			
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

					socket.close();
					serverSocket.close();
					System.exit(1);
				}
			}
			
			/*InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			BufferedReader br = new BufferedReader(
					new InputStreamReader(is));
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(os));
			
			String msg = br.readLine();
			bw.write(msg + "\n");
			bw.flush();*/
			//System.out.println(bw);
			//System.out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
