package coty.admin.faq.dvo;

import static coty.util.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import coty.util.PageVo;

public class FAQ_a_Dao {

	public int selectCount(Connection conn) throws Exception{
		String sql = "SELECT COUNT(*) AS CNT FROM FAQ WHERE DEL_YN = 'N'";
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

	public List<FAQ_a_Vo> selectList(Connection conn, PageVo pageVo) throws Exception{
		
		String sql = "SELECT * FROM ( SELECT ROWNUM AS RNUM , TEMP.* FROM ( SELECT NO , TITLE , CONTENT , WRITER , ENROLL_DATE, HIT FROM FAQ WHERE DEL_YN = 'N' ORDER BY NO DESC ) TEMP ) WHERE RNUM BETWEEN ? AND ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int startRow = (pageVo.getCurrentPage()-1) * pageVo.getBoardLimit()+1;
		int endRow = startRow + pageVo.getBoardLimit() -1;
		pstmt.setInt(1, startRow);
		pstmt.setInt(2, endRow);
		ResultSet rs = pstmt.executeQuery();
		
		List<FAQ_a_Vo> FAQList = new ArrayList<FAQ_a_Vo>();
		
		while (rs.next()) {
			String no = rs.getString("NO");
			String title = rs.getString("TITLE");
			String content = rs.getString("CONTENT");
			String enrollDate = rs.getString("ENROLL_DATE");
			String writer = rs.getString("WRITER");
			String hit = rs.getString("HIT");
			
			FAQ_a_Vo vo = new FAQ_a_Vo();
			vo.setNo(no);
			vo.setTitle(title);
			vo.setContent(content);
			vo.setEnrollDate(enrollDate);
			vo.setWriter(writer);
			vo.setHit(hit);
			
			FAQList.add(vo);
		}
		
		return FAQList;
	}
	

	public int increaseHit(Connection conn, String no) throws Exception{
		
		String sql = "UPDATE FAQ SET HIT = HIT+1 WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		
		return result;
	}

	public FAQ_a_Vo selectOne(Connection conn, String no) throws Exception{
		
		String sql = "SELECT * FROM FAQ WHERE NO = ? AND DEL_YN = 'N'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		ResultSet rs = pstmt.executeQuery();
		
		FAQ_a_Vo FAQVo = null;
		
		if (rs.next()) {
			String FAQNo = rs.getString("NO");
			String title = rs.getString("TITLE");
			String content = rs.getString("CONTENT");
			String writer = rs.getString("WRITER");
			String enrollDate = rs.getString("ENROLL_DATE");
			String hit = rs.getString("HIT");
			
			FAQVo = new FAQ_a_Vo();
			FAQVo.setNo(FAQNo);
			FAQVo.setTitle(title);
			FAQVo.setContent(content);
			FAQVo.setWriter(writer);
			FAQVo.setEnrollDate(enrollDate);
			FAQVo.setHit(hit);
		}
		
		close(rs);
		close(pstmt);
		
		return FAQVo;
	}

	public int write(Connection conn, FAQ_a_Vo vo) throws Exception {
		
		String sql = "INSERT INTO FAQ(NO,WRITER,TITLE, CONTENT) VALUES(SEQ_FAQ_NO.NEXTVAL, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, vo.getWriter());
		pstmt.setString(2, vo.getTitle());
		pstmt.setString(3, vo.getContent());
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		
		return result;

	}

	public int delete(Connection conn, String no) throws SQLException {
		//SQL
		String sql = "DELETE FROM FAQ WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		int result = pstmt.executeUpdate();
		//close
		close(pstmt);
		
		return result;
	}

	public int update(Connection conn, FAQ_a_Vo vo) throws Exception {

		String sql = "UPDATE FAQ SET TITLE = ?, CONTENT = ? WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		
		pstmt.setString(1, vo.getTitle());
		pstmt.setString(2, vo.getContent());
		pstmt.setString(3, vo.getNo());
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		
		return result;
	}

}
