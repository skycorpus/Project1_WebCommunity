package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import oracle.net.aso.e;

/**
 * Servlet implementation class MultiuploadServlet
 */
@WebServlet("/upload2.do")
public class MultiuploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MultiuploadServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out=response.getWriter();
		String savePath="upload";//서버측 파일 저장 경로
		int uploadFileSizeLimit=5*1024*1024;//파일 크기 5MB로 제한
		String encType="UTF-8";
		
		ServletContext context = getServletContext();
		String uploadFilePath = context.getRealPath(savePath);
		
		try {
			MultipartRequest multi = new MultipartRequest(
				request,//리퀘스트 객체
				uploadFilePath,//서버상의 실제 디렉토리
				uploadFileSizeLimit,//최대 업로드 파일 크기
				encType,//인코딩 방법
				new DefaultFileRenamePolicy()//동일 파일이 존재시 일련 번호를 추가하여 저장.
			);
			Enumeration files = multi.getFileNames();
			while(files.hasMoreElements()) {
				String file = (String)files.nextElement();
				String fileName=multi.getFilesystemName(file);
				String ori_file_name=multi.getOriginalFileName(file);
				out.print("<br>업로드된 파일명 : "+fileName);
				out.print("<br>원본 파일명 : "+ori_file_name);
				out.print("<hr>");
			}
		}catch(Exception e) {
			System.out.print("예외 발생 : "+e);
		}	
	}

}
