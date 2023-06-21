package coty.member.service;

import java.sql.Connection;
import java.util.List;

import coty.member.dao.OrderDao;
import coty.member.vo.MemberVo;
import coty.member.vo.OrderVo;
import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class OrderService {
	//게시글 조회 (페이징처리)
		public List<OrderVo> selectList(PageVo pagevo, MemberVo loginMember) throws Exception {
			//비지니스 로직
			
			//conn
			Connection conn = JDBCTemplate.getConnection();
			
			//sql (dao)
			OrderDao dao = new OrderDao();
			List<OrderVo> OrderList = dao.selectList(conn , pagevo, loginMember);
			
			//close
			JDBCTemplate.close(conn);
			
			return OrderList;
		}
		
		//게시글 전체 갯수 조회 (삭제되지않은)
		public int selectCount() throws Exception {
			
			//비지니스 로직
			
			//conn
			Connection conn = JDBCTemplate.getConnection();
			
			//dao
			OrderDao dao = new OrderDao();
			int result = dao.selectCount(conn);
			
			//tx close
			
			
			JDBCTemplate.close(conn);
			
			return result;
		}

		//게시글 상세조회
		public OrderVo selectOne(String no , MemberVo loginMember) throws Exception {
			//비즈니스 로직
			
			//conn
			Connection conn = JDBCTemplate.getConnection();
			
			//dao호출 (조회쿼리 + 증가쿼리)
			OrderDao dao = new OrderDao();
			OrderVo	ordervo = dao.selectOne(conn,no,loginMember);			
			
			//tx. close
			JDBCTemplate.commit(conn);
			JDBCTemplate.close(conn);
			
			return ordervo;
		}
}
