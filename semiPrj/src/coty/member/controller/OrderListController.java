package coty.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.member.service.OrderService;
import coty.member.vo.MemberVo;
import coty.member.vo.OrderVo;
import coty.util.PageVo;

@WebServlet("/member/orderlist")
public class OrderListController extends HttpServlet{
	
	private OrderService os = new OrderService();
	
	//게시글 목록 (화면)
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
		
		//데이터 꺼내기 (페이징처리 준비)
		int currentPage = Integer.parseInt(req.getParameter("page"));
		int listCount = os.selectCount();
		int pageLimit = 5;
		int boardLimit = 5;
		
	   // 로그인 데이터 가져오기
      MemberVo loginMember = (MemberVo) req.getSession().getAttribute("loginMember");

		
		//데이터 뭉치기
		PageVo pagevo = new PageVo(listCount, currentPage, pageLimit, boardLimit);
		
		//서비스 호출
		List<OrderVo> OrderList = os.selectList(pagevo ,loginMember);
	
		//화면
		
		req.setAttribute("OrderList", OrderList);
		req.setAttribute("pagevo", pagevo);
		req.getRequestDispatcher("/WEB-INF/views/member/orderList.jsp").forward(req, resp);		
	
		}catch (Exception e) {
		System.out.println("[ERORR] 게시글 조회중 예외발생..");
		e.printStackTrace();
		req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
	}
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}

