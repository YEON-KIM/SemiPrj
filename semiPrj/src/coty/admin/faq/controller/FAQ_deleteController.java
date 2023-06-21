package coty.admin.faq.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.admin.faq.dvo.FAQService;

@WebServlet("/admin/FAQ_delete")
public class FAQ_deleteController extends HttpServlet {

	private FAQService fs = new FAQService();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String no = req.getParameter("no");
		
		int result = 0;
		try {
			result = fs.delete(no);
		} catch (Exception e) {
			System.out.println("에러 ㅜㅜ");
			e.printStackTrace();
		}
		
		if(result == 1) {
			resp.sendRedirect("/admin/FAQ_list?page=1");
		}else {
			req.getRequestDispatcher("삭제실패페이지~~~").forward(req, resp);
		}
	}
	
}
