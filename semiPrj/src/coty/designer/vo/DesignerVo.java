package coty.designer.vo;

public class DesignerVo {
	
	private String no;
	private String s_no;
	private String id;
	private String pwd;
	private String name;
	private String phone;
	private String email;
	private String src;
	private String ex;
	private String quit_yn;
	public DesignerVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DesignerVo(String no, String s_no, String id, String pwd, String name, String phone, String email,
			String src, String ex, String quit_yn) {
		super();
		this.no = no;
		this.s_no = s_no;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.src = src;
		this.ex = ex;
		this.quit_yn = quit_yn;
	}
	@Override
	public String toString() {
		return "DesignerVo [no=" + no + ", s_no=" + s_no + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", phone="
				+ phone + ", email=" + email + ", src=" + src + ", ex=" + ex + ", quit_yn=" + quit_yn + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getS_no() {
		return s_no;
	}
	public void setS_no(String s_no) {
		this.s_no = s_no;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getEx() {
		return ex;
	}
	public void setEx(String ex) {
		this.ex = ex;
	}
	public String getQuit_yn() {
		return quit_yn;
	}
	public void setQuit_yn(String quit_yn) {
		this.quit_yn = quit_yn;
	}
}
