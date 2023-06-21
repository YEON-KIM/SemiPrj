package coty.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import coty.admin.adminVo.DesignerVo;
import coty.designer.service.DesignerService;

@WebServlet("/admin/designerQuit")
public class DesignerQuitController extends HttpServlet{
	//디자이너 계정 탈퇴하기
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//데이터 꺼내기
		HttpSession session = req.getSession();
		DesignerVo designerVo = (DesignerVo)session.getAttribute("designerVo");
		String designerNo = designerVo.getNo();
		
		//서비스 실행
		DesignerService ds = new DesignerService();
		int result = 0;
		try {
			result = ds.deInfoEdit(designerNo);

			//화면
			if(result == 1) {
				req.getSession().setAttribute("alertMsg", "해당 디자이너 계정이 탈퇴되었습니다.");
				resp.sendRedirect("/admin/designerList");
			}
			
		} catch (Exception e) {
			System.out.println("[ERROR]디자이너 계정 탈퇴중 예외 발생...");
			e.printStackTrace();
		}
		
		session.invalidate();
	}
}
