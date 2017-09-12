package day17udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpReceiver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatagramSocket socket = null;

		try {
			//객체 생성
			socket = new DatagramSocket(5000);
			//빈 바이트 배열 준비
			byte[] buf = new byte[512];
			//빈 패킷에 빈 바이트 배열 연결 
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			//소켓을 이용해 패킷을 받음
			socket.receive(packet);
			System.out.println(new String(buf));
			

		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			socket.close();
		}

	}

}
