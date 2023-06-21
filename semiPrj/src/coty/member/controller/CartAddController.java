package coty.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.member.service.CartService;
import coty.member.vo.CartVo;
import coty.member.vo.MemberVo;

@WebServlet("/member/cartadd")
public class CartAddController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/Cart.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 데이터 꺼내기
		String amount = req.getParameter("pCnt");
		
		String no = req.getParameter("pNo");
		// 로그인 데이터 가져오기
		MemberVo loginMember = (MemberVo) req.getSession().getAttribute("loginMember");
		System.out.println(loginMember.toString());
		// 데이터 뭉치기
		CartVo cartVo = new CartVo();
		cartVo.setcNo(loginMember.getNo());
		cartVo.setpNo(no);
		cartVo.setAmount(amount);

		int result = 0;
		try {
			//서비스 호출
			CartService cs = new CartService();
			result = cs.addProduct(cartVo);
			
		}catch (Exception e) {
			System.out.println("[ERROR] 장바구니 상품 추가 중 예외 발생");
			e.printStackTrace();
		}
		//화면
		if(result == 1) {
			req.getSession().setAttribute("cartMsg", "장바구니 추가 성공");
			resp.sendRedirect("/market/productlist");
		}else {
			req.getSession().setAttribute("cartMsg", "장바구니 추가 실패");
			resp.sendRedirect("/market/productlist");
		
		}
		  
	}
}
