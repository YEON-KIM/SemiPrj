package coty.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.member.service.OrderService;
import coty.member.vo.MemberVo;
import coty.member.vo.OrderVo;
@WebServlet("/member/orderhistory")
public class OrderhistoryController extends HttpServlet{
	//게시글 상세 조회
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		//데이터꺼내기
		String no = req.getParameter("no");
		
	   // 로그인 데이터 가져오기
      MemberVo loginMember = (MemberVo) req.getSession().getAttribute("loginMember");
	
		//데이터 뭉치기
	
		//서비스 호출
		OrderService os = new OrderService();
			OrderVo vo = os.selectOne(no, loginMember);
			
			System.out.println(vo);
				
		//화면
		req.setAttribute("orderVo", os);
		req.getRequestDispatcher("/WEB-INF/views/member/orderhistory.jsp").forward(req, resp);
		
	} catch (Exception e) {
		System.out.println("[ERORR] 게시글 상세조회중 에러발생..");
		e.printStackTrace();
	}

 }

}//class
