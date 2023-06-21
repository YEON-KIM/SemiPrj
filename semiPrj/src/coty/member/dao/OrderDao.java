package coty.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import coty.member.vo.AddressVo;
import coty.member.vo.MemberVo;
import coty.member.vo.OrderVo;
import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class OrderDao {
	//게시글 조회
		public List<OrderVo> selectList(Connection conn , PageVo pageVo, MemberVo loginMember) throws Exception {
			//sql
			String sql = "SELECT * FROM ( SELECT ROWNUM AS RNUM, TEMP.* FROM ( SELECT P_ORDER.NO, PRODUCT.NAME, ORD_LIST.AMOUNT, P_ORDER.TOTAL, P_ORDER.ORDATE, STATE.STATE, PAY.RE_YN, P_ORDER.C_NO AS CUSTOMER_NO FROM P_ORDER INNER JOIN CUSTOMER ON P_ORDER.C_NO = CUSTOMER.NO INNER JOIN PRODUCT ON P_ORDER.C_NO = PRODUCT.NO INNER JOIN ORD_LIST ON P_ORDER.C_NO = ORD_LIST.NO INNER JOIN STATE ON P_ORDER.C_NO = STATE.NO INNER JOIN PAY ON P_ORDER.C_NO = PAY.NO WHERE P_ORDER.C_NO = ? ORDER BY P_ORDER.NO DESC ) TEMP ) WHERE RNUM BETWEEN ? AND ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			int startRow = (pageVo.getCurrentPage()-1 ) * pageVo.getBoardLimit() +1;
			int endRow = startRow + pageVo.getBoardLimit() -1 ;
			pstmt.setString(1, loginMember.getNo());
			pstmt.setInt(2, startRow);
			pstmt.setInt(3, endRow);
			ResultSet rs = pstmt.executeQuery();
			
			//rs => obj (List<AddressVo>)
			List<OrderVo> OrderList = new ArrayList<OrderVo>();
			while (rs.next()) {
				String no = rs.getString("NO");
				String name = rs.getString("NAME");
				String amount = rs.getString("AMOUNT");
				String total = rs.getString("TOTAL");
				String ordate = rs.getString("ORDATE");
				String state = rs.getString("STATE");
				String re_yn = rs.getString("RE_YN");
				String c_no = rs.getString("CUSTOMER_NO");
				
				OrderVo vo = new OrderVo();
				vo.setNo(no);
				vo.setName(name);
				vo.setAmount(amount);
				vo.setTotal(total);
				vo.setOrdate(ordate);
				vo.setState(state);
				vo.setRe_yn(re_yn);
				vo.setC_no(c_no);
				
				OrderList.add(vo);
				
			}		
			
			return OrderList;
		}
		
		//게시글 전체 갯수 조회
		public int selectCount(Connection conn) throws Exception {
			
			//sql
			String sql = "SELECT COUNT(*) AS CNT FROM P_ORDER";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			//rs => obj
			int cnt = 0;
			if(rs.next()) {
				cnt = rs.getInt("CNT");
			}
			JDBCTemplate.close(rs);
			JDBCTemplate.close(pstmt);
			
			return cnt;
			
		}
		
		//게시글 상세조회
		public OrderVo selectOne(Connection conn, String no,MemberVo loginMember) throws Exception {
				
				//sql
				String sql ="SELECT * FROM P_ORDER INNER JOIN CUSTOMER ON P_ORDER.C_NO = CUSTOMER.NO WHERE P_ORDER.C_NO = ?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, loginMember.getNo());
				ResultSet rs = pstmt.executeQuery();
				
				
				//rs -> obj
				OrderVo orderVo = null;
				if(rs.next()) {
					String orderNo = rs.getString("NO");
			         String c_no = rs.getString("C_NO");
			         String ordate = rs.getString("ORDATE");
			         String total = rs.getString("TOTAL");
			         
				       orderVo = new OrderVo();
				       orderVo.setNo(no);
				       orderVo.setC_no(c_no);
				       orderVo.setOrdate(ordate);
				       orderVo.setTotal(total);
			         
				}
				
				
				JDBCTemplate.close(pstmt);
				JDBCTemplate.close(rs);
				
				return orderVo;
		}
}

