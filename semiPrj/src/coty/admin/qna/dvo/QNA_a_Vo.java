package coty.admin.qna.dvo;

public class QNA_a_Vo {

	private String no;
	private String title;
	private String content_a;
	private String content_q;
	private String enrollDate;
	private String deleteYn;
	private String writer;
	private String hit;
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
	public String getContent_a() {
		return content_a;
	}
	public void setContent_a(String content_a) {
		this.content_a = content_a;
	}
	public String getContent_q() {
		return content_q;
	}
	public void setContent_q(String content_q) {
		this.content_q = content_q;
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
	@Override
	public String toString() {
		return "QNA_a_Vo [no=" + no + ", title=" + title + ", content_a=" + content_a + ", content_q=" + content_q
				+ ", enrollDate=" + enrollDate + ", deleteYn=" + deleteYn + ", writer=" + writer + ", hit=" + hit + "]";
	}
	public QNA_a_Vo(String no, String title, String content_a, String content_q, String enrollDate, String deleteYn,
			String writer, String hit) {
		super();
		this.no = no;
		this.title = title;
		this.content_a = content_a;
		this.content_q = content_q;
		this.enrollDate = enrollDate;
		this.deleteYn = deleteYn;
		this.writer = writer;
		this.hit = hit;
	}
	public QNA_a_Vo() {
	}
	
	
}
