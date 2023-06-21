package coty.market.controller.detail;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.market.service.ProductService;
import coty.market.vo.ProductVo;

@WebServlet("/market/productdetail2")
public class DetailController2 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			ProductService ps = new ProductService();
			
			List<ProductVo> productList2 = ps.selectList2();
			
			req.setAttribute("productList2", productList2);
			req.getRequestDispatcher("/WEB-INF/views/market/detail/ProductDetail2.jsp").forward(req, resp);
			
		} catch (Exception e) {
			System.out.println("[ERROR] 상품 조회 중 예외 발생");
			e.printStackTrace();
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}

