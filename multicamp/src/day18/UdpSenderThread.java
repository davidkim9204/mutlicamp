package day18;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class UdpSenderThread extends Thread{
	
	public void run() {
		DatagramSocket socket = null;
		Scanner scan = new Scanner(System.in);
		String targetAddress = "70.12.111.58";
		
		try {
			socket = new DatagramSocket();
			
			while(true){
				//사용자한테 문자열 입력받아서
				String msg = scan.nextLine();
				if(msg.equals("종료"))
					break;
				//바이트배열로 만들고
				byte[] buf = msg.getBytes();
				//패킷에 실어서
				DatagramPacket packet 
				= new DatagramPacket(buf, buf.length,
						InetAddress.getByName(targetAddress),5112);
				//전송!
				socket.send(packet);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			socket.close();
			System.exit(0);
		}
		
	}

}
