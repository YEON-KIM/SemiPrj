package coty.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.member.service.AddressService;
import coty.member.vo.AddressVo;
import coty.member.vo.MemberVo;

@MultipartConfig(
		maxFileSize = 1024 * 1024 * 50,
		maxRequestSize = 1024 * 1024* 50 * 10
	)
//배송지등록
@WebServlet("/member/addressenroll")
public class AddressEnrollController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/addressenroll.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String adname = req.getParameter("adname");
		String detail = req.getParameter("detail");
	
		AddressVo vo = new AddressVo();
		
		vo.setAdname(adname);
		vo.setDetail(detail);
	
		int result = 0;
		try {
			AddressService as = new AddressService();
			 // 로그인 데이터 가져오기
		      MemberVo loginMember = (MemberVo) req.getSession().getAttribute("loginMember");
			result = as.AddressWrite(vo,loginMember);
			
		} catch (Exception e) {
			System.out.println("[ERROR] 배송지등록 중 예외발생 ...");
			e.printStackTrace();
		}
		
		if(result == 1) {
			req.getSession().setAttribute("alertEditMsgad", "배송지 등록 성공");
			resp.sendRedirect("/member/addressenroll");

		}else{
			req.getSession().setAttribute("alertEditMsgad", "배송지 등록 실패..");
			resp.sendRedirect("/member/addressenroll");
			
		}
		
	}
	
}
