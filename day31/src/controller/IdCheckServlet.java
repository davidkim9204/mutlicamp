package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;

@WebServlet("/idCheck.do")
public class IdCheckServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userid = req.getParameter("userid");
		
		MemberDao mDao = MemberDao.getInstance();
		
		int result = mDao.confirmID(userid);
		
		req.setAttribute("userid", userid);
		req.setAttribute("result", result);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("member/idCheck.jsp");
		dispatcher.forward(req, resp);

	}
	
	
}
