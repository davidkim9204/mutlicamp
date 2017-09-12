package day17.bank;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AccountManager {
	private List<Account> accountList = new ArrayList<>();
	
	public void addAccount(String ano, String owner, int balance) {
		Account account = new Account();
		account.setAno(ano);
		account.setOwner(owner);
		account.setBalance(balance);
		accountList.add(account);
	}
	
	public List<Account> getAccountList(){
		return accountList;
	}
	
	public void init(){
		File file = new File("account.dat");
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
	}
	
	public void save() {
		File file = new File("account.dat");
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
	}

}
