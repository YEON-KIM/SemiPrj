package coty.admin.adminVo;

//디자이너 테이블
public class DesignerVo {
	private String no; //pk
	private String id;
	private String pwd;
	private String name;
	private String phone;
	private String email;
	private String shop;
	private String nick;
	private String src;
	private String ex;
	private String changeName;
	private String shopName;
	
	public DesignerVo() {
	}
	
	public DesignerVo(String no, String id, String pwd, String name, String phone, String email, String shop,
			String nick, String src, String ex, String changeName, String shopName) {
		this.no = no;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.shop = shop;
		this.nick = nick;
		this.src = src;
		this.ex = ex;
		this.changeName = changeName;
		this.shopName = shopName;
	}
	
	@Override
	public String toString() {
		return "DesignerVo [no=" + no + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", phone=" + phone
				+ ", email=" + email + ", shop=" + shop + ", nick=" + nick + ", src=" + src + ", ex=" + ex
				+ ", changeName=" + changeName + ", shopName=" + shopName + "]";
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
	public String getShop() {
		return shop;
	}
	public void setShop(String shop) {
		this.shop = shop;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
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
	public String getchangeName() {
		return changeName;
	}
	public void setchangeName(String changeName) {
		this.changeName = changeName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	
}
