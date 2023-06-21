package coty.admin.faq.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.admin.faq.dvo.FAQService;
import coty.admin.faq.dvo.FAQ_a_Vo;

@WebServlet("/admin/FAQ_view")
public class FAQ_viewController extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String no = req.getParameter("no");
			
			FAQService fs = new FAQService();
			FAQ_a_Vo vo = fs.selectOne(no);
			
			req.getSession().setAttribute("FAQ_a_Vo", vo);
			
			req.getRequestDispatcher("/WEB-INF/views/admin/FAQ_view.jsp").forward(req, resp);
			
		} catch (Exception e) {
			System.out.println("게시글 상세조회중 예외발생...");
			e.printStackTrace();
		}
	}

}
