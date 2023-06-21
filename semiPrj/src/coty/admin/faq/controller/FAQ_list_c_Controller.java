package coty.admin.faq.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.admin.faq.dvo.FAQService;
import coty.admin.faq.dvo.FAQ_a_Vo;
import coty.util.PageVo;

@WebServlet("/communication/FAQ_list")
public class FAQ_list_c_Controller extends HttpServlet{
	
	private FAQService fs = new FAQService();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			int currentPage = Integer.parseInt(req.getParameter("page"));
			int listCount = fs.selectCount();
			int pageLimit = 5;
			int boardLimit = 5;
			
			PageVo pageVo = new PageVo(listCount, currentPage, pageLimit, boardLimit);
			
			List<FAQ_a_Vo> FAQList = fs.selectList(pageVo);

			req.setAttribute("FAQList", FAQList);
			req.setAttribute("pageVo", pageVo);
			req.getRequestDispatcher("/WEB-INF/views/communication/FAQ_list_c.jsp").forward(req, resp);

			
		} catch (Exception e) {
			System.out.println("게시글 조회중 예외발생");
			e.printStackTrace();
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
		
	}
	
	

}
