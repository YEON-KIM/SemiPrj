package coty.member.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import coty.market.vo.ProductVo;
import coty.market.vo.Product_ImgVo;
import coty.member.dao.CartDao;
import coty.member.vo.CartVo;
import coty.member.vo.MemberVo;
import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class CartService {

	//게시글 조회 (페이징 처리가 된)
		public List<CartVo> selectList(PageVo pageVo, MemberVo loginMember) throws Exception {
			
			//비즈니스 로직
			
			//conn
			Connection conn = JDBCTemplate.getConnection();
			
			//SQL (DAO)
			CartDao dao = new CartDao();
			List<CartVo> cartList = dao.selectList(conn , pageVo, loginMember);
			
			//close
			JDBCTemplate.close(conn);
			
			return cartList;
		}
		
		//게시글 전체 갯수 조회 (삭제되지않은)
		public int selectCount() throws Exception {
			
			//비지니스 로직
			
			//conn
			Connection conn = JDBCTemplate.getConnection();
			
			//SQL (DAO)
			CartDao dao = new CartDao();
			int result = dao.selectCount(conn);
			
			//close
			JDBCTemplate.close(conn);
			
			return result;
		}

		public int addProduct(CartVo cartVo) throws Exception {
			
			//로직
			
			Connection conn = JDBCTemplate.getConnection();
			
			CartDao dao = new CartDao();
			int result = dao.addProduct(conn, cartVo);
			
			if(result == 1) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
			
			JDBCTemplate.close(conn);
			
			return result;
		}

		public int deleteProduct(CartVo cartVo) throws Exception {
			
			Connection conn = JDBCTemplate.getConnection();
			
			CartDao dao = new CartDao();
			int result = dao.deleteProduct(conn, cartVo);
			
			if(result == 1) {
				System.out.println("커밋");
				JDBCTemplate.commit(conn);
			}else {
				System.out.println("롤백..");
				JDBCTemplate.rollback(conn);
			}
			
			JDBCTemplate.close(conn);
			
			return result;
		}


}
