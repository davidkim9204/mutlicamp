package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.MemberDao;
import dto.MemberVO;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = "member/login.jsp";
		
		HttpSession session = req.getSession();
		
		if(session.getAttribute("loginUser")!=null) {
			url="main.jsp";
		}
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url = "member/login.jsp";
		
		String userid = req.getParameter("userid");
		String pwd = req.getParameter("pwd");
		
		MemberDao mDao = MemberDao.getInstance();
		int result = mDao.userCheck(userid, pwd);
		
		if(result==1) {
			MemberVO mVo = mDao.getMember(userid);
			HttpSession session = req.getSession();
			session.setAttribute("loginUser", mVo);
			req.setAttribute("message", "회원가입에 성공했습니다.");
			url="main.jsp";
		}else if(result==0) {
			req.setAttribute("message", "비밀번호가 맞지 않습니다.");
		}else if(result==-1) {
			req.setAttribute("message", "존재하지 않는 회원입니다.");

		}
		
		RequestDispatcher dispatcher = req.getRequestDispatcher(url);
		dispatcher.forward(req, resp);
	}
}
