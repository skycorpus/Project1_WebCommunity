<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<style type="text/css">
	label {
		width:160px;
		display: inline-block;
		float:left;
	}

</style>
<script type="text/javascript">
	function check_ok(){
		if(document.frm.name.value.length==0) {//이름의 길이가 0
			alert("이름을 써주세요.");
			frm.name.focus();
			return false;
		}
		if(document.frm.jumin_1.value.length !=6){//주민번호앞자리가 6자리가 아니면
			alert("주민번호 앞자리를 정확히 입력해주세요.");
			frm.jumin_1.focus();
			return false;
		}
		if(document.frm.jumin_2.value.length !=7){//주민번호뒷자리가 7자리가 아니면
			alert("주민번호 뒷자리를 정확히 입력해주세요.");
			frm.jumin_2.focus();
			return false;
		}
		if(document.frm.id.value.length < 4){//아이디가 3자리 이하면
			alert("아이디는 4글자 이상이어야 합니다.");
			frm.id.focus();
			return false;
		}
		if(document.frm.pwd.value==""){//패스워드를 입력 안했으면
			alert("패스워드는 반드시 입력해주세요.");
			frm.pwd.focus();
			return false;
		}
		if(document.frm.pwd.value!=document.frm.pwd_re.value){//두 패스워드가 일치하지 않으면
			alert("패스워드가 일치하지 않습니다.");
			frm.pwd_re.focus();
			return false;
		}
		return true;
	}
	function setEmail(){
		var emaildns=document.frm.emailaddr;//select 태그를 emaildns 변수에 저장
		document.frm.email_dns.value=emaildns.options[emaildns.selectedIndex].value;
		//선택이 일어난 option항목의 value 값을 이름이 email_dns인 input 태그의 값으로 설정 
	}

</script>
</head>
<body>
	<form name="frm" action="JoinServlet">
		<label for="name">이름 </label><span style="color:red;"> * </span>
		<input type="text" name="name"><br>
		
		<label>주민등록번호 </label><span style="color:red;"> * </span>
		<input type="text" name="jumin_1">-<input type="password" name="jumin_2"><br>		
		
		<label for="id">아이디 </label><span style="color:red;"> * </span>
		<input type="text" name="id"><br>
		
		<label for="pwd">비밀번호 </label><span style="color:red;"> * </span>
		<input type="password" name="pwd"><br>		

		<label for="pwd_re">비밀번호 확인</label><span style="color:red;"> * </span>
		<input type="password" name="pwd_re"><br>

		<label for="email">이메일</label> &nbsp;
		<input type="text" name="email">@<input type="text" name="email_dns">
		<select name="emailaddr" onchange="setEmail()">
			<option value="" selected="selected">직접입력</option>
			<option value="daum.net">daum.net</option>
			<option value="gmail.com">gmail.com</option>
			<option value="naver.com">naver.com</option>
			<option value="hotmail.com">hotmail.com</option>
		</select><br>
    <label for="zip">우편번호</label> &nbsp;
    <input type="text" name="zip"><br>
           
    <label for="addr1">주소</label> &nbsp;
    <input type="text" name="addr1">
    <input type="text" name="addr2"><br>
    
    <label for="phone">핸드폰번호</label>  &nbsp;
    <input type="tel" name="phone"><br>
    
    <label for="job">직업</label>  &nbsp;
    <select id="job" name="job" size="3">  
       <option value="학생">학생</option> 
       <option value="컴퓨터/인터넷">컴퓨터/인터넷</option> 
       <option value="언론">언론</option> 
       <option value="공무원">공무원</option> 
       <option value="군인">군인</option> 
       <option value="서비스업">서비스업</option> 
       <option value="교육">교육</option> 
    </select><br>
    
    <label for="chk_mail">메일/SMS 정보 수신</label>  &nbsp;
    <input type="radio" name="chk_mail" checked> 수신 
    <input type="radio" name="chk_mail"> 수신거부<br>

    <label for="interest">관심분야</label>  &nbsp;
      <input type="checkbox" name="interest" value="생두"> 생두         
      <input type="checkbox" name="interest" value="원두"> 원두         
      <input type="checkbox" name="interest" value="로스팅"> 로스팅         
      <input type="checkbox" name="interest" value="핸드드립"> 핸드드립         
      <input type="checkbox" name="interest" value="에스프레소"> 에스프레소         
      <input type="checkbox" name="interest" value="창업"> 창업<br><br>
    
	<div id="button">
	   <input type="submit" value="회원가입" onclick="return check_ok()">
	   <input type="reset" value="취소">
	</div>	
	</form>
	
</body>
</html>