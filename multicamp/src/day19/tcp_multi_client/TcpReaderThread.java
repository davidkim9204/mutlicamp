package day19.tcp_multi_client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.Socket;

public class TcpReaderThread extends Thread{
	private BufferedReader br;
	public TcpReaderThread(Socket socket) {
		// 매개변수로 들어온 socket객체로부터
		// bufferedReader만들어내셈
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void run(){
		while(true){
			try {
				
				String msg = br.readLine();
				System.out.println(msg);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
