package day19.tcp_multi_client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpSenderThread extends Thread{
	private BufferedWriter bw;
	public TcpSenderThread(Socket socket){
		try {
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void run(){
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			try {
				String msg = scan.nextLine();
				bw.write(msg + "\n");
				bw.flush();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}










