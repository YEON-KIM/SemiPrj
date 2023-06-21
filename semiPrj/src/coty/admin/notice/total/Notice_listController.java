package coty.admin.notice.total;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.admin.notice.total.Notice_a_Vo;
import coty.admin.service.NoticeService;
import coty.util.PageVo;

@WebServlet("/admin/Notice_list")
public class Notice_listController extends HttpServlet{
	
	private NoticeService ns = new NoticeService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				
		try {			
			
			//데이터 꺼내기
			int currentPage = Integer.parseInt(req.getParameter("page"));
			int listCount = ns.selectCount();
			int pageLimit = 5;
			int boardLimit = 5;
			
						
			//데이터 뭉치기
			
			PageVo pageVo = new PageVo(listCount, currentPage, pageLimit, boardLimit);
			
			
			//서비스 호출				
			List<Notice_a_Vo> noticeList = ns.selectList(pageVo);

			
			
			//화면
			req.setAttribute("noticeList", noticeList);
			req.setAttribute("pageVo", pageVo);
			req.getRequestDispatcher("/WEB-INF/views/admin/Notice_list.jsp").forward(req, resp);
			
		} catch (Exception e) {
			System.out.println("게시글 조회중 예외발생");
			e.printStackTrace();
			req.getRequestDispatcher("/WEB-INF/views/common/error.jsp").forward(req, resp);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
