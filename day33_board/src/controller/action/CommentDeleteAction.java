package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CommentDao;

public class CommentDeleteAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int cId = Integer.parseInt(request.getParameter("cId"));
		int num = Integer.parseInt(request.getParameter("boardNum"));
		
		CommentDao.getInstance().deleteComment(cId);
		
		response.sendRedirect("BoardServlet?command=board_view&num="+num);
	}

}
