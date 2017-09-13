package day18;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UdpReceiverThread extends Thread {

	public void run() {
		DatagramSocket socket = null;

		try {
			socket = new DatagramSocket(5112);
			while (true) {
				// 빈 바이트 배열을 준비
				byte[] buf = new byte[512];
				// 빈 패킷을 만들어서 빈 바이트 배열을 연결해두기
				DatagramPacket packet = new DatagramPacket(buf, buf.length);
				// 소켓.receive메소드에 빈 패킷 갖다 대놓기
				socket.receive(packet);
				// 그러면 수신됐을때 바이트 배열에 내용이 차있음ㅇㅇ
				
				System.out.println("상대방 : " + new String(buf).trim());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			socket.close();
		}
	}

}
