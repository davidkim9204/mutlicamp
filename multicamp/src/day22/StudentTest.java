package day22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {

		String name = "Lee";
		int age = 33;
		int score = 40;
		// insertStudent(name, age, score);

		List<Student> students = selectAll();
		for (Student s : students) {
			System.out.println(s.getName());
		}

	}

	public static Student selectStudent(String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Student resultStudent = new Student();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "mysql");

			String sql = "SELECT * FROM student WHERE name = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				String resultName = rs.getString("name");
				int resultAge = rs.getInt(2);
				int resultScore = rs.getInt("score");
				resultStudent.setName(resultName);
				resultStudent.setAge(resultAge);
				resultStudent.setScore(resultScore);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
				if (rs != null)
					rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		return resultStudent;
	}

	public static List<Student> selectAll() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<Student> list = new ArrayList<>();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "mysql");

			String sql = "SELECT * FROM student";

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				String resultName = rs.getString("name");
				int resultAge = rs.getInt(2);
				int resultScore = rs.getInt("score");
				Student resultStudent = new Student();
				resultStudent.setName(resultName);
				resultStudent.setAge(resultAge);
				resultStudent.setScore(resultScore);
				list.add(resultStudent);
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
				if (rs != null)
					rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		return list;
	}

	public static void insertStudent(String name, int age, int score) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "mysql");

			String sql = "INSERT INTO student(name,age,score)" + "VALUES(?,?,?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setInt(3, score);
			pstmt.executeUpdate();
			System.out.println("done");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally       {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	public static void updateStudent(String name, int age, int score) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "mysql");

			String sql = "UPDATE student SET age=?,score=? where name=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, age);
			pstmt.setInt(2, score);
			pstmt.setString(3, name);
			pstmt.executeUpdate();
			System.out.println("done");

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int deleteStudent(String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db", "root", "mysql");

			String sql = "DELETE FROM student WHERE name=?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			result = pstmt.executeUpdate();
			System.out.println(result);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
