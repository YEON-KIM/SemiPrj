package coty.communication.vo;

public class ReviewAttachmentVo {

	private String no;
	private String originName;
	private String changeName;
	private String refReviewNo;
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getOriginName() {
		return originName;
	}
	public void setOriginName(String originName) {
		this.originName = originName;
	}
	public String getChangeName() {
		return changeName;
	}
	public void setChangeName(String changeName) {
		this.changeName = changeName;
	}
	public String getRefBoardNo() {
		return refReviewNo;
	}
	public void setRefBoardNo(String refBoardNo) {
		this.refReviewNo = refBoardNo;
	}
	@Override
	public String toString() {
		return "AttachmentVo [no=" + no + ", originName=" + originName + ", changeName=" + changeName + ", refBoardNo="
				+ refReviewNo + "]";
	}
	public ReviewAttachmentVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReviewAttachmentVo(String no, String originName, String changeName, String refReviewNo) {
		super();
		this.no = no;
		this.originName = originName;
		this.changeName = changeName;
		this.refReviewNo = refReviewNo;
	}
	
	
}
