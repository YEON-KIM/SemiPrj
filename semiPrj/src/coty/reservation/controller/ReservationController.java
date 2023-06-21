package coty.reservation.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.sampled.ReverbType;

import coty.member.vo.MemberVo;
import coty.reservation.service.ReservationService;
import coty.reservation.vo.ReservationVo;

@WebServlet("/reservation/reservationNew")
public class ReservationController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/reservation/reservationNew.jsp").forward(req, resp);
	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//데이터 꺼내기
		String cNo = req.getParameter("cNo");
		String dNo = req.getParameter("dNo");
		String sNo = req.getParameter("sNo");
		
		MemberVo loginMember = (MemberVo) req.getSession().getAttribute("loginMember");
		
		//데이터 뭉치기
		ReservationVo vo = new ReservationVo();
		vo.setcNo(loginMember.getNo());
		vo.setdNo(dNo);
		vo.setsNo(sNo);
		
		//서비스 호출
		ReservationService reS = new ReservationService();
		int result = reS.yeyak(vo);
		if(result == 1) {
			
		}
		
	}
	
}
