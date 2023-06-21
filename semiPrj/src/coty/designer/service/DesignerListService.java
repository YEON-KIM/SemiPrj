package coty.designer.service;

import java.sql.Connection;
import java.util.List;

import coty.admin.adminVo.DesignerVo;
import coty.admin.dao.DesignerListDao;
import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class DesignerListService {
	
	//디자이너 목록 조회(페이징 처리가 된 상태로)
	public List<DesignerVo> selectDesignerList(PageVo pageVo) throws Exception {
		//비지니스 로직
		
		//conn 
		Connection conn = JDBCTemplate.getConnection();
		
		//SQL(DAO)
		DesignerListDao dao = new DesignerListDao();
		List<DesignerVo> designerList = dao.selectDesignerList(conn , pageVo);
		
		
		//close
		JDBCTemplate.close(conn);
		
		
		return designerList;
	}
	
	//디자이너 계정 전체 갯수 조회 (탈퇴되지 않은)
	public int selectCount() throws Exception {
		//비지니스 로직 
		
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//SQL(DAO)
		DesignerListDao dao = new DesignerListDao();
		int result = dao.selectCount(conn);
		
		//close
		JDBCTemplate.close(conn);
		
		
		return result;
	}
	
	//디자이너 상세정보 조회
	public DesignerVo selectInfo(String no) throws Exception {
		//비지니스 로직
		
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//DAO
		DesignerListDao dao = new DesignerListDao();
		DesignerVo designerVo = dao.selectInfo(conn, no );
		
		//close
		JDBCTemplate.close(conn);
		
		return designerVo;
	}

}
