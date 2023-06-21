package coty.admin.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import coty.member.vo.MemberVo;

@WebServlet("/admin/memberEdit")
public class MemberEditController extends HttpServlet{
	//고객 정보수정 화면
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//데이터 꺼내기
		HttpSession session = req.getSession();
		MemberVo memberVo = (MemberVo)session.getAttribute("memberVo");
		
		//화면
		req.setAttribute("memberVo", memberVo);
		req.getRequestDispatcher("/WEB-INF/views/admin/admin_member_edit.jsp").forward(req, resp);
		
		//세션제거
		session.invalidate();
	}
	

}
