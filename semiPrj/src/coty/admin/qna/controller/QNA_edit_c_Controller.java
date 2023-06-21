package coty.admin.qna.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import coty.admin.notice.total.Notice_a_Vo;
import coty.admin.qna.dvo.QNAService;
import coty.admin.qna.dvo.QNA_a_Vo;
import coty.admin.service.NoticeService;

@MultipartConfig(
		maxFileSize = 1024 * 1024 * 50,
		maxRequestSize = 1024 * 1024* 50 * 10
)

@WebServlet("/communication/QNA_edit_c")
public class QNA_edit_c_Controller extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String no = req.getParameter("no");		
		//서비스 호출
		//디비가서 select 한 후 vo 얻기
		
		int result = 0;
		try {
			QNAService ns = new QNAService();
			//result = ns.update(writer, Title, Content);	//xxx
			QNA_a_Vo vo = ns.selectOne(no);
			
			req.setAttribute("QNA_a_Vo", vo);
			req.getRequestDispatcher("/WEB-INF/views/communication/QNA_edit_c.jsp").forward(req, resp);

		} catch (Exception e) {
			System.out.println("에러 ㅠㅠ");
			e.printStackTrace();
		}
		
		
		//화면
		if(result == 1) {
			req.getSession().setAttribute("alertMsg", "게시글 수정 성공");
		}else{
			req.getSession().setAttribute("alertMsg", "게시글 수정 실패..");
			
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession s = req.getSession();
		QNA_a_Vo QNA_a_Vo = (QNA_a_Vo)s.getAttribute("QNA_a_Vo");
		
		String Title = req.getParameter("Title");
		String writer = req.getParameter("writer");
		String Content_q = req.getParameter("Content_q");
		//데이터 뭉치기
		QNA_a_Vo vo = new QNA_a_Vo();
		vo.setNo(QNA_a_Vo.getNo());
		vo.setTitle(Title);
		vo.setWriter(writer);
		vo.setContent_q(Content_q);

		
		//서비스 로직	//클라한테 전달받은 데이터들을 가지고 업데이트 쿼리 실행
		int result = 0;
		try {
			QNAService ns = new QNAService();	
			result = ns.update_q(vo);	
			
		} catch (Exception e) {
			System.out.println("에러 ㅠㅠ");
			e.printStackTrace();
		}
		

		if(result == 1) {
		req.getSession().setAttribute("alertMsg", "게시글 수정 성공");
		resp.sendRedirect("/communication/QNA_list_c?page=1");
		}else{
			req.getSession().setAttribute("alertMsg", "게시글 수정 실패..");
			resp.sendRedirect("/");	
		}
		
		s.invalidate();	
	}

}
