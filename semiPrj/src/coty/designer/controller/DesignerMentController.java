package coty.designer.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.communication.vo.ReviewVo;
import coty.designer.service.DesignerService;
import coty.designer.vo.MentVo;
import coty.member.service.MemberService;

@WebServlet("/designer/ment")
public class DesignerMentController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/communication/review_detail_list.jsp").forward(req, resp);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//데이터 꺼내기
		String ment = req.getParameter("ment");
		String rNo = req.getParameter("rNo");
		System.out.println(ment);
		System.out.println(rNo+"1");
		
		MentVo mentvo = new MentVo();
		mentvo.setMent(ment);
		mentvo.setrNo(rNo);
		
		int result = 0;
		try {
			DesignerService ds = new DesignerService();
			result = ds.addment(mentvo);
		} catch (Exception e) {
			System.out.println("[ERROR] 댓글 작성 중 예외 발생..");
			e.printStackTrace();
		}
		//화면
		if(result == 1) {
			req.getSession().setAttribute("MentVo", mentvo);
			resp.sendRedirect("/designer/ment?page="+rNo);
		}else {
			req.setAttribute("errorMsg", "댓글 작성 실패..");
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}
}
