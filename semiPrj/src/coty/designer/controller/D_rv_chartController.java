package coty.designer.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.admin.adminVo.DesignerVo;
import coty.communication.service.ReviewService;
import coty.communication.vo.ReviewVo;
import coty.designer.service.DesignerService;
import coty.designer.vo.DesignerRvVo;
import coty.member.service.CartService;
import coty.member.vo.CartVo;
import coty.member.vo.MemberVo;
import coty.util.PageVo;

@WebServlet("/designer/rv_chart")
public class D_rv_chartController extends HttpServlet{

	private DesignerService ds = new DesignerService();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			// 데이터 꺼내기
			String pageParam = req.getParameter("page");
			int currentPage = (pageParam != null) ? Integer.parseInt(pageParam) : 1;
//			int currentPage = Integer.parseInt(req.getParameter("page"));
			int listCount = ds.selectCount();
			int pageLimit = 5;
			int boardLimit = 5;

			//데이터 가져오기
			DesignerVo deLoginVo = (DesignerVo) req.getSession().getAttribute("deLoginVo");
			System.out.println(deLoginVo.getNo());
			// 데이터 뭉치기
			PageVo pageVo = new PageVo(listCount, currentPage, pageLimit, boardLimit);

			// 서비스 호출
			List<DesignerRvVo> designerRvList = ds.selectList(pageVo,deLoginVo);
			
//			ReviewService rvs = new ReviewService();
//			ReviewVo vo = rvs.selectOne(no);

			// 화면
			req.getSession().setAttribute("designerRvList", designerRvList);
			req.setAttribute("pageVo", pageVo);
			req.getRequestDispatcher("/WEB-INF/views/designer/d_rv_chart.jsp").forward(req, resp);

		} catch (Exception e) {
			System.out.println("[ERROR] 디자이너 예약목록 조회중 예외 발생 ...");
			e.printStackTrace();
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
		

	}
	

	//디자이너 로그인
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//수정할 데이터 꺼내기
		String no = req.getParameter("no");
		String res = req.getParameter("res");
		
		DesignerRvVo dvo = new DesignerRvVo();
		dvo.setNo(no);
		dvo.setRes(res);
		
		DesignerRvVo result = null;
		try {
			//서비스 호출
			DesignerService ds = new DesignerService();
			
			result = ds.editres(dvo);
			System.out.println(result);
			
		}catch(Exception e) {
			System.out.println("[ERROR] 예약 취소 중 예외 발생");
			e.printStackTrace();
		}
		if(result != null) {
		//화면
		req.setAttribute("alertResMsg", "예약 취소 완료");
		resp.sendRedirect("/designer/rv_chart");
		}else {
			req.setAttribute("errorMsg", "예약 취소 실패");
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
	}

}

