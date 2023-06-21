package coty.admin.faq.dvo;

public class FAQ_a_Vo {
	
	private String no;
	private String title;
	private String content;
	private String enrollDate;
	private String deleteYn;
	private String writer;
	private String hit;
	
	public FAQ_a_Vo() {
	}
	public FAQ_a_Vo(String no, String title, String content, String enrollDate, String deleteYn, String writer,
			String hit) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.enrollDate = enrollDate;
		this.deleteYn = deleteYn;
		this.writer = writer;
		this.hit = hit;
	}
	@Override
	public String toString() {
		return "FAQ_a_Vo [no=" + no + ", title=" + title + ", content=" + content + ", enrollDate=" + enrollDate
				+ ", deleteYn=" + deleteYn + ", writer=" + writer + ", hit=" + hit + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getDeleteYn() {
		return deleteYn;
	}
	public void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getHit() {
		return hit;
	}
	public void setHit(String hit) {
		this.hit = hit;
	}

}
