package coty.admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import coty.admin.adminVo.AdminProductVo;
import coty.admin.adminVo.DesignerVo;
import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class AdminProductDao {
	
	//관리자 상품 목록 조회(SELECT, 페이징 처리가 된 상태)
	public List<AdminProductVo> selectProductList(Connection conn, PageVo pageVo) throws Exception {
		//SQL
		String sql="SELECT * FROM ( SELECT  ROWNUM RNUM ,P.NO ,C.NAME CATEGORY ,P.NAME PNAME ,P.PRICE ,P.EX FROM PRODUCT P JOIN CATEGORY C ON(P.C_NO=C.NO) WHERE DELETE_YN='N' ) WHERE RNUM BETWEEN ? AND ?";
//		String sql="SELECT * FROM ( SELECT  ROWNUM RNUM ,P.NO ,C.NAME CATEGORY ,P.NAME PNAME ,P.PRICE ,P.EX FROM PRODUCT P JOIN CATEGORY C ON(P.C_NO=C.NO) WHERE DELETE_YN='N' ORDER BY NO DESC ) WHERE RNUM BETWEEN ? AND ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int startRow = (pageVo.getCurrentPage()-1) * pageVo.getBoardLimit()+1;
		int endRow = startRow + pageVo.getBoardLimit() - 1;
		pstmt.setInt(1, startRow);
		pstmt.setInt(2, endRow);
		ResultSet rs = pstmt.executeQuery();
		
		//rs 의 모든 row => obj
		List<AdminProductVo> productList = new ArrayList<AdminProductVo>();

		while(rs.next()){
			String no = rs.getString("RNUM");
			String category = rs.getString("CATEGORY");
			String pName = rs.getString("PNAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			
			
			AdminProductVo pVo = new AdminProductVo();
			pVo.setNo(no);
			pVo.setCategory(category);
			pVo.setName(pName);
			pVo.setPrice(price);
			pVo.setEx(ex);
			
			productList.add(pVo);
		}
		
		//close
		JDBCTemplate.close(rs);
		
		return productList;
	}
	
	
	//상품 전체 갯수 가져오기
	public int selectCount(Connection conn) throws Exception {
		//SQL  -> 총 디자이너 계정 갯수 가져오기
		String sql="SELECT COUNT(*) AS CNT FROM PRODUCT WHERE DELETE_YN='N'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		
		// rs => obj
		int cnt = 0;
		if(rs.next()) {
			cnt = rs.getInt("CNT"); 
		}
		
		//close
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		
		return cnt;
	}

	

}
