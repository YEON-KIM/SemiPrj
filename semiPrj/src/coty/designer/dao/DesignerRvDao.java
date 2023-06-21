package coty.designer.dao;

import static coty.util.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import coty.admin.adminVo.DesignerVo;
import coty.communication.vo.ReviewVo;
import coty.designer.vo.DesignerRvVo;
import coty.designer.vo.MentVo;
import coty.member.vo.CartVo;
import coty.member.vo.MemberVo;
import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class DesignerRvDao {
	//게시글 조회 (페이징 처리가 된)
		public List<DesignerRvVo> selectList(Connection conn , PageVo pageVo, DesignerVo deLoginVo) throws Exception {

			
			//SQL (close)
			String sql = "SELECT * FROM ( SELECT ROWNUM AS rnum, temp.*  FROM ( SELECT DR.NO, DR.R_NO, DR.S_NO, DR.SY_NO,DR.RE_NO, DR.RES, R.C_NO, R.D_NO, S.NAME AS SHOP_NAME, SY.NAME AS STYLE_NAME FROM D_RES DR JOIN RESERVATION R ON R.NO = DR.R_NO JOIN SHOP S ON S.NO = DR.S_NO JOIN STYLE SY ON SY.NO = DR.SY_NO JOIN REVIEW RE ON RE.NO = DR.RE_NO WHERE R.D_NO = ? ORDER BY DR.NO DESC ) temp ) WHERE rnum BETWEEN ? AND ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, deLoginVo.getNo());
			int startRow = (pageVo.getCurrentPage()-1) * pageVo.getBoardLimit() + 1;
			int endRow = startRow + pageVo.getBoardLimit() - 1;
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			ResultSet rs = pstmt.executeQuery();
			
			//rs -> obj (List<ProductVo>)
			List<DesignerRvVo> designerRvList = new ArrayList<DesignerRvVo>();
			
			while( rs.next() ) {
				
				String no = rs.getString("NO");
				String rNo = rs.getString("R_NO");
				String sNo = rs.getString("S_NO");
				String syNo = rs.getString("SY_NO");
				String reNo = rs.getString("RE_NO");
				String res = rs.getString("RES");
				String cNo = rs.getString("C_NO");
				String shopName = rs.getString("SHOP_NAME");
				String styleName = rs.getString("STYLE_NAME");
				
				DesignerRvVo vo = new DesignerRvVo();
				vo.setNo(no);
				vo.setrNo(rNo);
				vo.setsNo(sNo);
				vo.setSyNo(syNo);
				vo.setReNo(reNo);
				vo.setRes(res);
				vo.setcNo(cNo);
				vo.setShopName(shopName);
				vo.setStyleName(styleName);
				
				
				designerRvList.add(vo);
			}
			return designerRvList;
		}

		public int selectCount(Connection conn) throws Exception {
			
			//SQL (close)
			String sql = "SELECT COUNT(*) AS CNT FROM PRODUCT WHERE DELETE_YN = 'N'";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			//rs -> obj
			int cnt = 0;
			if( rs.next() ) {
				cnt = rs.getInt("CNT");
			}
			
			close(rs);
			close(pstmt);
			
			return cnt;
		}
		
		//상품 추가하기(insert)
		public int addProduct(Connection conn, CartVo cartVo) throws Exception {
			
			System.out.println(cartVo.toString());
		
			
			String sql = "INSERT INTO CART(NO, P_NO, C_NO, AMOUNT) VALUES (SEQ_CART_NO.NEXTVAL, ?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, cartVo.getpNo());
			pstmt.setString(2, cartVo.getcNo());
			pstmt.setString(3, cartVo.getAmount());
			int result = pstmt.executeUpdate();
			
			close(pstmt);
			
			return result;
		}

		public DesignerRvVo editres(Connection conn, DesignerRvVo dvo) throws Exception {
			
			String sql = "UPDATE D_RES SET RES = '예약 취소' WHERE NO= ? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, dvo.getRes());
			pstmt.setString(1, dvo.getNo());
			
			int result = pstmt.executeUpdate();
			System.out.println(result +"11");
			
			JDBCTemplate.close(pstmt);
			
			System.out.println(dvo);
			return dvo;
		}

		public int addment(Connection conn, MentVo vo) throws Exception {
			String sql = "INSERT INTO MENT (NO, R_NO, MENT) VALUES (SEQ_MENT_NO.NEXTVAL, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getrNo());
			pstmt.setString(2, vo.getMent());
			int result = pstmt.executeUpdate();
			
			JDBCTemplate.close(pstmt);
			
			return result;
		}

		public MentVo ment(Connection conn, String no) throws Exception {
			String sql = "SELECT M.NO, M.R_NO, M.MENT FROM MENT M JOIN REVIEW R ON R.NO = M.R_NO WHERE R.NO = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, no);
			ResultSet rs = pstmt.executeQuery();
			
			//rs -> obj
			MentVo mentVo = null;
			if( rs.next() ) {
				String mno = rs.getString("NO");
				String rNo = rs.getString("R_NO");
				String ment = rs.getString("MENT");
				
				mentVo = new MentVo();
				mentVo.setNo(no);
				mentVo.setrNo(rNo);
				mentVo.setMent(ment);
				
			}
			
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
			
			return mentVo;
		}
}
