package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Loan;
import service.LoanService;

@WebServlet("/loan.do")
public class LoanServlet extends HttpServlet {

	private LoanService service = new LoanService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("loan_input.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int balance = Integer.parseInt(req.getParameter("balance"));
		double rate = Double.parseDouble(req.getParameter("rate"));
		int period = Integer.parseInt(req.getParameter("period"));
		List<Loan> list = service.calLevelPayment(balance, rate, period);

		req.setAttribute("list", list);
		req.getRequestDispatcher("loan_result.jsp").forward(req, resp);
	}

}
