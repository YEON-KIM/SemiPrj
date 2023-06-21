package coty.admin.faq.dvo;

import java.sql.Connection;
import java.util.List;

import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class FAQService {

	public int selectCount() throws Exception {


		Connection conn = JDBCTemplate.getConnection();
		
		FAQ_a_Dao dao = new FAQ_a_Dao();
		int result = dao.selectCount(conn);
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public List<FAQ_a_Vo> selectList(PageVo pageVo) throws Exception {
		
		
		Connection conn = JDBCTemplate.getConnection();
		
		FAQ_a_Dao dao = new FAQ_a_Dao();
		List<FAQ_a_Vo> FAQList = dao.selectList(conn, pageVo);
		
		JDBCTemplate.close(conn);
		return FAQList;
		
	}

	public FAQ_a_Vo selectOne(String no) throws Exception {
		
		Connection conn = JDBCTemplate.getConnection();
		
		FAQ_a_Dao dao = new FAQ_a_Dao();
		int result = dao.increaseHit(conn,no);
		
		if(result != 1) {
			throw new Exception("조회수 증가 실패..");
		}
		
		FAQ_a_Vo FAQVo = dao.selectOne(conn, no);
		
		JDBCTemplate.commit(conn);
		JDBCTemplate.close(conn);
		
		return FAQVo;
	}

	public int write(FAQ_a_Vo vo) throws Exception {
		
		Connection conn = JDBCTemplate.getConnection();
		
		FAQ_a_Dao dao = new FAQ_a_Dao();
		int result = dao.write(conn, vo);
		
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public int delete(String no) throws Exception {
		
		Connection conn = JDBCTemplate.getConnection();
		
		FAQ_a_Dao dao = new FAQ_a_Dao();
		int result = dao.delete(conn, no);
		
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		
		JDBCTemplate.close(conn);
		
		return result;
	}

	public int update(FAQ_a_Vo vo) throws Exception {
		
		Connection conn = JDBCTemplate.getConnection();
		
		FAQ_a_Dao dao = new FAQ_a_Dao();
		int result = dao.update(conn, vo);
		
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		
		return result;
	}

}
