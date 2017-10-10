package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Member;

@WebServlet("/allMember.do")
public class AllMemberServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String url = "jdbc:mysql://localhost/student_db";
		String userId = "root";
		String userPw = "mysql";
		String sql = "select * from member";
		List<Member> list = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, userId, userPw);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				Member member = new Member();
				member.setName(rs.getString(1));
				member.setUserid(rs.getString(2));
				member.setPwd(rs.getString(3));
				member.setEmail(rs.getString(4));
				member.setPhone(rs.getString(5));
				member.setAdmin(rs.getInt(6));
				list.add(member);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		req.setAttribute("memberList", list);
		req.getRequestDispatcher("allMember.jsp").forward(req, resp);
		
		
		
	}
	
}
