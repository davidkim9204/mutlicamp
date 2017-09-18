package day19.tcp_multi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

class TcpMultiServerThread extends Thread{
	private Socket socket;
	private BufferedReader reader;
	public TcpMultiServerThread(Socket socket){
		try {
			reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
		
			BufferedWriter bw = new BufferedWriter(
					new OutputStreamWriter(socket.getOutputStream()));
			TcpMultiServer.clients.put(socket, bw);
			this.socket = socket;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void run(){
		while(true){
			try {
				String msg = reader.readLine();
				for( BufferedWriter bw: TcpMultiServer.clients.values() ){
					bw.write(socket.getRemoteSocketAddress() 
							+ "님의말 : " + msg + "\n");
					bw.flush();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				break;
			}
		}
		try {
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TcpMultiServer.clients.remove(socket);
	}
}
public class TcpMultiServer {
	public static Map<Socket, BufferedWriter> clients = new HashMap<>();
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(5000);
			while(true)
			{
				Socket socket = serverSocket.accept();
				new TcpMultiServerThread(socket).start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
