package coty.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.member.service.MemberService;
import coty.member.vo.MemberVo;
@WebServlet("/member/missingpwd")
public class MissingPwdController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/missingPwd.jsp").forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 비밀번호 찾기
        String name = req.getParameter("membername");
        String Id = req.getParameter("memberId");
        String Ssno = req.getParameter("memberidnum1");
        
        //데이터 뭉치기
        MemberVo vo = new MemberVo();
        vo.setName(name);
        vo.setId(Id);
        vo.setSsno(Ssno);

        MemberVo findPwd = null;
        try {
        	MemberService service = new MemberService();
        	findPwd = service.findPwd(vo);
		} catch (Exception e) {
			System.out.println("[ERROR] 비밀번호 찾기 중 예외 발생..");
			e.printStackTrace();
		}
      //화면
        
		if(findPwd != null) {
			req.getSession().setAttribute("alertLoginMsg","회원님의 비밀번호는 " + findPwd.getPwd() + " 입니다.");
			resp.sendRedirect("/member/missingpwd");
		}else {
			req.setAttribute("errorMsg", "비밀번호찾기 실패..");
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}
}
