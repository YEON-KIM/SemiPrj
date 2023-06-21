package coty.admin.adminVo;

public class DesignerAttachmentVo {
	private String no;
	private String originName;
	private String changeName;
	private String refDesignerNo;
	
	public DesignerAttachmentVo() {
	}
	
	public DesignerAttachmentVo(String no, String originName, String changeName, String refDesignerNo) {
		this.no = no;
		this.originName = originName;
		this.changeName = changeName;
		this.refDesignerNo = refDesignerNo;
	}
	@Override
	public String toString() {
		return "DesignerAttachmentVo [no=" + no + ", originName=" + originName + ", changeName=" + changeName
				+ ", refDesignerNo=" + refDesignerNo + "]";
	}
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
	public String getRefDesignerNo() {
		return refDesignerNo;
	}
	public void setRefDesignerNo(String refDesignerNo) {
		this.refDesignerNo = refDesignerNo;
	}
	
	
}
