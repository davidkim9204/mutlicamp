package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addition")
public class MyServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		int num1 = 20;
		int num2 = 10;
		int add = num1 + num2;
		PrintWriter pw = resp.getWriter();
		pw.println("<html><head><title>addition</title></head>");
		pw.println("<body>");
		pw.println(num1 + " + " + num2 + " = " + add  );
		pw.println("</body>");
		pw.println("</html>");
		pw.flush();
	}
	
}
