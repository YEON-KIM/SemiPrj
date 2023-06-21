package coty.admin.faq.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.admin.faq.dvo.FAQService;
import coty.admin.faq.dvo.FAQ_a_Vo;

@MultipartConfig(
		maxFileSize = 1024 * 1024 * 50,
		maxRequestSize = 1024 * 1024* 50 * 10
	)

@WebServlet("/admin/FAQ_write")
public class FAQ_writeController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/admin/FAQ_write.jsp").forward(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String writer = req.getParameter("writer");
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		
		FAQ_a_Vo vo = new FAQ_a_Vo();
		vo.setWriter(writer);
		vo.setTitle(title);
		vo.setContent(content);
		
		int result = 0;
		try {
			FAQService fs = new FAQService();
			result = fs.write(vo);
		} catch (Exception e) {
			System.out.println("[ERROR] 게시글 작성 중 예외발생 ...");
			e.printStackTrace();
		}
		
		if(result == 1) {
			req.getSession().setAttribute("alertMsg", "게시글 작성 성공");
			resp.sendRedirect("/admin/FAQ_list?page=1");

		}else{
			req.getSession().setAttribute("alertMsg", "게시글 작성 실패..");
			resp.sendRedirect("/");
		}
	}
	
	
}


