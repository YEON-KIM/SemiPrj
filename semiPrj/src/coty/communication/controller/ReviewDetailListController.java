package coty.communication.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.communication.service.ReviewService;
import coty.communication.vo.ReviewVo;
import coty.designer.service.DesignerService;
import coty.designer.vo.MentVo;

@WebServlet("/communication/reviewdetaillist")
public class ReviewDetailListController extends HttpServlet {

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			//데이터 꺼내기
			String no = req.getParameter("no");
			
			//데이터 뭉치기
			
			//서비스 호출
			ReviewService rvs = new ReviewService();
			ReviewVo vo = rvs.selectOne(no);
			
			DesignerService ds = new DesignerService();
			MentVo mentVo = ds.ment(no);

			
			//화면
			req.setAttribute("reviewVo", vo);
			req.setAttribute("MentVo", mentVo);
			req.getRequestDispatcher("/WEB-INF/views/communication/review_detail_list.jsp").forward(req, resp);
			
		}catch(Exception e) {
			System.out.println("[ERROR] 게시글 상세조회중 예외 발생 ...");
			e.printStackTrace();
		}
		
	}//method
	
}
