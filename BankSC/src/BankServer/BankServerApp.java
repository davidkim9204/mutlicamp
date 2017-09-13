package BankServer;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//계좌 생성  계좌주 계좌번호 초기잔고     계좌이미있음/잘됐음
public class BankServerApp {
	public static void main(String[] args) {
		AccountManager am = new AccountManager();
		BankServerApp app = new BankServerApp(am);
		app.createSocket(5000);
		app.receiveMsg();
		
	}
	
	private AccountManager accountManaer;
	private DatagramSocket socket = null;

	public BankServerApp() {

	}

	public BankServerApp(AccountManager am) {
		this.accountManaer = am;
	}

	public void createSocket(int port) {
		try {
			socket = new DatagramSocket(port);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void receiveMsg() {
		while(true) {
			byte[] buf = new byte[512];
			DatagramPacket packet = new DatagramPacket(buf, buf.length);
			try {
				socket.receive(packet);
				String msg = new String(buf).trim();
				String[] values = msg.split(" ");
				System.out.println(msg);

				if (values[0].equals("계좌생성")) {
					System.out.println("?????");
					String owner = values[1];
					String ano = values[2];
					int balance = Integer.parseInt(values[3]);
					System.out.println("?????");
					boolean result = accountManaer.createAccount(owner, ano, balance);
					byte[] sendBuf = (result? "성공":"실패").getBytes();
					DatagramPacket sendPacket = new DatagramPacket(sendBuf, sendBuf.length,
							InetAddress.getByName("70.12.111.58"),5000);
					socket.send(sendPacket);
					
					System.out.println(sendPacket);

				} else if (values[0].equals("계좌조회")) {
					System.out.println("됐나1");
					String ano = values[1];
					int balance = accountManaer.getBalance(ano);
					byte[] sendBuf = ("잔고 "+balance).getBytes();
					DatagramPacket sendPacket = new DatagramPacket(sendBuf, sendBuf.length,
							InetAddress.getByName("70.12.111.58"),5000);
					socket.send(sendPacket);
					System.out.println(balance);

				} else if (values[0].equals("출금")) {
					String ano = values[1];
					System.out.println(ano);
					int amount = Integer.parseInt(values[2]);
					boolean result = accountManaer.withDraw(ano, amount);
					byte[] sendBuf = (result? "성공": "실패").getBytes();
					DatagramPacket sendPacket = new DatagramPacket(sendBuf, sendBuf.length,
							InetAddress.getByName("70.12.111.58"),5000);
					socket.send(sendPacket);

				} else if (values[0].equals("입금")) {
					String ano = values[1];
					int amount = Integer.parseInt(values[2]);
					accountManaer.deposit(ano, amount);
					byte[] sendBuf = ("입금"+amount).getBytes();
					DatagramPacket sendPacket = new DatagramPacket(sendBuf, sendBuf.length,
							InetAddress.getByName("70.12.111.58"),5000);
					socket.send(sendPacket);

				} else {
					System.out.println("노커맨드");
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
			} 
		}
	}

}
