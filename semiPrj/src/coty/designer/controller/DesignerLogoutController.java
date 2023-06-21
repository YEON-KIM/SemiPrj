package coty.designer.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/designer/logout")
public class DesignerLogoutController extends HttpServlet{
	//디자이너 계정 로그아웃
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String root = req.getContextPath();
		req.getSession().invalidate();
		resp.sendRedirect("/"+ root);
	}
}
