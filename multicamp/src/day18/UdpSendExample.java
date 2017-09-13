package day18;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UdpSendExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatagramSocket socket= null;
		
		try {
			socket = new DatagramSocket();
			System.out.println("발신 시작");
			
			for (int i=1; i<3; i++) {
				String data = "메시지" + i;
				byte[] byteArr = data.getBytes("UTF-8");
				DatagramPacket packet = new DatagramPacket(byteArr,byteArr.length,
						new InetSocketAddress("localhost",5001));
				
				socket.send(packet);
				System.out.println("보낸 바이트 수 :" +byteArr.length + "bytes");
			}
			System.out.println("발신종료");
			
			socket.close();
			
			
			
			
		} catch (SocketException | UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
