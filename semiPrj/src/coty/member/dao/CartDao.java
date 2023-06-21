package coty.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import coty.market.vo.Product_ImgVo;
import coty.member.vo.CartVo;
import coty.member.vo.MemberVo;
import coty.market.vo.ProductVo;
import static coty.util.JDBCTemplate.*;

import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class CartDao {

	//게시글 조회 (페이징 처리가 된)
	public List<CartVo> selectList(Connection conn , PageVo pageVo, MemberVo loginMember) throws Exception {

		
		//SQL (close)
		String sql = "SELECT * FROM ( SELECT ROWNUM AS rnum, temp.* FROM ( SELECT c.no, c.p_no, c.c_no, c.amount, c.delete_yn, p.name, p.src, p.price FROM cart c JOIN customer cu ON cu.no = c.c_no JOIN product p ON p.no = c.p_no WHERE cu.no = ? ORDER BY c.no DESC ) temp ) WHERE rnum BETWEEN ? AND ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, loginMember.getNo());
		int startRow = (pageVo.getCurrentPage()-1) * pageVo.getBoardLimit() + 1;
		int endRow = startRow + pageVo.getBoardLimit() - 1;
		pstmt.setInt(2, startRow);
		pstmt.setInt(3, endRow);
		ResultSet rs = pstmt.executeQuery();
		
		//rs -> obj (List<ProductVo>)
		List<CartVo> cartList = new ArrayList<CartVo>();
		
		while( rs.next() ) {
			
			String no = rs.getString("NO");
			String pNo = rs.getString("P_NO");
			String cNo = rs.getString("C_NO");
			String amount = rs.getString("AMOUNT");
			String name = rs.getString("NAME");
			String src = rs.getString("SRC");
			String price = rs.getString("PRICE");
			
			CartVo vo = new CartVo();
			vo.setNo(no);
			vo.setpNo(pNo);
			vo.setcNo(cNo);
			vo.setAmount(amount);
			vo.setName(name);
			vo.setSrc(src);
			vo.setPrice(price);
			
			
			cartList.add(vo);
		}
		System.out.println(cartList);
		return cartList;
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

	public int deleteProduct(Connection conn, CartVo cartVo) throws SQLException {
		
		String sql = "DELETE FROM CART WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, cartVo.getNo());
		int result = pstmt.executeUpdate();
		
		close(pstmt);
		
		return result;
	}

	

}//class
