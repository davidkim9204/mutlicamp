package day19;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpSenderThread extends Thread{
	
	private ObjectOutputStream writer = null;
	private Thread mainThread;

	public TcpSenderThread(Socket socket, Thread t) {
		mainThread = t;
		
		try {
			OutputStream os = socket.getOutputStream();
			writer = new ObjectOutputStream(socket.getOutputStream());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void run() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			try {
				String msg = scan.nextLine();
				Message message = new Message();
				message.setMsg(msg);
				message.setCode(0);
				if(msg.equals("Q")){
					mainThread.interrupt();
				}
				writer.writeObject(message);
				writer.flush();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
