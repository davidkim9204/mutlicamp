package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/elec.do")
public class ElecServlet extends HttpServlet {
	final static double B_FEE_1 = 910;
	final static double B_FEE_2 = 1600;
	final static double B_FEE_3 = 7300;

	final static double U_FEE_1 = 93.3;
	final static double U_FEE_2 = 187.9;
	final static double U_FEE_3 = 280.6;
	final static double U_FEE_4 = 709.5;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("elec_input.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int use = Integer.parseInt(req.getParameter("use"));
		
		double fee;
		//사용 구간 별 요금 계산
		if (use <= 200) {
			fee = B_FEE_1 + use * U_FEE_1;
		} else if (use <= 400) {
			fee = B_FEE_2 + 200 * U_FEE_1 + (use - 200) * U_FEE_2;
		} else if (use <= 1000) {
			fee = B_FEE_3 + 200 * U_FEE_1 + 200 * U_FEE_2 + (use - 400) * U_FEE_3;
		} else {
			fee = B_FEE_3 + 200 * U_FEE_1 + 200 * U_FEE_1 + 600 * U_FEE_3 + (use - 1000) * U_FEE_4;
		}
		
		
		req.setAttribute("result", fee);
		req.getRequestDispatcher("elecResult.jsp").forward(req, resp);
	}
}
