package coty.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.member.service.CartService;
import coty.member.vo.CartVo;

@WebServlet("/member/cartdelete")
public class CartDeleteController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/Cart.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String delete = req.getParameter("delete");
		System.out.println(delete+" : 딜리트값");
		CartVo cartVo = new CartVo();
		cartVo.setNo(delete);
		
		int result = 0;
		try {
			//서비스 호출
			CartService cs = new CartService();
			result = cs.deleteProduct(cartVo);
			
		}catch (Exception e) {
			System.out.println("[ERROR] 장바구니 상품 삭제 중 예외 발생");
			e.printStackTrace();
		}
		
		//화면
		if(result == 1) {
			System.out.println(delete);
			req.getSession().setAttribute("deleteMsg", "장바구니 삭제 성공");
			resp.sendRedirect("/member/cart");
		}else {
			System.out.println("실패..");
			req.getSession().setAttribute("deleteMsg", "장바구니 삭제 실패");
			resp.sendRedirect("/member/cart");
		
		}
	}
}
