package coty.admin.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import coty.admin.adminVo.DesignerAttachmentVo;
import coty.admin.adminVo.DesignerVo;
import coty.designer.service.DesignerListService;
import coty.designer.service.DesignerService;


@WebServlet("/admin/designerInfo")
public class DesignerInfoController extends HttpServlet{
	//디자이너 계정 정보 상세화면
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			//데이터 꺼내기
			String no = req.getParameter("no");
			
			//데이터 뭉치기
			
			//서비스 실행
			DesignerListService dls = new DesignerListService();
			DesignerVo designerVo = dls.selectInfo(no);
			
			//화면
			req.getSession().setAttribute("designerVo", designerVo); //세션에 디자이너Vo 저장
			req.getRequestDispatcher("/WEB-INF/views/admin/designerInfo.jsp").forward(req, resp);
		
		}catch(Exception e) {
			System.out.println("[ERROR] 디자이너 정보 상세조회 중 예외 발생..");
			e.printStackTrace();
		}
		
		
	}
	
	//디자이너 계정 수정
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//데이터 꺼내기
		String num = req.getParameter("num");
		String id = req.getParameter("desId");
		String phone = req.getParameter("tel");
		String email = req.getParameter("email");
		String ex = req.getParameter("detail");
		
		
		try {

		DesignerService ds = new DesignerService();
		
		//데이터뭉치기 (이미지파일 정보도 디비에 추가 - SRC , CHANGE_SRC (zzz.png))
		DesignerVo editVo = new DesignerVo();
		editVo.setNo(num);
		editVo.setId(id);
		editVo.setPhone(phone);
		editVo.setEmail(email);
		editVo.setEx(ex);
		
		//서비스 실행
		int editResult = 0;
		editResult = ds.deInfoEdit(editVo);
		
		//화면
		if(editResult == 1) {
			req.getSession().setAttribute("alertMsg","디자이너 정보가 수정되었습니다.");
			resp.sendRedirect("/admin/designerList");
		}
		
		} catch (Exception e) {
			System.out.println("[ERROR] 디자이너 계정 정보수정 중 예외 발생...");
			e.printStackTrace();
		}
		
	}
}
