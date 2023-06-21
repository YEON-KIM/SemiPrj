package coty.reservation.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import coty.reservation.vo.ReservationVo;

public class ReservationDao {

	public int yeyak(Connection conn, ReservationVo vo) throws Exception {
		
		//sql
		String sql = "";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		return 0;
		
		
		
	}

}
