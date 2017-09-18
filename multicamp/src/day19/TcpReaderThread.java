package day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.Socket;

public class TcpReaderThread extends Thread{

	private ObjectInputStream reader = null;
	private Thread mainThread;
	
	public TcpReaderThread(Socket socket, Thread t) {
		mainThread = t;
		try {
			InputStream is = socket.getInputStream();
			reader = new ObjectInputStream(socket.getInputStream());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	} // end TcpReaderThread(Socket)
	
	public void run() {
		while(true) {
//			String msg;
			try {
				Message message = (Message) reader.readObject();
				if(message.getCode() == -1 )
					mainThread.interrupt();
				
				if(message.getCode() == 0)
					System.out.println(message.getMsg());
//				msg = reader.readLine();
				
				//System.out.println(msg);
			} catch (IOException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}  // end run()
	
	
}
