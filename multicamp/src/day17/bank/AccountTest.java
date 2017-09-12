package day17.bank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountTest {
	public static void main(String[] args) {
		
		AccountManager am = new AccountManager();
		
		am.init();
		
/*		
   File file = new File("account.dat");
		List<Account> accountList = new ArrayList<>();
		if( file.exists() )
		{
			ObjectInputStream in = null;
			try{
				in = new ObjectInputStream(
						new FileInputStream(file));
				accountList = (List<Account>) in.readObject();
			}
			catch (IOException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			finally{
				try {
					if(in != null)
						in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
*/
		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		while (run) {
			System.out.println("-----------------------------------");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("-----------------------------------");
			System.out.print("선택>");

			int selectNo = scanner.nextInt();
			if (selectNo == 1) {
				System.out.println("----------계좌생성----------");
				System.out.print("계좌번호 : ");
				String ano = scanner.next();
				System.out.print("계좌주 : ");
				String owner = scanner.next();
				System.out.print("초기잔고 : ");
				int balance = scanner.nextInt();
				am.addAccount(ano, owner, balance);
		/*
				Account account = new Account();
				account.setAno(ano);
				account.setOwner(owner);
				account.setBalance(balance);
				accountList.add(account);
		*/
				
			} else if (selectNo == 2) {
				System.out.println("계좌목록");
				for(Account a : am.getAccountList())
					System.out.println(a);
		/*
				 for (Account a : accountList)
					System.out.println(a);
		*/
			} else if (selectNo == 3) {
			} else if (selectNo == 4) {
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		
		am.save();
	/*	
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream(file));
			out.writeObject(accountList);
			out.flush();
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(out!=null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	*/
		
	}
}







