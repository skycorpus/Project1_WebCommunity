/**
 * 
 */
function check() {
	if(document.frm.id.value==""){
		alert("아이디를 입력하세요.");
		document.frm.id.focus(); //아이디 입력하라고 포커스도 옮겨줌.
		return false;
	} else if(document.frm.age.value=="") {
		alert("나이를 입력하세요.");
		document.frm.age.focus();
		return false;
	} else if(isNaN(document.frm.age.value)) {
		alert("숫자를 입력하세요.");
		document.frm.age.focus();
		return false;
	} else {
		return true;
	}
}