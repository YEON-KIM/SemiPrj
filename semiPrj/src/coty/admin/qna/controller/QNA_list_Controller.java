package coty.admin.qna.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.admin.qna.dvo.QNAService;
import coty.admin.qna.dvo.QNA_a_Vo;
import coty.util.PageVo;

@WebServlet("/admin/QNA_list")
public class QNA_list_Controller extends HttpServlet{
	
	private QNAService qs = new QNAService();
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {			
			
			//데이터 꺼내기
			int currentPage = Integer.parseInt(req.getParameter("page"));
			int listCount = qs.selectCount();
			int pageLimit = 5;
			int boardLimit = 5;
			
						
			//데이터 뭉치기
			
			PageVo pageVo = new PageVo(listCount, currentPage, pageLimit, boardLimit);
			
			
			//서비스 호출				
			List<QNA_a_Vo> QNAList = qs.selectList_A(pageVo);

			
			
			//화면
			req.setAttribute("QNAList", QNAList);
			req.setAttribute("pageVo", pageVo);
			req.getRequestDispatcher("/WEB-INF/views/admin/QNA_list.jsp").forward(req, resp);
			
		} catch (Exception e) {
			System.out.println("게시글 조회중 예외발생");
			e.printStackTrace();
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
		
	}

}
