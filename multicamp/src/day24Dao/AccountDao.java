package day24Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import day23.Student;
import day24Model.Account;

public class AccountDao {

	private Connection conn;

	public AccountDao() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/account_db", "root", "mysql");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} // end AccountDao()

	public int createAccount(Account account) {
		String sql = "INSERT INTO account(aNum,owner,balance)" + "VALUES(?,?,?)";
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, account.getaNum());
			pstmt.setString(2, account.getOwner());
			pstmt.setInt(3, account.getBalance());
			result = pstmt.executeUpdate();
			System.out.println(result);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	} // end create

	public Account selectAccount(String aNum) {
		String sql = "SELECT * FROM account WHERE aNum = ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Account account = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, aNum);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				account = new Account();
				account.setaNum(rs.getString("aNum"));
				account.setOwner(rs.getString("owner"));
				account.setBalance(rs.getInt("balance"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return account;
	} // end selectAccount

	public List<Account> selectAll() {
		String sql = "SELECT * FROM account";
		List<Account> list = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Account account = new Account();
				account.setaNum(rs.getString("aNum"));
				account.setOwner(rs.getString("owner"));
				account.setBalance(rs.getInt("balance"));
				list.add(account);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;

	}// end showAll()

	public int updateAccount(Account account) {
		String sql = "UPDATE account SET balance=? where aNum=?";
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, account.getBalance());
			pstmt.setString(2, account.getaNum());
			result = pstmt.executeUpdate();
			System.out.println(result);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;

	}// end update

	/*
	 * public int withdrawAccount(Account account, int amount) {
	 * 
	 * String sql = "UPDATE account SET balance=? where aNum=?";
	 * PreparedStatement pstmt = null; int result = 0; try { pstmt =
	 * conn.prepareStatement(sql); pstmt.setInt(1, account.getBalance() -
	 * amount); pstmt.setString(2, account.getaNum()); result =
	 * pstmt.executeUpdate(); System.out.println(result); } catch (SQLException
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); } finally {
	 * try { if (pstmt != null) pstmt.close(); } catch (SQLException e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); } } return result; }
	 * // end withdraw()
	 * 
	 * public int depositAccount(Account account, int amount) {
	 * 
	 * String sql = "UPDATE account SET balance=? where aNum=?";
	 * PreparedStatement pstmt = null; int result = 0; try { pstmt =
	 * conn.prepareStatement(sql); pstmt.setInt(1, account.getBalance() +
	 * amount); pstmt.setString(2, account.getaNum()); result =
	 * pstmt.executeUpdate(); System.out.println(result); } catch (SQLException
	 * e) { // TODO Auto-generated catch block e.printStackTrace(); } finally {
	 * try { if (pstmt != null) pstmt.close(); } catch (SQLException e) { //
	 * TODO Auto-generated catch block e.printStackTrace(); } } return result; }
	 * // end depositAccount()
	 */

}
