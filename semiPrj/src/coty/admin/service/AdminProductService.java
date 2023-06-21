package coty.admin.service;

import java.sql.Connection;
import java.util.List;

import coty.admin.adminVo.AdminProductVo;
import coty.admin.adminVo.DesignerVo;
import coty.admin.dao.AdminProductDao;
import coty.admin.dao.DesignerListDao;
import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class AdminProductService {
	
	//관리자 상품 목록 조회(페이징된)
	public List<AdminProductVo> selectProductList(PageVo pageVo) throws Exception {
		//비지니스 로직
		
		//conn 
		Connection conn = JDBCTemplate.getConnection();
		
		//SQL(DAO)
		AdminProductDao dao = new AdminProductDao();
		List<AdminProductVo> productList = dao.selectProductList(conn , pageVo);
		
		
		//close
		JDBCTemplate.close(conn);
		
		
		return productList;
	}
	
	
	
	//상품 전체 갯수 조회
	public int selectCount() throws Exception {
		//비지니스 로직 

		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//SQL(DAO)
		AdminProductDao dao = new AdminProductDao();
		int result = dao.selectCount(conn);
		
		//close
		JDBCTemplate.close(conn);
		
		
		return result;
	}


}
