package coty.admin.notice.total;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import coty.admin.notice.total.Notice_a_Vo;
import coty.admin.service.NoticeService;



@WebServlet("/admin/Notice_delete")
public class Notice_deleteController extends HttpServlet{
	
	private NoticeService ns = new NoticeService();

	//공지사항 삭제
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//데이터꺼내기
		String no = req.getParameter("no");
		
		//데이터 뭉치기
		
		//서비스 호출
		int result = 0;
		try {
			result = ns.delete(no);
		} catch (Exception e) {
			System.out.println("에러 ㅜㅜ");
			e.printStackTrace();
		}
		
		//화면
		if(result == 1) {
			resp.sendRedirect("/admin/Notice_list?page=1");
		}else {
			req.getRequestDispatcher("삭제실패페이지~~~").forward(req, resp);
		}
		
	}
	
}
