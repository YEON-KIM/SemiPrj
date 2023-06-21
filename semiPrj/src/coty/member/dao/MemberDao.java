package coty.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import coty.member.vo.MemberVo;
import coty.util.JDBCTemplate;

public class MemberDao {
	

	//회원가입
		public int join(Connection conn, MemberVo vo) throws Exception {
			
			//sql (close)
			
			String sql = "INSERT INTO CUSTOMER (NO, NAME, ID, PWD, NICK, SSNO, ADDRESS, EMAIL, GENDER_FM, PHONE) VALUES (seq_CUSTOMER_no.nextval, ?, ?, ?,? ,?,?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getId());
			pstmt.setString(3, vo.getPwd());
			pstmt.setString(4, vo.getNick());
			pstmt.setString(5, vo.getSsno());
			pstmt.setString(6, vo.getAddress());
			pstmt.setString(7, vo.getEmail());
			pstmt.setString(8, vo.getGender_fm());
			pstmt.setString(9, vo.getPhone());
		
			
			
			int result = pstmt.executeUpdate();
			
			JDBCTemplate.close(pstmt);
			
			return result;
		}
		
		

		//로그인
		public MemberVo login(Connection conn, MemberVo vo) throws Exception {
			//sql 실행 (close)
			
			
			String sql = "SELECT * FROM CUSTOMER WHERE ID = ? AND PWD = ? AND QUIT_YN = 'N'";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPwd());
			ResultSet rs = pstmt.executeQuery();
			
			//rs => MemberVo (obj 형태로 변환 )
			MemberVo loginMember = null;
			if(rs.next()) {
				String no = rs.getString("NO");
				String id = rs.getString("ID");
				String pwd = rs.getString("PWD");
				String nick = rs.getString("NICK");
				String name = rs.getString("NAME");
				String address = rs.getString("ADDRESS");
				String gender_fm = rs.getString("GENDER_FM");
				String phone = rs.getString("PHONE");
				String email = rs.getString("EMAIL");	
				String ssno = rs.getString("SSNO");
				
				loginMember = new MemberVo();
				loginMember.setNo(no);
				loginMember.setId(id);
				loginMember.setPwd(pwd);
				loginMember.setNick(nick);
				loginMember.setName(name);
				loginMember.setAddress(address);
				loginMember.setGender_fm(gender_fm);
				loginMember.setPhone(phone);
				loginMember.setEmail(email);
				loginMember.setSsno(ssno);
			
				
			}
			return loginMember;
		}

		//탈퇴
		public int quit(Connection conn, MemberVo loginMember) throws Exception {
			
			String sql = "UPDATE CUSTOMER SET QUIT_YN = 'Y' WHERE ID = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loginMember.getId());
			int result = pstmt.executeUpdate();
			
			JDBCTemplate.close(pstmt);
			
			return result;
		}
		
		//아이디찾기

	    public MemberVo findId(Connection conn, MemberVo vo) throws Exception {

	        String sql = "SELECT ID FROM CUSTOMER WHERE NAME=? AND SSNO=?";
	        PreparedStatement pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, vo.getName());
	        pstmt.setString(2, vo.getSsno());
	        ResultSet rs = pstmt.executeQuery();
	        
	        MemberVo findId = null;
	        if (rs.next()) {
	        	String id = rs.getString("ID");
	        	
	        	findId = new MemberVo();
	        	findId.setId(id);
	        }

	        JDBCTemplate.close(rs);
	        JDBCTemplate.close(pstmt);

	        return findId;
	    }
	    //비밀번호찾기
	    
		public MemberVo findPwd(Connection conn, MemberVo vo) throws Exception{
			
			String sql = "SELECT PWD FROM CUSTOMER WHERE NAME=? AND ID=? AND SSNO=?";
	        PreparedStatement pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, vo.getName());
	        pstmt.setString(2, vo.getId());
	        pstmt.setString(3, vo.getSsno());
	        ResultSet rs = pstmt.executeQuery();
	        
	        MemberVo findPwd = null;
	        if (rs.next()) {
	        	String pwd = rs.getString("PWD");
	        	
	        	findPwd = new MemberVo();
	        	findPwd.setPwd(pwd);
	        }

	        JDBCTemplate.close(rs);
	        JDBCTemplate.close(pstmt);

	        return findPwd;
	    }
		
		//회원정보 보여주기
		  

		public MemberVo selectMember(Connection conn, MemberVo vo) throws Exception {
			  
			String sql = "SELECT * FROM CUSTOMER WHERE ID = ?";
			    PreparedStatement pstmt = conn.prepareStatement(sql);
			    pstmt.setString(1, vo.getId());
			    ResultSet rs = pstmt.executeQuery();
			    
			    MemberVo selectMember = null;
			    if (rs.next()) {
			        String no = rs.getString("NO");
			        String name = rs.getString("NAME");	     
			        String id = rs.getString("ID");
			        String pwd = rs.getString("PWD");
			        String email = rs.getString("EMAIL");
			        String ssno = rs.getString("SSNO");
			        String gender_fm = rs.getString("GENDER_FM");
			        String nick = rs.getString("NICK");

			        
			        selectMember = new MemberVo();
			        selectMember.setNo(no);
			        selectMember.setName(name);
			        selectMember.setId(id);
			        selectMember.setPwd(pwd);
			        selectMember.setNick(nick);
			        selectMember.setSsno(ssno);
			        selectMember.setEmail(email);
			        selectMember.setGender_fm(gender_fm);
			    }

			    JDBCTemplate.close(rs);
			    JDBCTemplate.close(pstmt);

			    return selectMember;
			}
		//회원정보 수정
		public MemberVo editMember(Connection conn, MemberVo loginMember) throws Exception {
			
			String sql = "UPDATE CUSTOMER SET PWD=?, NICK=?, ADDRESS=?, EMAIL=?, PHONE=? WHERE NO=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, loginMember.getPwd());
			pstmt.setString(2, loginMember.getNick());
			pstmt.setString(3, loginMember.getAddress());
			pstmt.setString(4, loginMember.getEmail());
			pstmt.setString(5, loginMember.getPhone());
			pstmt.setString(6, loginMember.getNo());
			
			int result = pstmt.executeUpdate();
			
			JDBCTemplate.close(pstmt);
			
			return loginMember;
		}
		
	  
		
	}//class
	
