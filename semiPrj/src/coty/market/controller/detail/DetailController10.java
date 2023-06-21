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

@WebServlet("/market/productdetail10")
public class DetailController10 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
try {
			
			ProductService ps = new ProductService();
			
			List<ProductVo> productList10 = ps.selectList10();
			
			req.setAttribute("productList10", productList10);
			req.getRequestDispatcher("/WEB-INF/views/market/detail/ProductDetail10.jsp").forward(req, resp);
			
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

