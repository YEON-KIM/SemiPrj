package coty.member.vo;

public class CartVo {
	
	private String no;
	private String pNo;
	private String cNo;
	/*
	 * private String pName; private String pSrc; private String pPrice;
	 */
	private String amount;
	private String deleteYn;
	private String name;
	private String src;
	private String price;
	public CartVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartVo(String no, String pNo, String cNo, String amount, String deleteYn, String name, String src,
			String price) {
		super();
		this.no = no;
		this.pNo = pNo;
		this.cNo = cNo;
		this.amount = amount;
		this.deleteYn = deleteYn;
		this.name = name;
		this.src = src;
		this.price = price;
	}
	@Override
	public String toString() {
		return "CartVo [no=" + no + ", pNo=" + pNo + ", cNo=" + cNo + ", amount=" + amount + ", deleteYn=" + deleteYn
				+ ", name=" + name + ", src=" + src + ", price=" + price + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getpNo() {
		return pNo;
	}
	public void setpNo(String pNo) {
		this.pNo = pNo;
	}
	public String getcNo() {
		return cNo;
	}
	public void setcNo(String cNo) {
		this.cNo = cNo;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDeleteYn() {
		return deleteYn;
	}
	public void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}	
}
