package coty.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import coty.member.service.MemberService;
import coty.member.vo.MemberVo;

@WebServlet("/member/memberquit")
public class MemberQuitController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/memberquit.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//데이터 꺼내오기
			HttpSession session = req.getSession();
			MemberVo loginMember = (MemberVo)session.getAttribute("loginMember");		
			
			//서비스로직 호출
			
			int result = 0;
			try {
				//비지니스 로직
				MemberService service = new MemberService();
				result = service.quit(loginMember);
				
			} catch (Exception e) {
				System.out.println("[ERORR] 탈퇴 중 예외발생..");
				e.printStackTrace();
			}finally {
				
			}
					
			//화면
			if(result ==1) {
				//성공화면
				session.invalidate(); //탈퇴하면 세션이 만료되게
				req.getSession().setAttribute("alertMsg", "탈퇴 성공"); // 부신거에 다시 넣을수없으니까 새롭게 req.getsession으로 가져와서 사용해야됨
				resp.sendRedirect("/");
			}else {
				req.setAttribute("errorMsg", "탈퇴 실패 ..");
				req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
				
			}
		}
		
	}

