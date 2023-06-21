package coty.communication.service;

import java.sql.Connection;
import java.util.List;

import coty.communication.dao.ReviewDao;
import coty.communication.vo.ReviewAttachmentVo;
import coty.communication.vo.ReviewVo;
import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class ReviewService {

	//게시글 조회 (페이징 처리가 된)
		public List<ReviewVo> selectList(PageVo pageVo) throws Exception {
			
			//비즈니스 로직
			
			//conn
			Connection conn = JDBCTemplate.getConnection();
			
			//SQL (DAO)
			ReviewDao dao = new ReviewDao();
			List<ReviewVo> reviewList = dao.selectList(conn , pageVo);
			
			//close
			JDBCTemplate.close(conn);
			
			return reviewList;
		}
		
		//게시글 전체 갯수 조회 (삭제되지않은)
		public int selectCount() throws Exception {
			
			//비지니스 로직
			
			//conn
			Connection conn = JDBCTemplate.getConnection();
			
			//SQL (DAO)
			ReviewDao dao = new ReviewDao();
			int result = dao.selectCount(conn);
			
			//close
			JDBCTemplate.close(conn);
			
			return result;
		}

		//게시글 상세조회 
		public ReviewVo selectOne(String no) throws Exception {
			//비즈니스 로직
			
			//conn
			Connection conn = JDBCTemplate.getConnection();
			
			//DAO 호출 (조회쿼리 + 증가쿼리)
			ReviewDao dao = new ReviewDao();
			//int result = dao.increaseHit(conn, no);
			
			//if(result != 1) {
				//문제가 발생
			//	throw new Exception("[ERROR]조회수 증가 실패...");
			//}
				
			ReviewVo reviewVo = dao.selectOne(conn , no);
			
			//tx , close
			JDBCTemplate.commit(conn);
			JDBCTemplate.close(conn);
			
			return reviewVo;
		}//method
		
		//게시글 작성 (+첨부파일 인서트)
		public int write(ReviewVo vo) throws Exception {
			
			//비지니스 로직
			
			//conn
			Connection conn = JDBCTemplate.getConnection();
			
			ReviewDao dao = new ReviewDao();
			//SQL (DAO) == 게시글 인서트
			int result = dao.write(conn , vo);
			System.out.println(result);
			//SQL (DAO) == 첨부파일 인서트
			//int atResult = dao.insertAttachment(conn, atVo);
			
			//tx , close
			if(result == 1) {
				JDBCTemplate.commit(conn);
			}else {
				JDBCTemplate.rollback(conn);
			}
			
			JDBCTemplate.close(conn);
			
			return result ;
		}
	
	
}
