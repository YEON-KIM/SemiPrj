package coty.communication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import coty.communication.vo.ReviewAttachmentVo;
import coty.communication.vo.ReviewVo;
import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class ReviewDao {

	//게시글 목록 조회 (페이징 처리가 된)
		public List<ReviewVo> selectList(Connection conn , PageVo pageVo) throws Exception {

			//SQL (close)
			String sql = "SELECT * FROM ( SELECT ROWNUM AS RNUM , TEMP.* FROM ( SELECT r.NO, r.CONTENT, r.ENROLL_DATE, r.DEL_YN, d.NAME as DESIGNER_NAME, s.NAME as SHOP_NAME, c.NICK as CUSTOMER_NICK, st.NAME as STYLE_NAME FROM REVIEW r INNER JOIN RESERVATION rv ON r.R_NO = rv.NO INNER JOIN DESIGNER d ON rv.D_NO = d.NO INNER JOIN SHOP s ON d.SHOP = s.NO INNER JOIN CUSTOMER c ON rv.C_NO = c.NO INNER JOIN STYLE st ON rv.S_NO = st.NO WHERE R.DEL_YN = 'N' ORDER BY NO DESC ) TEMP ) WHERE RNUM BETWEEN ? AND ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int startRow = (pageVo.getCurrentPage()-1) * pageVo.getBoardLimit() + 1; 
			int endRow = startRow + pageVo.getBoardLimit() - 1;
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			ResultSet rs = pstmt.executeQuery();
			
			//rs -> obj (List<BoardVo>)
			List<ReviewVo> reviewList = new ArrayList<ReviewVo>();
			
			while( rs.next() ) {
				
				String no = rs.getString("NO");
				String writer = rs.getString("CUSTOMER_NICK");
				String shopName =  rs.getString("SHOP_NAME");
				String designerName =  rs.getString("DESIGNER_NAME");
				//String rNo = rs.getString("R_NO");
				String content = rs.getString("CONTENT");
				
				//String enrollDate = rs.getString("ENROLL_DATE");
				
				ReviewVo vo = new ReviewVo();
				vo.setNo(no);
				//vo.setrNo(rNo);
				vo.setContent(content);
				//vo.setEnrollDate(enrollDate);
				vo.setWriter(writer);
				vo.setShopName(shopName);
				vo.setDesignerName(designerName);
				
				
				reviewList.add(vo);
				
			}
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
			System.out.println();
			return reviewList;
		}
		
		
		//게시글 전체 갯수 조회 (삭제되지않은)
		public int selectCount(Connection conn) throws Exception {
			
			//SQL (close)
			String sql = "SELECT COUNT(*) AS CNT FROM REVIEW WHERE DEL_YN = 'N'";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			//rs -> obj
			int cnt = 0;
			if( rs.next() ) {
				cnt = rs.getInt("CNT");
			}
			
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
			
			return cnt;
		}


		//게시글 상세조회
		public ReviewVo selectOne(Connection conn, String no) throws Exception {
			
			//SQL
			String sql = "SELECT r.NO, r.CONTENT, r.ENROLL_DATE,  d.NAME as DESIGNER_NAME, s.NAME as SHOP_NAME, c.NICK as CUSTOMER_NICK, st.NAME as STYLE_NAME FROM REVIEW r  INNER JOIN RESERVATION rv ON r.R_NO = rv.NO INNER JOIN DESIGNER d ON rv.D_NO = d.NO INNER JOIN SHOP s ON d.SHOP = s.NO INNER JOIN CUSTOMER c ON rv.C_NO = c.NO INNER JOIN STYLE st ON rv.S_NO = st.NO WHERE R.NO = ? AND R.DEL_YN = 'N'";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, no);
			ResultSet rs = pstmt.executeQuery();
			
			//rs -> obj
			ReviewVo reviewVo = null;
			if( rs.next() ) {
				String reviewNo = rs.getString("NO");
				String content = rs.getString("CONTENT");
				String enrollDate = rs.getString("ENROLL_DATE");
				String shopName =  rs.getString("SHOP_NAME");
				String designerName =  rs.getString("DESIGNER_NAME"); 
				String styleName = rs.getString("STYLE_NAME");
				//String changeName = rs.getString("CHANGE_NAME");
				
				reviewVo = new ReviewVo();
				reviewVo.setNo(reviewNo);
				reviewVo.setContent(content);
				reviewVo.setEnrollDate(enrollDate);
				reviewVo.setShopName(shopName);
				reviewVo.setDesignerName(designerName);
				reviewVo.setStyleName(styleName);
				//reviewVo.setChangeName(changeName);
			}
			
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
			
			return reviewVo;


		}
		
		//게시글 작성
		public int write(Connection conn, ReviewVo vo) throws Exception {
			
			//SQL (close)
			String sql = "INSERT INTO REVIEW(NO , CONTENT , WRITER ,R_NO) VALUES (SEQ_REVIEW_NO.NEXTVAL , ? , ? , ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getContent());
			pstmt.setString(2, vo.getWriter());
			pstmt.setString(3, vo.getrNo());
			int result = pstmt.executeUpdate();
			
			JDBCTemplate.close(pstmt);
			
			return result;
		}
		
		
		//첨부파일 인서트
		public int insertAttachment(Connection conn, ReviewAttachmentVo atVo) throws Exception {
			
			//SQL
			String sql = "INSERT INTO ATTACHMENT (NO, ORIGIN_NAME, CHANGE_NAME, REF_REVIEW_NO) VALUES(SEQ_ATTACHMENT_NO.NEXTVAL , ? , ? , SEQ_REVIEW_NO.CURRVAL)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, atVo.getOriginName());
			pstmt.setString(2, atVo.getChangeName());
			int result = pstmt.executeUpdate();
			
			//close
			JDBCTemplate.close(pstmt);
			
			return result;
		}
		
}		