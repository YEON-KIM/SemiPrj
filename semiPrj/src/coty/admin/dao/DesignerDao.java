package coty.admin.dao;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import coty.admin.adminVo.DesignerAttachmentVo;
import coty.admin.adminVo.DesignerVo;
import coty.util.JDBCTemplate;

import static coty.util.JDBCTemplate.*;

public class DesignerDao {
	
	//디자이너 계정 생성 (INSERT)
	public int createDesigner(Connection conn, DesignerVo deVo) throws Exception {
		//sql
		int result = 0;
		String sql="INSERT INTO DESIGNER(NO, ID, PWD, NAME ,PHONE, EMAIL, SHOP, NICK) VALUES(SEQ_DESIGNER_NO.NEXTVAL, ? ,? ,? ,? ,? ,? , ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, deVo.getId());
		pstmt.setString(2, deVo.getPwd());
		pstmt.setString(3, deVo.getName());
		pstmt.setString(4, deVo.getPhone());
		pstmt.setString(5, deVo.getEmail());
		pstmt.setString(6, deVo.getShop());
		pstmt.setString(7, deVo.getNick());
		result = pstmt.executeUpdate();
		
		//close
		close(pstmt);
		
		return result;
		
	}

	//디자이너 로그인(SELECT)
	public DesignerVo designerLogin(Connection conn, DesignerVo deVo) throws Exception {
		//sql
		String sql="SELECT * FROM DESIGNER WHERE ID = ? AND PWD = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, deVo.getId());
		pstmt.setString(2, deVo.getPwd());
		ResultSet rs = pstmt.executeQuery();
		
		DesignerVo deLoginVo = null;
		if(rs.next()) {
			String dbNo = rs.getString("NO");
			String dbId = rs.getString("ID");
			String dbPwd = rs.getString("PWD");
			String dbName = rs.getString("NAME");
			String dbNick = rs.getString("NICK");
			
			deLoginVo = new DesignerVo();
			deLoginVo.setNo(dbNo);
			deLoginVo.setId(dbId);
			deLoginVo.setPwd(dbPwd);
			deLoginVo.setName(dbName);
			deLoginVo.setNick(dbNick);
		}
		
		//close
		close(pstmt);
		close(rs);
		
		
		return deLoginVo;
	}
	
	//디자이너 계정 생성시 디자이너 사진경로 ATTACHMENT테이블 INSERT
	public int insertAttachment(Connection conn, DesignerAttachmentVo atVo) throws Exception {
		
		//sql 
		String sql="INSERT INTO ATTACHMENT_DESIGNER (NO ,ORIGIN_NAME, CHANGE_NAME, REF_DESIGNER_NO) VALUES (SEQ_ATTACHMENT_DESIGNER_NO.NEXTVAL, ?, ?, SEQ_DESIGNER_NO.CURRVAL)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, atVo.getOriginName());
		pstmt.setString(2, atVo.getChangeName());
		int result = pstmt.executeUpdate();
		
		//close
		JDBCTemplate.close(pstmt);
		
		return result;
	
	
	}
	
	//디자이너 계정정보 수정
	public int deInfoEdit(Connection conn, DesignerVo editVo) throws Exception {
		int editResult =0;
		//sql
		String sql="UPDATE DESIGNER SET PHONE= ? , EMAIL = ? , EX = ? WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, editVo.getPhone());
		pstmt.setString(2, editVo.getEmail());
		pstmt.setString(3, editVo.getEx());
		pstmt.setString(4, editVo.getNo());
		
		editResult = pstmt.executeUpdate();
		
		//close
		JDBCTemplate.close(pstmt);
		
		return editResult;
	}

	//디자이너 계정 탈퇴
	public int designerQuit(Connection conn, String designerNo) throws Exception {
		//sql
		String sql = "UPDATE DESIGNER SET QUIT_YN='Y' WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, designerNo);
		int result = pstmt.executeUpdate();
		
		//close
		JDBCTemplate.close(conn);
		
		return result;
		
	}

}
