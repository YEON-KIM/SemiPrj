package coty.admin.qna.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.admin.qna.dvo.QNAService;
import coty.admin.qna.dvo.QNA_a_Vo;


@WebServlet("/communication/QNA_view_c")
public class QNA_view_c_Controller extends HttpServlet {
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//데이터 꺼내기
			String no = req.getParameter("no");
			//데이터 뭉치기
			
			//서비스 호출
			QNAService bs = new QNAService();
			QNA_a_Vo vo = bs.selectOne(no);
			
			//화면
			
			req.getSession().setAttribute("QNA_a_Vo", vo);
			
			req.getRequestDispatcher("/WEB-INF/views/communication/QNA_view_c.jsp").forward(req, resp);
			
		}catch(Exception e) {
			System.out.println("게시글 상세조회중 예외발생...");
			e.printStackTrace();
		}
	}

}
