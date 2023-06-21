package coty.market.service;

import java.sql.Connection;
import java.util.List;

import coty.market.dao.ProductDao;
import coty.market.vo.ProductVo;
import coty.util.JDBCTemplate;

public class ProductService {

	public List<ProductVo> selectList1() throws Exception {

		Connection conn = JDBCTemplate.getConnection();
		
		ProductDao dao = new ProductDao();
		List<ProductVo> productList1 = dao.selectList1(conn);
		//close
		JDBCTemplate.close(conn);
		
		return productList1;
	}
	public List<ProductVo> selectList2() throws Exception {

		Connection conn = JDBCTemplate.getConnection();
		
		ProductDao dao = new ProductDao();
		List<ProductVo> productList2 = dao.selectList2(conn);
		//close
		JDBCTemplate.close(conn);
		
		return productList2;
	}
	public List<ProductVo> selectList3() throws Exception {

		Connection conn = JDBCTemplate.getConnection();
		
		ProductDao dao = new ProductDao();
		List<ProductVo> productList3 = dao.selectList3(conn);
		//close
		JDBCTemplate.close(conn);
		
		return productList3;
	}
	public List<ProductVo> selectList4() throws Exception {

		Connection conn = JDBCTemplate.getConnection();
		
		ProductDao dao = new ProductDao();
		List<ProductVo> productList4 = dao.selectList4(conn);
		//close
		JDBCTemplate.close(conn);
		
		return productList4;
	}
	public List<ProductVo> selectList5() throws Exception {

		Connection conn = JDBCTemplate.getConnection();
		
		ProductDao dao = new ProductDao();
		List<ProductVo> productList5 = dao.selectList5(conn);
		//close
		JDBCTemplate.close(conn);
		
		return productList5;
	}
	public List<ProductVo> selectList6() throws Exception {

		Connection conn = JDBCTemplate.getConnection();
		
		ProductDao dao = new ProductDao();
		List<ProductVo> productList6 = dao.selectList6(conn);
		//close
		JDBCTemplate.close(conn);
		
		return productList6;
	}
	public List<ProductVo> selectList7() throws Exception {

		Connection conn = JDBCTemplate.getConnection();
		
		ProductDao dao = new ProductDao();
		List<ProductVo> productList7 = dao.selectList7(conn);
		//close
		JDBCTemplate.close(conn);
		
		return productList7;
	}
	public List<ProductVo> selectList8() throws Exception {

		Connection conn = JDBCTemplate.getConnection();
		
		ProductDao dao = new ProductDao();
		List<ProductVo> productList8 = dao.selectList8(conn);
		//close
		JDBCTemplate.close(conn);
		
		return productList8;
	}
	public List<ProductVo> selectList9() throws Exception {

		Connection conn = JDBCTemplate.getConnection();
		
		ProductDao dao = new ProductDao();
		List<ProductVo> productList9 = dao.selectList9(conn);
		//close
		JDBCTemplate.close(conn);
		
		return productList9;
	}
	public List<ProductVo> selectList10() throws Exception {

		Connection conn = JDBCTemplate.getConnection();
		
		ProductDao dao = new ProductDao();
		List<ProductVo> productList10 = dao.selectList10(conn);
		//close
		JDBCTemplate.close(conn);
		
		return productList10;
	}
	public List<ProductVo> selectList11() throws Exception {

		Connection conn = JDBCTemplate.getConnection();
		
		ProductDao dao = new ProductDao();
		List<ProductVo> productList11 = dao.selectList11(conn);
		//close
		JDBCTemplate.close(conn);
		
		return productList11;
	}
	public List<ProductVo> selectList12() throws Exception {

		Connection conn = JDBCTemplate.getConnection();
		
		ProductDao dao = new ProductDao();
		List<ProductVo> productList12 = dao.selectList12(conn);
		//close
		JDBCTemplate.close(conn);
		
		return productList12;
	}
	public List<ProductVo> selectList13() throws Exception {

		Connection conn = JDBCTemplate.getConnection();
		
		ProductDao dao = new ProductDao();
		List<ProductVo> productList13 = dao.selectList13(conn);
		//close
		JDBCTemplate.close(conn);
		
		return productList13;
	}
	public List<ProductVo> selectList14() throws Exception {

		Connection conn = JDBCTemplate.getConnection();
		
		ProductDao dao = new ProductDao();
		List<ProductVo> productList14 = dao.selectList14(conn);
		//close
		JDBCTemplate.close(conn);
		
		return productList14;
	}
	public List<ProductVo> selectList15() throws Exception {

		Connection conn = JDBCTemplate.getConnection();
		
		ProductDao dao = new ProductDao();
		List<ProductVo> productList15 = dao.selectList15(conn);
		//close
		JDBCTemplate.close(conn);
		
		return productList15;
	}

}
