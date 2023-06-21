package coty.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.member.service.AddressService;

@WebServlet("/member/address/del")
public class AdressDeleteController extends HttpServlet {
	
	AddressService as = new AddressService();
	
	//no 받아와서 삭제
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String no = req.getParameter("no");
		
		int result = 0;
		try {
			result = as.delete(no);
		} catch (Exception e) {
			System.out.println("삭제되었습니다");
			e.printStackTrace();
		}
		
		if(result == 1) {
			req.getSession().setAttribute("alertdelteaMsg", "배송지정보가 삭제되었습니다."); // 부신거에 다시 넣을수없으니까 새롭게 req.getsession으로 가져와서 사용해야됨
			resp.sendRedirect("/member/address");
		}else {
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
		
	}

}
