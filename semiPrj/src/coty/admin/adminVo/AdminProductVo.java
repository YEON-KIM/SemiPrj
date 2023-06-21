package coty.admin.adminVo;

public class AdminProductVo {
	private String no;
	private String name;
	private String price;
	private String deleteYn;
	private String ex;
	private String src;
	private String category;
	
	
	public AdminProductVo() {
	}
	
	public AdminProductVo(String no, String name, String price, String deleteYn, String ex, String src,
			String category) {
		this.no = no;
		this.name = name;
		this.price = price;
		this.deleteYn = deleteYn;
		this.ex = ex;
		this.src = src;
		this.category = category;
	}
	
	@Override
	public String toString() {
		return "AdminProductVo [no=" + no + ", name=" + name + ", price=" + price + ", deleteYn=" + deleteYn + ", ex="
				+ ex + ", src=" + src + ", category=" + category + "]";
	}
	
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDeleteYn() {
		return deleteYn;
	}
	public void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}
	public String getEx() {
		return ex;
	}
	public void setEx(String ex) {
		this.ex = ex;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
