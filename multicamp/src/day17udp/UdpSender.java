package day17udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UdpSender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatagramSocket socket = null;

		try {
			// 객체 생성
			socket = new DatagramSocket();

			// 데이터 생성
			String msg = "저는 51입니다";
			byte[] buf = msg.getBytes();

			// 데이터 목적지 생성
			DatagramPacket packet = new DatagramPacket(buf, buf.length, 
					InetAddress.getByName("70.12.111.50"), 5000);
			// 발사
			socket.send(packet);

		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
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
