package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import dto.MemberVO;

@WebServlet("/memberUpdate.do")
public class MemberUpdateServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userid = req.getParameter("userid");
		MemberDao mDao = MemberDao.getInstance();
		
		MemberVO mVo = mDao.getMember(userid);
		req.setAttribute("mVo", mVo);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("member/memberUpdate.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		String userid = req.getParameter("userid");
		String pwd = req.getParameter("pwd");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String admin = req.getParameter("admin");
		
		MemberVO mVo = new MemberVO();
		mVo.setUserid(userid);
		mVo.setPwd(pwd);
		mVo.setEmail(email);
		mVo.setPhone(phone);
		mVo.setAdmin(Integer.parseInt(admin));
		
		MemberDao mDao = MemberDao.getInstance();
		
		mDao.updateMember(mVo);
		resp.sendRedirect("login.do");
	}
	
	
}
