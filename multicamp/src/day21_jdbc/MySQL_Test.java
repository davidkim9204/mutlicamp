package day21_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQL_Test {
	public static void main(String[] args) {
		Connection conn = null;
		//1.클래스 적재
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//2.필요한 정보를 전달하면서 객체를 요청
			conn= DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/book_db"
					, "root", "mysql");
			
			String title = "aabbbbbaaa";
			String publisher = "입력출판사";
			String year = "2017";
			int price = 5000;
			String sql = "INSERT INTO books (title, publisher,year ,price) "
					+ "VALUES (?,?,?,?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, title);
			pstmt.setString(2, publisher);
			pstmt.setString(3, year);
			pstmt.setInt(4, price);
			int result = pstmt.executeUpdate();
			System.out.println(result);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}










