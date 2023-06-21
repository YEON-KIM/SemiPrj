package coty.admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import coty.admin.adminVo.AdminVo;
import static coty.util.JDBCTemplate.*;

public class AdminLoginDao {

	public AdminVo adminLogin(Connection conn, AdminVo adminVo) throws Exception {
		//sql
		String sql="SELECT * FROM ADMIN WHERE ID = ? AND PWD = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, adminVo.getId());
		pstmt.setString(2, adminVo.getPwd());
		ResultSet rs = pstmt.executeQuery();
		
		AdminVo adminLogimVo = null;
		if(rs.next()) {
			String dbId = rs.getString("ID");
			String dbPwd = rs.getString("PWD");
			
			adminLogimVo = new AdminVo();
			adminLogimVo.setId(dbId);
			adminLogimVo.setPwd(dbPwd);
		}
		
		//close
		close(pstmt);
		close(rs);
		
		return adminLogimVo;
	}

}
