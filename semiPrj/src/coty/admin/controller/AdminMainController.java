package coty.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import coty.admin.adminVo.AdminVo;
import coty.admin.service.AdminLoginService;

@WebServlet("/admin/main")
public class AdminMainController extends HttpServlet{
	
	//메인화면
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/admin/admin_main.jsp").forward(req, resp);
		HttpSession session = req.getSession();
		session.getAttribute("adminLogimVo");
	}
	
	//관리자 로그인
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//데이터 꺼내기
		String adminId = req.getParameter("adminId");
		String adminPwd = req.getParameter("adminPwd");
		
		//데이터 뭉치기
		AdminVo adminVo = new AdminVo();
		adminVo.setId(adminId);
		adminVo.setPwd(adminPwd);
		
		//서비스 실행
		AdminVo adminLogimVo = null;
		try {
			AdminLoginService service = new AdminLoginService();
			adminLogimVo = service.adminLogin(adminVo);
		
		//화면 보여주기
		if(adminLogimVo != null) {
			req.getSession().setAttribute("adminLogimVo", adminLogimVo);
			resp.sendRedirect("/admin/main");
		}else {
			req.getSession().setAttribute("loginfailMsg", "아이디와 비밀번호가 일치하지 않습니다.");
			resp.sendRedirect("/admin/login");
		}
	}catch(Exception e) {
		System.out.println("[ERROR] 관리자 로그인 중 예외 발생!");
		e.printStackTrace();
	}
	}
	
}
