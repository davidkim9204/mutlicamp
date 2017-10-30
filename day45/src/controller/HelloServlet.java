package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello.do")
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		System.out.println(req.getParameter("name"));
		System.out.println(req.getParameter("age"));
		PrintWriter pw = resp.getWriter();
		pw.print(req.getParameter("name"));
		pw.print(req.getParameter("age"));
		
		/*PrintWriter pw = resp.getWriter();
		pw.print("<html>");
		pw.print("<head>");
		pw.print("<body>");
		pw.print("<h1>Hello World</h1>");
		pw.print("</body>");
		pw.print("</head>");
		pw.print("</html>");
		pw.flush();*/
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		System.out.println(req.getParameter("name"));
		System.out.println(req.getParameter("age"));
		PrintWriter pw = resp.getWriter();
		pw.println("good");
		pw.flush();
	}
}
