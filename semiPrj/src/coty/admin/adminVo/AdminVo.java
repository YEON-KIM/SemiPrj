package coty.admin.adminVo;

public class AdminVo {
	private String no;
	private String id;
	private String pwd;
	
	public AdminVo() {

	}

	public AdminVo(String no, String id, String pwd) {
		this.no = no;
		this.id = id;
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "AdminVo [no=" + no + ", id=" + id + ", pwd=" + pwd + "]";
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	
	
	
}
