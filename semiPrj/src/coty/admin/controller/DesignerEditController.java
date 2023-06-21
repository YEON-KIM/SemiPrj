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
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import coty.admin.adminVo.DesignerVo;
import coty.designer.service.DesignerService;

@MultipartConfig(
		maxFileSize = 1024 * 1024 * 50, //파일 최대 크기 50MB
		maxRequestSize = 1024 * 1024* 50 * 10
)
@WebServlet("/admin/designerEdit")
public class DesignerEditController extends HttpServlet{
	//디자이너 계정 목록 화면(디자이너 정보 가져오기)
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//데이터 꺼내기
		HttpSession session = req.getSession();// 세션 객체 가져오기
		DesignerVo designerVo = (DesignerVo) session.getAttribute("designerVo"); // 객체 가져오기
//		System.out.println(designerVo.getId());
		
		
		//화면
		req.setAttribute("designerVo", designerVo);
		req.getRequestDispatcher("/WEB-INF/views/admin/designerEdit.jsp").forward(req, resp);
		
		//세션 제거하기
		session.invalidate();
		
		}
	
}
