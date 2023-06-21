package coty.admin.service;

import java.sql.Connection;

import coty.admin.adminVo.AdminVo;
import coty.admin.dao.AdminLoginDao;
import coty.util.JDBCTemplate;

public class AdminLoginService {
	
	//관리자 로그인 (select)
	public AdminVo adminLogin(AdminVo adminVo) throws Exception {
		//비지니스 로직
		
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//sql(dao)
		AdminLoginDao adminDao = new AdminLoginDao();
		AdminVo adminLogimVo = adminDao.adminLogin(conn, adminVo);
		
		//close
		JDBCTemplate.close(conn);
		
		return adminLogimVo;
		
	}

}
