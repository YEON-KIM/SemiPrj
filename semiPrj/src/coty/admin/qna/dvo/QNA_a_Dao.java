package coty.admin.qna.dvo;

import static coty.util.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import coty.admin.faq.dvo.FAQ_a_Vo;
import coty.admin.notice.total.Notice_a_Dao;
import coty.admin.notice.total.Notice_a_Vo;
import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class QNA_a_Dao {

	public int selectCount(Connection conn) throws Exception {
		String sql = "SELECT COUNT(*) AS CNT FROM QA WHERE DEL_YN = 'N'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		int cnt = 0;
		if(rs.next()) {
			cnt = rs.getInt("CNT");
		}
		
		close(rs);
		close(pstmt);
		
		return cnt;
}

	public List<QNA_a_Vo> selectList_Q(Connection conn, PageVo pageVo) throws Exception {
		
		String sql = "SELECT * FROM ( SELECT ROWNUM AS RNUM , TEMP.* FROM ( SELECT NO , TITLE , CONTENT_Q ,	CONTENT_A, WRITER , ENROLL_DATE, HIT FROM QA WHERE DEL_YN = 'N' AND CONTENT_Q IS NULL ORDER BY NO DESC ) TEMP ) WHERE RNUM BETWEEN ? AND ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int startRow = (pageVo.getCurrentPage()-1) * pageVo.getBoardLimit()+1;
		int endRow = startRow + pageVo.getBoardLimit() -1;
		pstmt.setInt(1, startRow);
		pstmt.setInt(2, endRow);
		ResultSet rs = pstmt.executeQuery();
		
		List<QNA_a_Vo> QNAList = new ArrayList<QNA_a_Vo>();
		
		while (rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String content_q = rs.getString("CONTENT_Q");
			String content_a = rs.getString("CONTENT_A");
			String enrollDate = rs.getString("ENROLL_DATE");
			String writer = rs.getString("WRITER");
			String hit = rs.getString("HIT");
			
			QNA_a_Vo vo = new QNA_a_Vo();
			vo.setNo(no);
			vo.setTitle(title);
			vo.setContent_q(content_q);
			vo.setContent_a(content_a);
			vo.setEnrollDate(enrollDate);
			vo.setWriter(writer);
			vo.setHit(hit);
			
			QNAList.add(vo);
		}
		
		return QNAList;
	}
	
	public List<QNA_a_Vo> selectList_A(Connection conn, PageVo pageVo) throws Exception {
		
		String sql = "SELECT * FROM ( SELECT ROWNUM AS RNUM , TEMP.* FROM ( SELECT NO , TITLE , CONTENT_Q ,	CONTENT_A, WRITER , ENROLL_DATE, HIT FROM QA WHERE DEL_YN = 'N' AND CONTENT_A IS NULL ORDER BY NO DESC ) TEMP ) WHERE RNUM BETWEEN ? AND ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int startRow = (pageVo.getCurrentPage()-1) * pageVo.getBoardLimit()+1;
		int endRow = startRow + pageVo.getBoardLimit() -1;
		pstmt.setInt(1, startRow);
		pstmt.setInt(2, endRow);
		ResultSet rs = pstmt.executeQuery();
		
		List<QNA_a_Vo> QNAList = new ArrayList<QNA_a_Vo>();
		
		while (rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String content_q = rs.getString("CONTENT_Q");
			String content_a = rs.getString("CONTENT_A");
			String enrollDate = rs.getString("ENROLL_DATE");
			String writer = rs.getString("WRITER");
			String hit = rs.getString("HIT");
			
			QNA_a_Vo vo = new QNA_a_Vo();
			vo.setNo(no);
			vo.setTitle(title);
			vo.setContent_q(content_q);
			vo.setContent_a(content_a);
			vo.setEnrollDate(enrollDate);
			vo.setWriter(writer);
			vo.setHit(hit);
			
			QNAList.add(vo);
		}
		
		return QNAList;
	}


	public int increaseHit(Connection conn, String no) throws Exception {
		//SQL
		String sql = "UPDATE QA SET HIT = HIT+1 WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		int result = pstmt.executeUpdate();
		//close
		close(pstmt);
		
		return result;
	}

	public QNA_a_Vo selectOne(Connection conn, String no) throws Exception {
		String sql = "SELECT * FROM QA WHERE NO = ? AND DEL_YN = 'N'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		ResultSet rs = pstmt.executeQuery();
		
		QNA_a_Vo QNAVo = null;
		//rs =>obj
		if (rs.next()) {
			String QNANo = rs.getString("NO");
			String title = rs.getString("TITLE");
			String content_q = rs.getString("CONTENT_Q");
			String content_a = rs.getString("CONTENT_A");
			String writer = rs.getString("WRITER");
			String enrollDate = rs.getString("ENROLL_DATE");
			String hit = rs.getString("HIT");
			
			QNAVo = new QNA_a_Vo();
			QNAVo.setNo(QNANo);
			QNAVo.setTitle(title);
			QNAVo.setContent_a(content_a);
			QNAVo.setContent_q(content_q);
			QNAVo.setWriter(writer);
			QNAVo.setEnrollDate(enrollDate);
			QNAVo.setHit(hit);
		}
		
		//close
		close(rs);
		close(pstmt);
		
		System.out.println(QNAVo.toString());
		return QNAVo;
	
}

	public int write_q(Connection conn, QNA_a_Vo vo) throws Exception {
		//SQL (close)
		String sql = "INSERT INTO QA(NO,WRITER,TITLE, CONTENT_Q) VALUES(SEQ_NOTICE_NO.NEXTVAL, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, vo.getWriter());
		pstmt.setString(2, vo.getTitle());
		pstmt.setString(3, vo.getContent_q());
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		
		return result;
	}

	public int update_q(Connection conn, QNA_a_Vo vo) throws Exception {
		
		String sql = "UPDATE QA SET TITLE = ?, CONTENT_Q = ? WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, vo.getTitle());
		pstmt.setString(2, vo.getContent_q());
		pstmt.setString(3, vo.getNo());
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		
		return result;
	}

	public int delete_q(Connection conn, String no) throws Exception {
		String sql = "DELETE FROM QA WHERE NO = ?";
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		int result = pstmt.executeUpdate();
		//close
		close(pstmt);
		
		return result;
	}

	public int write_a(Connection conn, QNA_a_Vo vo) throws SQLException {
		String sql = "INSERT INTO QA(NO,WRITER,TITLE, CONTENT_A) VALUES(SEQ_NOTICE_NO.NEXTVAL, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, vo.getWriter());
		pstmt.setString(2, vo.getTitle());
		pstmt.setString(3, vo.getContent_a());
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		
		return result;
	}
}
