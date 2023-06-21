package coty.reservation.vo;

public class ReservationVo {
	
	private String no;
	private String cNo;
	private String dNo;
	private String sNo;
	private String fixYn;
	private String cR;
	private String rvDate;
	private String requestDay;

	public ReservationVo() {
		// TODO Auto-generated constructor stub
	}

	public ReservationVo(String no, String cNo, String dNo, String sNo, String fixYn, String cR, String rvDate,
			String requestDay) {
		super();
		this.no = no;
		this.cNo = cNo;
		this.dNo = dNo;
		this.sNo = sNo;
		this.fixYn = fixYn;
		this.cR = cR;
		this.rvDate = rvDate;
		this.requestDay = requestDay;
	}

	@Override
	public String toString() {
		return "ReservationVo [no=" + no + ", cNo=" + cNo + ", dNo=" + dNo + ", sNo=" + sNo + ", fixYn=" + fixYn
				+ ", cR=" + cR + ", rvDate=" + rvDate + ", requestDay=" + requestDay + "]";
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getcNo() {
		return cNo;
	}

	public void setcNo(String cNo) {
		this.cNo = cNo;
	}

	public String getdNo() {
		return dNo;
	}

	public void setdNo(String dNo) {
		this.dNo = dNo;
	}

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public String getFixYn() {
		return fixYn;
	}

	public void setFixYn(String fixYn) {
		this.fixYn = fixYn;
	}

	public String getcR() {
		return cR;
	}

	public void setcR(String cR) {
		this.cR = cR;
	}

	public String getRvDate() {
		return rvDate;
	}

	public void setRvDate(String rvDate) {
		this.rvDate = rvDate;
	}

	public String getRequestDay() {
		return requestDay;
	}

	public void setRequestDay(String requestDay) {
		this.requestDay = requestDay;
	}
	
	
	
}
