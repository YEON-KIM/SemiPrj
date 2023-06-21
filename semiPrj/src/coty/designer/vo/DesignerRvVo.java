package coty.designer.vo;

public class DesignerRvVo {

	private String no;
	private String rNo;
	private String sNo;
	private String syNo;
	private String res;
	private String cNo;
	private String shopName;
	private String styleName;
	private String reNo;
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
	public String getsNo() {
		return sNo;
	}
	public void setsNo(String sNo) {
		this.sNo = sNo;
	}
	public String getSyNo() {
		return syNo;
	}
	public void setSyNo(String syNo) {
		this.syNo = syNo;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	public String getcNo() {
		return cNo;
	}
	public void setcNo(String cNo) {
		this.cNo = cNo;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getStyleName() {
		return styleName;
	}
	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}
	public String getReNo() {
		return reNo;
	}
	public void setReNo(String reNo) {
		this.reNo = reNo;
	}
	@Override
	public String toString() {
		return "DesignerRvVo [no=" + no + ", rNo=" + rNo + ", sNo=" + sNo + ", syNo=" + syNo + ", res=" + res + ", cNo="
				+ cNo + ", shopName=" + shopName + ", styleName=" + styleName + ", reNo=" + reNo + "]";
	}
	public DesignerRvVo(String no, String rNo, String sNo, String syNo, String res, String cNo, String shopName,
			String styleName, String reNo) {
		super();
		this.no = no;
		this.rNo = rNo;
		this.sNo = sNo;
		this.syNo = syNo;
		this.res = res;
		this.cNo = cNo;
		this.shopName = shopName;
		this.styleName = styleName;
		this.reNo = reNo;
	}
	public DesignerRvVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
