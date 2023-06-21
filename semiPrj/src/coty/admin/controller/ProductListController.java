package coty.admin.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.admin.adminVo.AdminProductVo;
import coty.admin.adminVo.DesignerVo;
import coty.admin.service.AdminProductService;
import coty.util.PageVo;

@WebServlet("/admin/productList")
public class ProductListController extends HttpServlet{
	//디자이너 계정 목록 화면(페이징된)
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		AdminProductService aps = new AdminProductService();
		try {
			//데이터 꺼내기 (페이징 처리를 위한 데이터 준비)
			String pageParam =req.getParameter("page"); 
	        int currentPage = (pageParam != null) ? Integer.parseInt(pageParam) : 1;
			int productCount = aps.selectCount();//전체글 갯수 구하기
			int pageLimit = 5; //한페이지에 몇페이징씩 할건지
			int boardLimit = 5; //한페이지에 몇개의 글 보여줄건지 
			
			//데이터 뭉치기
			PageVo pageVo = new PageVo(productCount, currentPage, pageLimit, boardLimit);
					
			//서비스 호출
			 List<AdminProductVo> productList = aps.selectProductList(pageVo); //페이징관련정보
			
			 //화면
			 req.setAttribute("productList", productList);
			 req.setAttribute("pageVo", pageVo);
			 req.getRequestDispatcher("/WEB-INF/views/admin/admin_product_list.jsp").forward(req, resp);
		
		}catch(Exception e) {
			System.out.println("[ERROR] 관리자 상품 목록 조회 중 예외 발생...");
			e.printStackTrace();
		}
	}
}
