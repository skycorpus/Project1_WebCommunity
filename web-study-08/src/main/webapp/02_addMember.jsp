<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.Connection" %>
<%@page import="java.sql.PreparedStatement" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%! 
	Connection conn=null;
	PreparedStatement pstmt=null;
	
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String uid="scott";
	String pass="tiger";
	
	String sql = "insert into member values(?, ?, ?, ?, ?, ?)";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
request.setCharacterEncoding("UTF-8");

String name = request.getParameter("name");
String userid = request.getParameter("userid");
String pwd = request.getParameter("pwd");
String email = request.getParameter("email");
String phone = request.getParameter("phone");
String admin = request.getParameter("admin");

try{
	Class.forName("oracle.jdbc.driver.OracleDriver"); //JDBC 드라이버 로드
	conn = DriverManager.getConnection(url, uid, pass); //DB 연결 객체인 Connection 생성
	pstmt = conn.prepareStatement(sql); //prepareStatement 객체 생성
	pstmt.setString(1, name); // 바인딩 변수 채우기
	pstmt.setString(2, userid);
	pstmt.setString(3, pwd);
	pstmt.setString(4, email);
	pstmt.setString(5, phone);
	pstmt.setInt(6, Integer.parseInt(admin));
	
	pstmt.executeUpdate();
} catch(Exception e) {
	e.printStackTrace();
} finally {
	try { //사용한 리소스 예제
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
	} catch(Exception e) {
		e.printStackTrace();
	}
} //finally 끝
%>
<h3> 회원 가입 성공 </h3>
<a href="01_allMember.jsp"> 회원 전체 목록 보기 </a>
</body>
</html>