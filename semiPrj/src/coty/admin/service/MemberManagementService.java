package coty.admin.service;

import java.sql.Connection;
import java.util.List;

import coty.admin.dao.MemberManagemetDao;
import coty.member.vo.MemberVo;
import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class MemberManagementService {
	//회원 계정 목록 조회 (select) (페이징 처리가 된 상태로)
	public List<MemberVo> selectMemberList(PageVo pageVo) throws Exception{
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//sql(DAO)
		MemberManagemetDao dao = new MemberManagemetDao();
		List<MemberVo> memberList = dao.selectMemberList(conn, pageVo);
		
		//close
		JDBCTemplate.close(conn);
		
		return memberList;
	
	}
	//회원 전체 갯수 조회 (select)
	public int selectCount() throws Exception {
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//sql(DAO)
		MemberManagemetDao dao = new MemberManagemetDao();
		int mListCout = dao.selectCount(conn);
		
		//close
		JDBCTemplate.close(conn);
		
		return mListCout;
		
	}
	
	//회원 목록 상세 조회(select)
	public MemberVo selectMemberInfo(String no) throws Exception {
		//conn 
		Connection conn = JDBCTemplate.getConnection();
		
		//sql(DAO)
		MemberManagemetDao dao = new MemberManagemetDao();
		MemberVo memberVo = dao.selectMemberInfo(conn ,no);
		
		//close
		JDBCTemplate.close(conn);
		
		return memberVo;
	}
	
	//회원 특이사항 수정(update)
	public int memberInfoEdit(String com, String num) throws Exception {
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//sql(DAO)
		MemberManagemetDao dao = new MemberManagemetDao();
		int result = dao.memberInfoEdit(com, num, conn);
		
		//tx , close
		if(result == 1) {
			JDBCTemplate.commit(conn);
		}else {
			JDBCTemplate.rollback(conn);
		}
		JDBCTemplate.close(conn);
		
		return result;
	
	}
	
	
}
