package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/resultPage")
public class resultPage extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		double loan = Double.parseDouble(request.getParameter("loan"));
		double rate = Double.parseDouble(request.getParameter("rate"));
		double period = Double.parseDouble(request.getParameter("period"));

		// 상환금액 구하기
		int result = (int) ((loan * rate * (Math.pow(1 + rate, period))) / ((Math.pow(1 + rate, period)) - 1));
		int result_month = (int) (result / period);

		out.print("<html><body><h1>");
		out.print("총상환액 :");
		out.println(result+ "<br>");
		out.print("매월상환액 :");
		out.println(result_month+ "<br>");
		out.print("상세내역: <br>");
		for(int i=1;i<=period;i++){
			out.println(i + "개월차 : " + result_month + "<br>");
		}
		out.print("</h1></body></html>");
		out.close();

	}
	

}
