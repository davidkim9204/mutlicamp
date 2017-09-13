package day18;

public class UdpChatApp {
	public static void main(String[] args) {
		UdpSenderThread sender = new UdpSenderThread();
		UdpReceiverThread receiver = new UdpReceiverThread();
		
		sender.start();
		receiver.start();
	}

}
