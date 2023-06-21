package coty.designer.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.admin.adminVo.DesignerVo;
import coty.designer.service.DesignerService;

@WebServlet("/designer/main")
public class DesignerMainCotroller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/designer/d_main.jsp").forward(req, resp);
	
	}
	
	//디자이너 로그인
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		DesignerService ds = new DesignerService();

		try {
		//데이터 꺼내기
		String deId = req.getParameter("deId");
		String dePwd = req.getParameter("dePwd");
		
		//데이터 뭉치기
		DesignerVo deVo = new DesignerVo();
		deVo.setId(deId);
		deVo.setPwd(dePwd);
		
		//서비스 실행
		DesignerVo deLoginVo = ds.designerLogin(deVo);
		
		//화면 보여주기 
		if(deLoginVo != null) {
			//성공
			req.getSession().setAttribute("deLoginVo", deLoginVo);
			resp.sendRedirect("/designer/main");
		}else {
			//실패
			req.getSession().setAttribute("alertMsg", "아이디와 비밀번호가 일치하지 않습니다. 다시 시도해 주십시오.");
			resp.sendRedirect("/designer/login");
		}	
			
		} catch (Exception e) {
			System.out.println("[ERROR] 디자이너 로그인 중 예외 발생...");
			e.printStackTrace();
		}
		
	}
	
	
}
