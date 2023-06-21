package coty.designer.service;

import java.sql.Connection;
import java.util.List;

import coty.admin.adminVo.DesignerAttachmentVo;
import coty.admin.adminVo.DesignerVo;
import coty.admin.dao.DesignerDao;
import coty.communication.dao.ReviewDao;
import coty.communication.vo.ReviewVo;
import coty.designer.dao.DesignerRvDao;
import coty.designer.vo.DesignerRvVo;
import coty.designer.vo.MentVo;
import coty.member.dao.CartDao;
import coty.member.dao.MemberDao;
import coty.member.vo.CartVo;
import coty.member.vo.MemberVo;
import coty.util.JDBCTemplate;
import coty.util.PageVo;

import static coty.util.JDBCTemplate.*;

public class DesignerService {

	//디자이너 계정 생성 (+첨부파일 인터트)
	public int createDesigner(DesignerVo deVo, DesignerAttachmentVo atVo) throws Exception {
		//비지니스 로직
		
		//conn 
		Connection conn = getConnection();
		
		int result = 0;
		DesignerDao dao = new DesignerDao();

		//Dao == 계정 인서트
		result = dao.createDesigner(conn, deVo);
		
		//Dao == 첨부파일 인서트
		int atResult = dao.insertAttachment(conn, atVo);
		
		//tx, close
		if(result * atResult ==1) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		
		return result * atResult;
		
	}

	//디자이너 로그인
	public DesignerVo designerLogin(DesignerVo deVo) throws Exception {
		//conn
		Connection conn = getConnection();
		
		//dao
		DesignerDao dao = new DesignerDao();
		DesignerVo desingerVo = dao.designerLogin(conn, deVo);
		
		//close
		close(conn);
		
		
		return desingerVo;
	}

	//디자이너 첨부파일 저장
	public int insertAttachment(DesignerAttachmentVo atVo) throws Exception {
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//sql(Dao)
		DesignerDao dao = new DesignerDao();
		int result = dao.insertAttachment(conn, atVo);
		
		//tx , close
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		
		return result;
	}
	
	//디자이너 계정정보 수정
	public int deInfoEdit(DesignerVo editVo) throws Exception {
		int editResult =0;
		//비지니스 로직 
		
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//sql(Dao)
		DesignerDao dao = new DesignerDao();
		
		editResult = dao.deInfoEdit(conn, editVo);
		
		//tx , close
		if(editResult == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		
		return editResult;
		
	}

	
	//디자이너 계정 탈퇴
	public int deInfoEdit(String designerNo) throws Exception {
		//비지니스 로직
		
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//SQL(DAO)
		DesignerDao dao = new DesignerDao();
		int result = dao.designerQuit(conn, designerNo);
		
		//tx, close
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}
	
	
	

	//게시글 조회 (페이징 처리가 된)
		public List<DesignerRvVo> selectList(PageVo pageVo, DesignerVo deLoginVo) throws Exception {
			
			//비즈니스 로직
			
			//conn
			Connection conn = JDBCTemplate.getConnection();
			
			//SQL (DAO)
			DesignerRvDao dao = new DesignerRvDao();
			List<DesignerRvVo> designerRvList = dao.selectList(conn , pageVo, deLoginVo);
			
			//close
			JDBCTemplate.close(conn);
			
			return designerRvList;
		}
		
		//게시글 전체 갯수 조회 (삭제되지않은)
		public int selectCount() throws Exception {
			
			//비지니스 로직
			
			//conn
			Connection conn = JDBCTemplate.getConnection();
			
			//SQL (DAO)
			CartDao dao = new CartDao();
			int result = dao.selectCount(conn);
			
			//close
			JDBCTemplate.close(conn);
			
			return result;
		}

		public int addProduct(CartVo cartVo) throws Exception {
			
			//로직
			
			Connection conn = JDBCTemplate.getConnection();
			
			CartDao dao = new CartDao();
			int result = dao.addProduct(conn, cartVo);
			
			if(result == 1) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
			
			JDBCTemplate.close(conn);
			
			return result;
		}

		public DesignerRvVo editres(DesignerRvVo dvo) throws Exception {
			//비지니스 로직
			  Connection conn = JDBCTemplate.getConnection();
			
			  //sql 
			  DesignerRvDao dao = new DesignerRvDao(); 
			  DesignerRvVo editres = dao.editres(conn, dvo);
			  
			  //tx close 
			  if(editres != null) { 
			  JDBCTemplate.commit(conn); 
			  }
			  else {
			  JDBCTemplate.rollback(conn); 
			  } 
			  JDBCTemplate.close(conn); 
			return editres;
		}

		public int addment(MentVo vo) throws Exception {
			//conn
			Connection conn = JDBCTemplate.getConnection();
			
			//sql (dao)	
			DesignerRvDao dao = new DesignerRvDao();
			int result = dao.addment(conn, vo);
		
			//tx , close
			if(result == 1) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
			
			JDBCTemplate.close(conn);
			
			return result;
		}

		public MentVo ment(String no) throws Exception {
			Connection conn = JDBCTemplate.getConnection();
			
			//DAO 호출 (조회쿼리 + 증가쿼리)
			DesignerRvDao dao = new DesignerRvDao();
				
			MentVo mentVo = dao.ment(conn , no);
			
			//tx , close
			JDBCTemplate.commit(conn);
			JDBCTemplate.close(conn);
			
			
			return mentVo;
		}




	
	
	
}
