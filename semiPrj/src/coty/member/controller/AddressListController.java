package coty.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import coty.member.service.AddressService;
import coty.member.vo.AddressVo;
import coty.member.vo.MemberVo;
import coty.util.PageVo;
@WebServlet("/member/address")
public class AddressListController extends HttpServlet{
	
	private AddressService as = new AddressService();

	//게시글 목록 (화면)
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			//데이터 꺼내기 (페이징처리 준비)
			String pageParam = req.getParameter("page");
            int currentPage = (pageParam != null) ? Integer.parseInt(pageParam) : 1;
//            int currentPage = Integer.parseInt(req.getParameter("page"));
			int listCount = as.selectCount();
			int pageLimit = 5;
			int boardLimit = 5;
			
		   // 로그인 데이터 가져오기
	      MemberVo loginMember = (MemberVo) req.getSession().getAttribute("loginMember");

			//데이터 뭉치기
			PageVo pagevo = new PageVo(listCount, currentPage, pageLimit, boardLimit);
			
			//서비스 호출
			List<AddressVo> AddressList = as.selectList(pagevo ,loginMember);
			
			//화면
			req.setAttribute("AddressList", AddressList);
			req.setAttribute("pagevo", pagevo);
			System.out.println(AddressList);
			req.getRequestDispatcher("/WEB-INF/views/member/address.jsp").forward(req, resp);		
			
			}catch (Exception e) {
				System.out.println("[ERORR] 배송지 목록 조회중 예외발생..");
				e.printStackTrace();
				req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);	
			}
		
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//배송정보 삭제
		//데이터꺼내기
		HttpSession session = req.getSession();
		String no = req.getParameter("cno");
		
		//데이터 뭉치기
		
		//서비스 호출
		int result = 0;
		try {
			result = as.delete(no);
		} catch (Exception e) {
			System.out.println("[ERORR] 배송정보 삭제 중 예외발생..");
			e.printStackTrace();
		}
		
		
		//화면
				if(result == 1) {
					req.getSession().setAttribute("alertdelteMsg", "배송지정보가 삭제되었습니다."); // 부신거에 다시 넣을수없으니까 새롭게 req.getsession으로 가져와서 사용해야됨
					resp.sendRedirect("/member/address");
				}else {
					req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
			
		}
		
	}						
	
}

