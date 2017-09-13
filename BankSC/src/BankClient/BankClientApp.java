package BankClient;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;
import BankServer.AccountManager;

public class BankClientApp {
	public static void main(String[] args) {
		DatagramSocket socket = null;
		Scanner scan = new Scanner(System.in);
		try {
			socket = new DatagramSocket(5000);
		} catch (SocketException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		while(true)
		{
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성|2.계좌조회|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");
			int sel = scan.nextInt();
			try{
				if( sel == 1 ){
					System.out.println("----------");
					System.out.println("계좌생성");
					System.out.println("----------");
					System.out.print("계좌번호: ");
					String ano = scan.next();
					System.out.print("계좌주: ");
					String owner = scan.next();
					System.out.print("최초입금액: ");
					int balance = scan.nextInt();
					String msg = "계좌생성 " + owner + " " + ano + " " + balance;
					byte[] sendBuf = msg.getBytes();
					DatagramPacket sendPacket
					= new DatagramPacket(sendBuf, sendBuf.length, 
							InetAddress.getByName("70.12.111.58"),5000);
					socket.send(sendPacket);
					
					byte[] buf = new byte[512];
					DatagramPacket packet
					= new DatagramPacket(buf, buf.length);
					socket.receive(packet);
					System.out.println(new String(buf));
					
					
				} else if(sel==2) {
					System.out.println("----------");
					System.out.println("계좌조회");
					System.out.println("----------");
					System.out.print("계좌번호: ");
					String ano = scan.next();
					String msg = "계좌조회 " + ano;
					
					
					byte[] sendBuf = msg.getBytes();
					DatagramPacket sendPacket
					= new DatagramPacket(sendBuf, sendBuf.length, 
							InetAddress.getByName("70.12.111.58"),5000);
					socket.send(sendPacket);
					
					
					byte[] buf = new byte[512];
					DatagramPacket packet
					= new DatagramPacket(buf, buf.length);
					socket.receive(packet);
					System.out.println(new String(buf));
					
				}else if( sel==3) {
					System.out.println("----------");
					System.out.println("계좌조회");
					String ano = scan.next();
					System.out.println("----------");
					System.out.print("금액: ");
					int balance = scan.nextInt();
					
					String msg = "출금 "+ano+" "+ balance;
					byte[] sendBuf = msg.getBytes();
					DatagramPacket sendPacket
					= new DatagramPacket(sendBuf, sendBuf.length, 
							InetAddress.getByName("70.12.111.58"),5000);
					socket.send(sendPacket);
					
					
					byte[] buf = new byte[512];
					DatagramPacket packet
					= new DatagramPacket(buf, buf.length);
					socket.receive(packet);
					System.out.println(new String(buf));
				}
				
				
				
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
