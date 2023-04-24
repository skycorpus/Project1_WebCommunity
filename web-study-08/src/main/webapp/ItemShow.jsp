<%@page import="java.sql.DriverManager" %>
<%@page import="java.sql.ResultSet" %>
<%@page import="java.sql.Statement" %>
<%@page import="java.sql.Connection" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	request.setCharacterEncoding("UTF-8");
%>
<%!
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	                                      //디폴트 포트번호 1521
	String url="jdbc:oracle:thin:@localhost:1521:XE"; //오라클 로컬 url
	String uid="scott";
	String pass="tiger";
	String sql="select * from item";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>입력완료된 정보</h2>
<table border="1">
<tr>
	<th>Name</th><th>Price</th><th>description</th>
</tr>
</table>
<%
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	conn = DriverManager.getConnection(url,uid,pass);
	stmt = conn.createStatement();
	rs = stmt.executeQuery(sql);
	while(rs.next()) {
		out.println("<tr>");
		out.println("<td>"+rs.getString("name")+"</td>");
		out.println("<td>"+rs.getString("price")+"</td>");
		out.println("<td>"+rs.getString("description")+"</td>");
		out.println("</tr>");
	}
} catch(Exception e){
	e.printStackTrace();
} finally {
	try {
		if(stmt != null) stmt.close();
		if(conn != null) conn.close();
	} catch(Exception e) {
		e.printStackTrace();
	}
}
%>
</body>
</html>