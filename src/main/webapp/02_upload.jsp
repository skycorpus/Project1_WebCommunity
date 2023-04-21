<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="upload2.do" method="post" enctype="multipart/form-data">
파일 1. : <input type="file" name="uploadFile01"><br>
파일 2. : <input type="file" name="uploadFile02"><br>
파일 3. : <input type="file" name="uploadFile03"><br>
<input type="submit" value="전송">
</form>
</body>
</html>