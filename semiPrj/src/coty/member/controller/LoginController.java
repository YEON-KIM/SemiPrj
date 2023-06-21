package coty.member.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.member.service.MemberService;
import coty.member.vo.MemberVo;
@WebServlet("/member/login")
public class LoginController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/member/login_M.jsp").forward(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//데이터 꺼내오기
				String memberId= req.getParameter("memberId");
				String memberPwd= req.getParameter("memberPwd");
				
				//데이터뭉치기
				MemberVo vo = new MemberVo();
				vo.setId(memberId);
				vo.setPwd(memberPwd);
				
				//비지니스 로직호출
				MemberVo loginMember = null;
				try {
					MemberService service = new MemberService();
					loginMember = service.login(vo);
				} catch (Exception e) {
					System.out.println("로그인 에러 발생..");
					e.printStackTrace();
				}
				
				//화면
				String root = req.getContextPath();
				if(loginMember != null) {
					req.getSession().setAttribute("loginMember", loginMember);
					resp.sendRedirect("/"+root);
				}else {
					req.getSession().setAttribute("alertMsg", "로그인 실패..");
					resp.sendRedirect("/"+root);
				}
				
			}
			
		}