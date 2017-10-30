package controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import dao.CommentDao;
import dto.BoardVO;

public class BoardDeleteAction implements Action {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String num=request.getParameter("num");
		
		BoardDAO bDao=BoardDAO.getInstance();
		CommentDao.getInstance().deleteCommentByBoardNum(Integer.parseInt(num));
		
		bDao.deleteBoard(num);
		new BoardListAction().execute(request, response);
		
	}
}
