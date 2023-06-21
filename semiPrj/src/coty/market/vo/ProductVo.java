package coty.market.vo;

public class ProductVo {
	
	private String no;
	private String cNo;
	private String name;
	private String price;
	private String deleteYn;
	private String ex;
	private String src;
	private String amount;
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
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "ProductVo [no=" + no + ", cNo=" + cNo + ", name=" + name + ", price=" + price + ", deleteYn=" + deleteYn
				+ ", ex=" + ex + ", src=" + src + ", amount=" + amount + "]";
	}
	public ProductVo(String no, String cNo, String name, String price, String deleteYn, String ex, String src,
			String amount) {
		super();
		this.no = no;
		this.cNo = cNo;
		this.name = name;
		this.price = price;
		this.deleteYn = deleteYn;
		this.ex = ex;
		this.src = src;
		this.amount = amount;
	}
	public ProductVo() {
		super();
		// TODO Auto-generated constructor stub
	}

}