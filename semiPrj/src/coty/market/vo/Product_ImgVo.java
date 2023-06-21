package coty.market.vo;

public class Product_ImgVo {

	private String no;
	private String p_no;
	private String src;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getP_no() {
		return p_no;
	}
	public void setP_no(String p_no) {
		this.p_no = p_no;
	}
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	@Override
	public String toString() {
		return "Product_ImgVo [no=" + no + ", p_no=" + p_no + ", src=" + src + "]";
	}
	public Product_ImgVo(String no, String p_no, String src) {
		super();
		this.no = no;
		this.p_no = p_no;
		this.src = src;
	}
	public Product_ImgVo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
