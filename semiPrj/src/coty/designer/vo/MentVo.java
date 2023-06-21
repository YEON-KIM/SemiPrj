package coty.designer.vo;

public class MentVo {
	private String no;
	private String rNo;
	private String ment;
	public MentVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MentVo(String ment) {
		super();
		this.ment = ment;
	}
	@Override
	public String toString() {
		return "MentVo [no=" + no + ", rNo=" + rNo + ", ment=" + ment + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getrNo() {
		return rNo;
	}
	public void setrNo(String rNo) {
		this.rNo = rNo;
	}
	public String getMent() {
		return ment;
	}
	public void setMent(String ment) {
		this.ment = ment;
	}
}
