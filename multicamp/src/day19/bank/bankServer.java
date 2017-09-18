package day19.bank;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class bankServer {
	
	public static void main(String[] args) {
		ObjectOutputStream writer = null;
		ObjectInputStream reader = null;
		
		try {
			ServerSocket serverSocket = new ServerSocket(5001);
			Socket socket = serverSocket.accept();
			
			OutputStream os = socket.getOutputStream();
			writer = new ObjectOutputStream(os);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
}
