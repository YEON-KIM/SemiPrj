package coty.member.service;

import java.sql.Connection;
import java.util.List;

import coty.admin.notice.total.Notice_a_Dao;
import coty.member.dao.AddressDao;
import coty.member.vo.AddressVo;
import coty.member.vo.MemberVo;
import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class AddressService {

		//게시글 조회 (페이징처리)
		public List<AddressVo> selectList(PageVo pagevo, MemberVo loginMember) throws Exception {
			//비지니스 로직
			
			//conn
			Connection conn = JDBCTemplate.getConnection();
			
			//sql (dao)
			AddressDao dao = new AddressDao();
			List<AddressVo> AddressList = dao.selectList(conn , pagevo, loginMember);
			
			//close
			JDBCTemplate.close(conn);
			
			return AddressList;
		}
		
		//게시글 전체 갯수 조회 (삭제되지않은)
		public int selectCount() throws Exception {
			
			//비지니스 로직
			
			//conn
			Connection conn = JDBCTemplate.getConnection();
			
			//dao
			AddressDao dao = new AddressDao();
			int result = dao.selectCount(conn);
			
			//tx close
			
			
			JDBCTemplate.close(conn);
			
			return result;
		}

		//배송정보 삭제		
		public int delete(String no) throws Exception {
			//conn
			Connection conn = JDBCTemplate.getConnection();
			
			//DAO
			AddressDao dao = new AddressDao();
			int result = dao.delete(conn, no);
		
			
			//tx , close
			if(result == 1) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
			
			JDBCTemplate.close(conn);
			
			return result;
		}
		
		//배송지 등록
		public int AddressWrite(AddressVo vo,  MemberVo loginMember) throws Exception {
			//conn
			Connection conn = JDBCTemplate.getConnection();
			//SQL
			AddressDao dao = new AddressDao();
			int result = dao.AddressWrite(conn, vo, loginMember);
			//tx, close
		
			
			if(result == 1) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
			
			JDBCTemplate.close(conn);
			
			return result;
		}

}




