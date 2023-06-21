package coty.admin.notice.page;

public class N_pageVo {
	
	 private int  listCount; 		//게시글 총 갯수
	 private int  currentPage;	//현재 페이지
	 private int  pageLimit;		//페이징 영역에 보여줄 페이지 최대갯수
	 private int  boardLimit;		//한 페이지에 보여줄 게시글 최대갯수
	 private int  maxPage;		//마지막 페이지 (==총페이지 수)
	 private int  startPage;		//페이징 영역 시작 값
	 private   int  endPage;		//페이징 영역 마지막 값
	 
	 
	 public N_pageVo(int listCount, int currentPage, int pageLimit, int boardLimit){
		 
		 this.listCount = listCount;
		 this.currentPage = currentPage;
		 this.pageLimit = pageLimit;
		 this.boardLimit = boardLimit;
		 
		 this.maxPage = (int)Math.ceil((double)listCount/ boardLimit);
		 this.startPage = (currentPage -1)/pageLimit * pageLimit +1;
		 if(endPage>maxPage){
			 endPage = maxPage;
		 }
	 }		 
	 
	 
	 
	public int getListCount() {
		return listCount;
	}
	public void setListCount(int listCount) {
		this.listCount = listCount;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageLimit() {
		return pageLimit;
	}
	public void setPageLimit(int pageLimit) {
		this.pageLimit = pageLimit;
	}
	public int getBoardLimit() {
		return boardLimit;
	}
	public void setBoardLimit(int boardLimit) {
		this.boardLimit = boardLimit;
	}
	public int getMaxPage() {
		return maxPage;
	}
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	 
	 
	 

}
