package controller.action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CommentDao;
import dto.CommentVO;

public class CommentWriteAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// 넘어오는 파라미터를 먼저 줍줍
		CommentVO cVo = new CommentVO();
		cVo.setContent(request.getParameter("content"));
		cVo.setWriter(request.getParameter("writer"));
		cVo.setBoardNum(Integer.parseInt(request.getParameter("boardNum")));

		// 현재 게시글의 가장 큰 댓글넘버를 얻어와서
		int maxNum = CommentDao.getInstance().getMaxNumComment(cVo.getBoardNum());

		// 하나 늘려서 박고
		cVo.setNum(maxNum + 1);
		// 디비에 삽입
		CommentDao.getInstance().insertComment(cVo);
		// 해당 게시글의 보드_뷰로 리다이렉트
		response.sendRedirect("BoardServlet?command=board_view&num=" + cVo.getBoardNum());
	}
}
