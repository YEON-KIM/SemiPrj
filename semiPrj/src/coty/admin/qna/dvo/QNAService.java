package coty.admin.qna.dvo;

import java.sql.Connection;
import java.util.List;

import coty.admin.faq.dvo.FAQ_a_Dao;
import coty.admin.faq.dvo.FAQ_a_Vo;
import coty.admin.notice.total.Notice_a_Dao;
import coty.admin.notice.total.Notice_a_Vo;
import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class QNAService {

	public int selectCount() throws Exception {
Connection conn = JDBCTemplate.getConnection();
		
		QNA_a_Dao dao = new QNA_a_Dao();
		int result = dao.selectCount(conn);
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public List<QNA_a_Vo> selectList_A(PageVo pageVo) throws Exception {
		Connection conn = JDBCTemplate.getConnection();
		
		QNA_a_Dao dao = new QNA_a_Dao();
		List<QNA_a_Vo> QNAList = dao.selectList_A(conn, pageVo);
		
		JDBCTemplate.close(conn);
		return QNAList;
	}
	
	public List<QNA_a_Vo> selectList_Q(PageVo pageVo) throws Exception {
		Connection conn = JDBCTemplate.getConnection();
		
		QNA_a_Dao dao = new QNA_a_Dao();
		List<QNA_a_Vo> QNAList = dao.selectList_Q(conn, pageVo);
		
		JDBCTemplate.close(conn);
		return QNAList;
	}

	public QNA_a_Vo selectOne(String no) throws Exception {
		Connection conn = JDBCTemplate.getConnection();
		//DAO호출(조회쿼리 + 증가쿼리)
		QNA_a_Dao dao = new QNA_a_Dao();
		int result = dao.increaseHit(conn, no);
		
		
		if (result != 1) {
			throw new Exception("조회수 증가 실패...");
		}
			
		QNA_a_Vo QNAVo = dao.selectOne(conn, no);
				
		//tx, close
		JDBCTemplate.commit(conn);
		JDBCTemplate.close(conn);
		
		return QNAVo;
	}

	public int write_q(QNA_a_Vo vo) throws Exception {
		//conn
		Connection conn = JDBCTemplate.getConnection();
		//SQL
		QNA_a_Dao dao = new QNA_a_Dao();
		int result = dao.write_q(conn, vo);
		//tx, close
		
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public int update_q(QNA_a_Vo vo) throws Exception {
		Connection conn = JDBCTemplate.getConnection();
		
		//DAO
		
		QNA_a_Dao dao = new QNA_a_Dao();
		int result = dao.update_q(conn, vo);
		
		//tx, close
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		
		return result;
	}

	public int delete_q(String no) throws Exception {
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//DAO
		QNA_a_Dao dao = new QNA_a_Dao();
		int result = dao.delete_q(conn, no);
		
		//tx , close
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public int write_a(QNA_a_Vo vo) throws Exception {
		//conn
		Connection conn = JDBCTemplate.getConnection();
		//SQL
		QNA_a_Dao dao = new QNA_a_Dao();
		int result = dao.write_a(conn, vo);
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
