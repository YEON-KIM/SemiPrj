package coty.communication.vo;

import coty.member.vo.MemberVo;

public class ReviewVo {
	
	private String no;
	private String rNo;
	private String content;
	private String enrollDate;
	private String delYn;
	private String hit;
	private String changeName;
	private String customerNick;
	private String shopName;
	private String designerName;
	private String styleName;
	private String writer;

	public ReviewVo() {
		// TODO Auto-generated constructor stub
	}

	public ReviewVo(String no, String rNo, String content, String enrollDate, String delYn, String hit,
			String changeName, String customerNick, String shopName, String designerName, String styleName,
			String writer) {
		super();
		this.no = no;
		this.rNo = rNo;
		this.content = content;
		this.enrollDate = enrollDate;
		this.delYn = delYn;
		this.hit = hit;
		this.changeName = changeName;
		this.customerNick = customerNick;
		this.shopName = shopName;
		this.designerName = designerName;
		this.styleName = styleName;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "ReviewVo [no=" + no + ", rNo=" + rNo + ", content=" + content + ", enrollDate=" + enrollDate
				+ ", delYn=" + delYn + ", hit=" + hit + ", changeName=" + changeName + ", customerNick=" + customerNick
				+ ", shopName=" + shopName + ", designerName=" + designerName + ", styleName=" + styleName + ", writer="
				+ writer + "]";
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getDelYn() {
		return delYn;
	}

	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}

	public String getHit() {
		return hit;
	}

	public void setHit(String hit) {
		this.hit = hit;
	}

	public String getChangeName() {
		return changeName;
	}

	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}

	public String getCustomerNick() {
		return customerNick;
	}

	public void setCustomerNick(String customerNick) {
		this.customerNick = customerNick;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getDesignerName() {
		return designerName;
	}

	public void setDesignerName(String designerName) {
		this.designerName = designerName;
	}

	public String getStyleName() {
		return styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	

}
