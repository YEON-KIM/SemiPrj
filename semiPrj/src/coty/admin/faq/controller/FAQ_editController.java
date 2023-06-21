package coty.admin.faq.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import coty.admin.faq.dvo.FAQService;
import coty.admin.faq.dvo.FAQ_a_Vo;

@MultipartConfig(
		maxFileSize = 1024 * 1024 * 50,
		maxRequestSize = 1024 * 1024* 50 * 10
)

@WebServlet("/admin/FAQ_edit")
public class FAQ_editController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String no =req.getParameter("no");
		
		int result = 0;
		try {
			FAQService fs = new FAQService();
			FAQ_a_Vo vo = fs.selectOne(no);
			
			req.setAttribute("FAQ_a_Vo", vo);
			req.getRequestDispatcher("/WEB-INF/views/admin/FAQ_edit.jsp").forward(req, resp);

		}catch (Exception e) {
			System.out.println("에러 ㅠㅠ");
			e.printStackTrace();
		}
		
		if(result == 1) {
			req.getSession().setAttribute("alertMsg", "게시글 수정 성공");
			

		}else{
			req.getSession().setAttribute("alertMsg", "게시글 수정 실패..");
			
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession s = req.getSession();
		FAQ_a_Vo FAQ_a_Vo = (FAQ_a_Vo)s.getAttribute("FAQ_a_Vo");
		
		String Title = req.getParameter("Title");
		String writer = req.getParameter("writer");
		String Content = req.getParameter("Content");
		
		FAQ_a_Vo vo = new FAQ_a_Vo();
		vo.setNo(FAQ_a_Vo.getNo());
		vo.setTitle(Title);
		vo.setWriter(writer);
		vo.setContent(Content);
		
		
		int result = 0;
		
		
		try {
			FAQService fs = new FAQService();
			result = fs.update(vo);	
		} catch (Exception e) {
			System.out.println("에러 ㅠㅠ");
			e.printStackTrace();
		}
		
		
		if(result == 1) {
		req.getSession().setAttribute("alertMsg", "게시글 수정 성공");
		resp.sendRedirect("/admin/FAQ_list?page=1");
		}else{
			req.getSession().setAttribute("alertMsg", "게시글 수정 실패..");
			resp.sendRedirect("/");	
		}
		
		s.invalidate();
	}

}
