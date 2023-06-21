package coty.reservation.service;

import java.sql.Connection;

import coty.reservation.dao.ReservationDao;
import coty.reservation.vo.ReservationVo;
import coty.util.JDBCTemplate;

public class ReservationService {

	public int yeyak(ReservationVo vo) throws Exception {
		
		//비지니스로직
		
		//conn
		Connection conn = JDBCTemplate.getConnection();
		
		//sql(dao)
		ReservationDao dao = new ReservationDao();
		int result = dao.yeyak(conn , vo);
		
		//close
		JDBCTemplate.close(conn);
		
		return result;
		
	}

}
