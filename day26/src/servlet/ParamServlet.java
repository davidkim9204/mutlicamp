package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ParamServlet")
public class ParamServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><body><h1>");
		out.print("Get로 들어온 ParamServlet <br>");
		out.print("id: " + req.getParameter("id"));
		out.print("<br> age : " + req.getParameter("age"));
		out.print("</h1></body></html>");
		out.close();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><body><h1>");
		out.print("Post로 들어온 ParamServlet <br>");
		out.print("id: " + req.getParameter("id"));
		out.print("<br> age : " + req.getParameter("age"));
		out.print("</h1></body></html>");
		out.close();

	}

}
