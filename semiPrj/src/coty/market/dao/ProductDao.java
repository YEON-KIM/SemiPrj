package coty.market.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import coty.market.vo.ProductVo;
import coty.util.JDBCTemplate;

public class ProductDao {
	

	public List<ProductVo> selectList1(Connection conn) throws Exception  {

		//SQL (close)
		String sql = "SELECT P.NO, P.NAME, P.PRICE, P.EX, P.SRC FROM PRODUCT P WHERE P.NO = '1'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<ProductVo> productList1 = new ArrayList<ProductVo>();
		
		while(rs.next()) {
			
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			String src = rs.getString("SRC");
			
			ProductVo vo = new ProductVo();
			vo.setNo(no);
			vo.setName(name);
			vo.setPrice(price);
			vo.setEx(ex);
			vo.setSrc(src);
			
			productList1.add(vo);
		}
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		
		return productList1;
	}
	public List<ProductVo> selectList2(Connection conn) throws Exception  {

		//SQL (close)
		String sql = "SELECT P.NO, P.NAME, P.PRICE, P.EX, P.SRC FROM PRODUCT P WHERE P.NO = '2'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<ProductVo> productList2 = new ArrayList<ProductVo>();
		
		while(rs.next()) {
			
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			String src = rs.getString("SRC");
			
			ProductVo vo = new ProductVo();
			vo.setNo(no);
			vo.setName(name);
			vo.setPrice(price);
			vo.setEx(ex);
			vo.setSrc(src);
			
			productList2.add(vo);
		}
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return productList2;
	}
	public List<ProductVo> selectList3(Connection conn) throws Exception  {

		//SQL (close)
		String sql = "SELECT P.NO, P.NAME, P.PRICE, P.EX, P.SRC FROM PRODUCT P WHERE P.NO = '3'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<ProductVo> productList3 = new ArrayList<ProductVo>();
		
		while(rs.next()) {
			
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			String src = rs.getString("SRC");
			
			ProductVo vo = new ProductVo();
			vo.setNo(no);
			vo.setName(name);
			vo.setPrice(price);
			vo.setEx(ex);
			vo.setSrc(src);
			
			productList3.add(vo);
		}
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return productList3;
	}
	public List<ProductVo> selectList4(Connection conn) throws Exception  {

		//SQL (close)
		String sql = "SELECT P.NO, P.NAME, P.PRICE, P.EX, P.SRC FROM PRODUCT P WHERE P.NO = '4'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<ProductVo> productList4 = new ArrayList<ProductVo>();
		
		while(rs.next()) {
			
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			String src = rs.getString("SRC");
			
			ProductVo vo = new ProductVo();
			vo.setNo(no);
			vo.setName(name);
			vo.setPrice(price);
			vo.setEx(ex);
			vo.setSrc(src);
			
			productList4.add(vo);
		}
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return productList4;
	}
	public List<ProductVo> selectList5(Connection conn) throws Exception  {

		//SQL (close)
		String sql = "SELECT P.NO, P.NAME, P.PRICE, P.EX, P.SRC FROM PRODUCT P WHERE P.NO = '5'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<ProductVo> productList5 = new ArrayList<ProductVo>();
		
		while(rs.next()) {
			
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			String src = rs.getString("SRC");
			
			ProductVo vo = new ProductVo();
			vo.setNo(no);
			vo.setName(name);
			vo.setPrice(price);
			vo.setEx(ex);
			vo.setSrc(src);
			
			productList5.add(vo);
		}
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return productList5;
	}
	public List<ProductVo> selectList6(Connection conn) throws Exception  {

		//SQL (close)
		String sql = "SELECT P.NO, P.NAME, P.PRICE, P.EX, P.SRC FROM PRODUCT P WHERE P.NO = '6'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<ProductVo> productList6 = new ArrayList<ProductVo>();
		
		while(rs.next()) {
			
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			String src = rs.getString("SRC");
			
			ProductVo vo = new ProductVo();
			vo.setNo(no);
			vo.setName(name);
			vo.setPrice(price);
			vo.setEx(ex);
			vo.setSrc(src);
			
			productList6.add(vo);
		}
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return productList6;
	}
	public List<ProductVo> selectList7(Connection conn) throws Exception  {

		//SQL (close)
		String sql = "SELECT P.NO, P.NAME, P.PRICE, P.EX, P.SRC FROM PRODUCT P WHERE P.NO = '7'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<ProductVo> productList7 = new ArrayList<ProductVo>();
		
		while(rs.next()) {
			
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			String src = rs.getString("SRC");
			
			ProductVo vo = new ProductVo();
			vo.setNo(no);
			vo.setName(name);
			vo.setPrice(price);
			vo.setEx(ex);
			vo.setSrc(src);
			
			productList7.add(vo);
		}
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return productList7;
	}
	public List<ProductVo> selectList8(Connection conn) throws Exception  {

		//SQL (close)
		String sql = "SELECT P.NO, P.NAME, P.PRICE, P.EX, P.SRC FROM PRODUCT P WHERE P.NO = '8'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<ProductVo> productList8 = new ArrayList<ProductVo>();
		
		while(rs.next()) {
			
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			String src = rs.getString("SRC");
			
			ProductVo vo = new ProductVo();
			vo.setNo(no);
			vo.setName(name);
			vo.setPrice(price);
			vo.setEx(ex);
			vo.setSrc(src);
			
			productList8.add(vo);
		}
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return productList8;
	}
	public List<ProductVo> selectList9(Connection conn) throws Exception  {

		//SQL (close)
		String sql = "SELECT P.NO, P.NAME, P.PRICE, P.EX, P.SRC FROM PRODUCT P WHERE P.NO = '9'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<ProductVo> productList9 = new ArrayList<ProductVo>();
		
		while(rs.next()) {
			
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			String src = rs.getString("SRC");
			
			ProductVo vo = new ProductVo();
			vo.setNo(no);
			vo.setName(name);
			vo.setPrice(price);
			vo.setEx(ex);
			vo.setSrc(src);
			
			productList9.add(vo);
		}
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return productList9;
	}
	public List<ProductVo> selectList10(Connection conn) throws Exception  {

		//SQL (close)
		String sql = "SELECT P.NO, P.NAME, P.PRICE, P.EX, P.SRC FROM PRODUCT P WHERE P.NO = '10'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<ProductVo> productList10 = new ArrayList<ProductVo>();
		
		while(rs.next()) {
			
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			String src = rs.getString("SRC");
			
			ProductVo vo = new ProductVo();
			vo.setNo(no);
			vo.setName(name);
			vo.setPrice(price);
			vo.setEx(ex);
			vo.setSrc(src);
			
			productList10.add(vo);
		}
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return productList10;
	}
	public List<ProductVo> selectList11(Connection conn) throws Exception  {

		//SQL (close)
		String sql = "SELECT P.NO, P.NAME, P.PRICE, P.EX, P.SRC FROM PRODUCT P WHERE P.NO = '11'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<ProductVo> productList11 = new ArrayList<ProductVo>();
		
		while(rs.next()) {
			
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			String src = rs.getString("SRC");
			
			ProductVo vo = new ProductVo();
			vo.setNo(no);
			vo.setName(name);
			vo.setPrice(price);
			vo.setEx(ex);
			vo.setSrc(src);
			
			productList11.add(vo);
		}
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return productList11;
	}
	public List<ProductVo> selectList12(Connection conn) throws Exception  {

		//SQL (close)
		String sql = "SELECT P.NO, P.NAME, P.PRICE, P.EX, P.SRC FROM PRODUCT P WHERE P.NO = '12'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<ProductVo> productList12 = new ArrayList<ProductVo>();
		
		while(rs.next()) {
			
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			String src = rs.getString("SRC");
			
			ProductVo vo = new ProductVo();
			vo.setNo(no);
			vo.setName(name);
			vo.setPrice(price);
			vo.setEx(ex);
			vo.setSrc(src);
			
			productList12.add(vo);
		}
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return productList12;
	}
	public List<ProductVo> selectList13(Connection conn) throws Exception  {

		//SQL (close)
		String sql = "SELECT P.NO, P.NAME, P.PRICE, P.EX, P.SRC FROM PRODUCT P WHERE P.NO = '13'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<ProductVo> productList13 = new ArrayList<ProductVo>();
		
		while(rs.next()) {
			
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			String src = rs.getString("SRC");
			
			ProductVo vo = new ProductVo();
			vo.setNo(no);
			vo.setName(name);
			vo.setPrice(price);
			vo.setEx(ex);
			vo.setSrc(src);
			
			productList13.add(vo);
		}
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return productList13;
	}
	public List<ProductVo> selectList14(Connection conn) throws Exception  {

		//SQL (close)
		String sql = "SELECT P.NO, P.NAME, P.PRICE, P.EX, P.SRC FROM PRODUCT P WHERE P.NO = '14'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<ProductVo> productList14 = new ArrayList<ProductVo>();
		
		while(rs.next()) {
			
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			String src = rs.getString("SRC");
			
			ProductVo vo = new ProductVo();
			vo.setNo(no);
			vo.setName(name);
			vo.setPrice(price);
			vo.setEx(ex);
			vo.setSrc(src);
			
			productList14.add(vo);
		}
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return productList14;
	}
	public List<ProductVo> selectList15(Connection conn) throws Exception  {

		//SQL (close)
		String sql = "SELECT P.NO, P.NAME, P.PRICE, P.EX, P.SRC FROM PRODUCT P WHERE P.NO = '15'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		List<ProductVo> productList15 = new ArrayList<ProductVo>();
		
		while(rs.next()) {
			
			String no = rs.getString("NO");
			String name = rs.getString("NAME");
			String price = rs.getString("PRICE");
			String ex = rs.getString("EX");
			String src = rs.getString("SRC");
			
			ProductVo vo = new ProductVo();
			vo.setNo(no);
			vo.setName(name);
			vo.setPrice(price);
			vo.setEx(ex);
			vo.setSrc(src);
			
			productList15.add(vo);
		}
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		return productList15;
	}
	
	
	
}
