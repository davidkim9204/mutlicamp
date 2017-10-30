package controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import day33_Web.NaverApiService;

@WebServlet("/naverBookSearch.do")
public class NaverBookServlet extends HttpServlet{
	private NaverApiService service = new NaverApiService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String keyword = req.getParameter("keyword");
		List<HashMap<String, Object>> items = service.search(keyword);
		req.setAttribute("items", items);
		req.getRequestDispatcher("naverBook.jsp").forward(req, resp);
	}

}
