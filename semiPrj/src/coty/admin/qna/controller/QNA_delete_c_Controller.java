package coty.admin.qna.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.admin.qna.dvo.QNAService;

@WebServlet("/communication/QNA_delete_c")
public class QNA_delete_c_Controller extends HttpServlet{
	
	private QNAService ns = new QNAService();

	//공지사항 삭제
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//데이터꺼내기
		String no = req.getParameter("no");
		
		//데이터 뭉치기
		
		//서비스 호출
		int result = 0;
		try {
			result = ns.delete_q(no);
		} catch (Exception e) {
			System.out.println("에러 ㅜㅜ");
			e.printStackTrace();
		}
		
		//화면
		if(result == 1) {
			resp.sendRedirect("/communication/QNA_list_c?page=1");
		}else {
			req.getRequestDispatcher("삭제실패페이지~~~").forward(req, resp);
		}
		
	}

}
