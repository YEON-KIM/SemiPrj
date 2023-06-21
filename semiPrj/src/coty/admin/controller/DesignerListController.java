package coty.admin.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import coty.admin.adminVo.DesignerAttachmentVo;
import coty.admin.adminVo.DesignerVo;
import coty.designer.service.DesignerListService;
import coty.designer.service.DesignerService;
import coty.util.PageVo;


@MultipartConfig(
		maxFileSize = 1024 * 1024 * 50 ,		//파일 하나당 크기
		maxRequestSize = 1024 * 1024 * 50 * 10	//리퀘스트 총 크기
	)
@WebServlet("/admin/designerList")
public class DesignerListController extends HttpServlet{
	 //디자이너 계정 목록 화면
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		DesignerListService dls = new DesignerListService();
		
		try {
		//데이터 꺼내기 (페이징 처리를 위한 데이터 준비)
		String pageParam =req.getParameter("page"); 
        int currentPage = (pageParam != null) ? Integer.parseInt(pageParam) : 1;
//		int currentPage = Integer.parseInt(req.getParameter("page"));
		int listCount = dls.selectCount();//전체글 갯수 구하기
		int pageLimit = 5; //한페이지에 몇페이징씩 할건지
		int boardLimit = 5; //한페이지에 몇개의 글 보여줄건지 
		
		//데이터 뭉치기
		PageVo pageVo = new PageVo(listCount, currentPage, pageLimit, boardLimit);
				
		//서비스 호출
		 List<DesignerVo> designerList = dls.selectDesignerList(pageVo); //페이징관련정보
		
		//화면
		req.setAttribute("designerList", designerList);
		req.setAttribute("pageVo", pageVo);
		req.getRequestDispatcher("/WEB-INF/views/admin/designerList.jsp").forward(req, resp);
		} catch (Exception e) {
			System.out.println("[ERROR] 디자이너 목록 조회 중 예외 발생...");
			e.printStackTrace();
		}
		
		
	}
	
	
	
	 //디자이너 계정 등록 
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		DesignerService deservice = new DesignerService();
		int result = 0;
		try {
		//데이터 꺼내기
		String deId = req.getParameter("deId");
		String dePwd = req.getParameter("dePwd");
		String deName = req.getParameter("deName");
		String deTel = req.getParameter("deTel");
		String deEmail = req.getParameter("deEmail");
		String deShop = req.getParameter("shop");
		String deNick = req.getParameter("deNick");
		
		//파일객체 얻기
		Part f = req.getPart("f"); //f안에 파일들이 들어있음.
//						System.out.println(f.getSubmittedFileName()); //전송한 파일의 이름을 가져옴 zzz.png
		
		//파일서버에 저장
		InputStream fis = f.getInputStream(); //읽는 통로 만들기
		
		String path = req.getServletContext().getRealPath("/resources/image/"); 
		String originfileName = f.getSubmittedFileName(); //zzz.png
		String ext = originfileName.substring(originfileName.lastIndexOf("."));
		
		String fileName = UUID.randomUUID().toString();
		File target = new File(path + fileName + ext); //목표로 하는 파일객체 만들기
		FileOutputStream fos = new FileOutputStream(target); //목표로하는 파일객체 내보내는 통로에 저장!
		
		
		//Read, Write
		byte[] buf = new byte[1024]; //바구니
		int size=0;
		while((size = fis.read(buf)) != -1) {  
			fos.write(buf , 0 , size); //0부터 size까지 읽은 데이터 내보내기
		}
		
		//자원반납
		fis.close();
		fos.close();
		
		//서버에 저장 끝
		
 		// 데이터 뭉치기
 		DesignerVo deVo = new DesignerVo();
 		deVo.setId(deId);
 		deVo.setPwd(dePwd);
 		deVo.setName(deName);
 		deVo.setPhone(deTel);
 		deVo.setEmail(deEmail);
 		deVo.setShop(deShop);
 		deVo.setNick(deNick);
 		
 		//파일 정보 디비에 인서트 시작  (원본명, 변경된 이름)
 		DesignerAttachmentVo atVo = new DesignerAttachmentVo();
 		atVo.setOriginName(originfileName);
 		atVo.setChangeName(fileName + ext);

 		// 서비스 실행
 		result = deservice.createDesigner(deVo ,atVo);
 		
		
 		// 화면(view)
 		if(result == 1) {
 			req.getSession().setAttribute("alertMsg", "디자이너 계정 생성이 완료되었습니다!");
 			resp.sendRedirect("/admin/designerList");
 			}
 		
 		} catch (Exception e) {
 			System.out.println("[ERROR] 디자이너 계정 생성 중 예외 발생...");
 			e.printStackTrace();
 		}
	
		
	}
}
