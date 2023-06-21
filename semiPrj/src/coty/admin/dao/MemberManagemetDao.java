package coty.admin.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import coty.member.vo.MemberVo;
import coty.util.JDBCTemplate;
import coty.util.PageVo;

public class MemberManagemetDao {
	
	//회원 계정 목록 조회 (select)(페이징 처리가 된 상태로)
	public List<MemberVo> selectMemberList(Connection conn, PageVo pageVo) throws Exception{
		//sql
		String sql="SELECT * FROM ( SELECT ROWNUM RNUM ,NO ,NICK ,ID ,GENDER_FM ,SIGN_UP_DAY ,QUIT_YN FROM CUSTOMER ORDER BY NO DESC ) WHERE RNUM BETWEEN ? AND ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int startRow = (pageVo.getCurrentPage()-1) * pageVo.getBoardLimit()+1;
		int endRow = startRow + pageVo.getBoardLimit() - 1;
		pstmt.setInt(1, startRow);
		pstmt.setInt(2, endRow);
		ResultSet rs = pstmt.executeQuery();
		
		List<MemberVo> memberList = new ArrayList<>();
		
		while(rs.next()) {
			String no = rs.getString("NO");
			String nick = rs.getString("NICK");
			String id = rs.getString("ID");
			String genderFm = rs.getString("GENDER_FM");
			String signUpDay = rs.getString("SIGN_UP_DAY");
			String quitYn = rs.getString("QUIT_YN");
			
			MemberVo mVo = new MemberVo();
			mVo.setNo(no);
			mVo.setNick(nick);
			mVo.setId(id);
			mVo.setGender_fm(genderFm);
			mVo.setSignUpDay(signUpDay);
			mVo.setQuitYn(quitYn);
			
			memberList.add(mVo);
		}
		
		//close
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);

		return memberList;
		
		
	}
	
	//회원 전체 갯수 조회 (select)
	public int selectCount(Connection conn) throws Exception {
		//sql
		String sql = "SELECT COUNT(*) AS CNT FROM CUSTOMER";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		int cnt = 0;
		if(rs.next()) {
			cnt = rs.getInt("CNT");
		}
		
		//close
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		
		
		return cnt;
	}
	
	//회원 목록 상세 조회(select)
	public MemberVo selectMemberInfo(Connection conn , String no) throws Exception {
		//sql
		String sql="SELECT * FROM CUSTOMER WHERE NO = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, no);
		ResultSet rs = pstmt.executeQuery();
		
		MemberVo memberVo = null;
		if(rs.next()) {
			String memNO = rs.getString("NO");
			String memName = rs.getString("NAME");
			String memId = rs.getString("ID");
			String memNick = rs.getString("NICK");
			String memBirth = rs.getString("BIRTH");
			String memEmail = rs.getString("EMAIL");
			String memGender = rs.getString("GENDER_FM");
			String memSignUpDay = rs.getString("SIGN_UP_DAY");
			String quitYn = rs.getString("QUIT_YN");
			String phone = rs.getString("PHONE");
			String com = rs.getString("COM");
			
			memberVo = new MemberVo();
			
			memberVo.setNo(memNO);
			memberVo.setName(memName);
			memberVo.setId(memId);
			memberVo.setNick(memNick);
			memberVo.setBirth(memBirth);
			memberVo.setEmail(memEmail);
			memberVo.setGender_fm(memGender);
			memberVo.setSignUpDay(memSignUpDay);
			memberVo.setQuitYn(quitYn);
			memberVo.setPhone(phone);
			memberVo.setCom(com);
		}
		
		//close
		JDBCTemplate.close(pstmt);
		JDBCTemplate.close(rs);
		
		return memberVo;
	}
	
	//회원 정보 특이사항 수정
	public int memberInfoEdit(String com, String num, Connection conn) throws Exception {
		//sql
		String sql="UPDATE CUSTOMER SET COM = ? WHERE NO= ? ";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, com);
		pstmt.setString(2, num);
		int result = pstmt.executeUpdate();
		
		//close
		JDBCTemplate.close(pstmt);
		
		return result;
	}
	
	
}
