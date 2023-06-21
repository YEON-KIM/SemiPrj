package coty.communication.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.communication.service.ReviewService;
import coty.communication.vo.ReviewVo;
import coty.util.PageVo;

@WebServlet("/communication/reviewlist")
public class ReviewLIstController extends HttpServlet{

	private ReviewService rvs = new ReviewService(); 
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	try {
				
				//데이터 꺼내기 (페이징 처리를 위한 데이터 준비)
				String pageParam =req.getParameter("page");
				int currentPage = (pageParam != null) ? Integer.parseInt(pageParam) : 1;
				int listCount = rvs.selectCount();
				int pageLimit = 5;
				int boardLimit = 5;
				
				//데이터 뭉치기
				PageVo pageVo = new PageVo(listCount, currentPage, pageLimit, boardLimit);
				
				//서비스 호출
				List<ReviewVo> reviewList = rvs.selectList(pageVo);
				
				//화면
				req.setAttribute("reviewList", reviewList);
				req.setAttribute("pageVo", pageVo);
				req.getRequestDispatcher("/WEB-INF/views/communication/review_list.jsp").forward(req, resp);
				
			}catch(Exception e) {
				System.out.println("[ERROR] 게시글 조회중 예외 발생 ...");
				e.printStackTrace();
				req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
			}
		
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	
	}
	
}
