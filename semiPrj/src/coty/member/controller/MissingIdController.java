package coty.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.member.service.MemberService;
import coty.member.vo.MemberVo;
@WebServlet("/member/missingid")
public class MissingIdController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/missingId.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 아이디 찾기
        String name = req.getParameter("membername");
        String ssno = req.getParameter("memberidnum");
        
        //데이터 뭉치기
        MemberVo vo = new MemberVo();
        vo.setName(name);
        vo.setSsno(ssno);

        MemberVo findId = null;
        try {
        	MemberService service = new MemberService();
        	findId = service.findId(vo);
		} catch (Exception e) {
			System.out.println("[ERROR] 아이디찾기 중 예외 발생..");
			e.printStackTrace();
		}
      //화면
        
		if(findId != null) {
			req.getSession().setAttribute("alertLoginMsg","회원님의 아이디는 " + findId.getId() + " 입니다.");
			resp.sendRedirect("/member/missingid");
		}else {
			req.setAttribute("errorMsg", "아이디찾기 실패..");
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}
}
