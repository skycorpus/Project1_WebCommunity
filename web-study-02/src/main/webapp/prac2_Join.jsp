<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join</title>
<style type="text/css">
label {
	width:160px;
	display: inline-block;
	float: left;
}
#button {
	text-align: center;
}
</style>
<script type="text/javascript">
	
	function setEmail() {
		
	}
	
	function fuc(emailaddr) {
	  document.frm.selectemailaddr.value  = emailaddr;
	  // 파라미터로 전달받은 셀렉트박스 속성값을 
	  // 텍스트 박스 속성값에 전달함
	}
	function check_ok() {
		if (document.reg_frm.name.value.length == 0) {
		alert("이름을 써주세요.");
		reg_frm.name.focus();
		return false;
	}
	
	if (document.reg_frm.jumin_1.value.length != 6) {
		alert("주민번호는 6글자 이상이어야 합니다.);
		reg_frm.jumun_1.focus();
		return false;
	}
	
	if (document.reg_frm.jumin_2.value.length != 7) {
		alert("주민번호는 7글자 이상이어야 합니다.);
		reg_frm.jumun_2.focus();
		return false;
	}
	
	if (document.reg_frm.id.value.length < 4) {
		alert("아이디는 4글자 이상이어야 합니다.");
		reg_frm.id.focus();
		return false;
	}
	
	if(document.reg_frm.pwd.value != document.reg_frm.pwd_re.value) {
		alert("패스워드는 반드시 입력해야 합니다.");
		reg_frm.pwd.focus();
		return false;
	}
	
	//비밀번호 확인 결과가 같은지 체크
	if (document.reg_frm.pwd.value != document.reg_frm.pwd_re.value) {
		alert("패스워드가 일치하지 않습니다.");
		reg_frm.pwd_re.focus();
		return false;
	}
	
	return true;
}	
</script>
</head>
<body>
	<form name="frm" id="reg_frm" action="JoinServlet">
		<table>
			<tr>
				<th><label for="name">이름</label></th>
				<td><span style="color:red;"> * </span><input type="text" id="name" name="name"></td>
			</tr>
			<tr>
				<th>주민등록번호</th>
				<td><span style="color:red;"> * </span>
				<input type="text" name="jumin_1"> - <input type="text" name="jumin_2"></td>
			</tr>
			<tr>
				<th><label for="id">아이디</label></th>
				<td><span style="color:red;"> * </span>
				<input type="text" id="id" name="id"></td>
			</tr>
			<tr>
				<th>비밀번호</th>
				<td><span style="color:red;"> * </span>
				<input type="password" id="pwd" name="pwd"></td>
			</tr>
			<tr>
				<th>비밀번호 확인</th>
				<td><span style="color:red;"> * </span>
				<input type="password" id="pwd_re" name="pwd_re"></td>
			</tr>
			<tr>
				<th>이메일</th>
				<td><input type="text" name="email"> @ 
					<input type="text" name="email_dns">
					<select name="emailaddr" onchange="func(this.value)">
					<option value="">직접입력</option>
					<option value="naver.com">naver.com</option>
					<option value="daum.net">daum.net</option>
					<option value="gmail.com">gmail.com</option>
					<option value="nate.com">nate.com</option>
					<option value="hanmail.net">hanmail.net</option>
					</select>
					<input type="text" name="selectemailaddr">
				</td>
			</tr>
			<tr>
				<th>우편번호</th>
				<td><input type="text" id="zip" name="zip"></td>
			</tr>
			<tr>
				<th>주소</th>
				<td><input type="text" id="addr1" name="addr1">
				<input type="text" id="addr2" name="addr2"><br></td>
			</tr>
			<tr>
				<th>핸드폰번호</th>
				<td><input type="tel" id="phone" name="phone"></td>
			</tr>
			<tr>
				<th>직업</th>
				<td>
				<select id="job" name="job" size="3">
					<option value="학생">학생</option>
					<option value="컴퓨터/인터넷">컴퓨터/인터넷</option>
					<option value="언론">언론</option>
					<option value="공무원">공무원</option>
					<option value="군인">군인</option>
					<option value="서비스업">서비스업</option>
					<option value="교육">교육</option>
				</select><br>
				</td>
			</tr>
			<tr>
				<th>메일/SMS정보 수신</th>
				<td><input type="radio" id="chk_mail" name="chk_mail" checked>수신
				<input type="radio" id="chk_mail" name="chk_mail">수신거부</td>
			</tr>
			<tr>
				<th>관심분야</th>
				<td>
				<input type="checkbox" id="interest" name="interest" value="생두">생두
				<input type="checkbox" id="interest" name="interest" value="원두">원두
				<input type="checkbox" id="interest" name="interest" value="로스팅">로스팅
				<input type="checkbox" id="interest" name="interest" value="핸드드립">핸드드립
				<input type="checkbox" id="interest" name="interest" value="에스프레소">에스프레소</td><br><br>
			</tr>
			<tr>
				<th></th>
				<td><input type="submit" value="회원가입" onclick="return check_ok()">
				<input type="reset" value="취소"></td>
			</tr>
		</table>
	</form>
</body>
</html>