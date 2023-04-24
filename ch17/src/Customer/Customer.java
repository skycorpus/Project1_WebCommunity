package Customer;

import java.sql.Date; //년월일만 나오게 해줌.

public class Customer { //DTO (Data Transfer Object), VO (Value Object)
	private String id;
	private String pass;
	private String email;
	private String name;
	private Date reg_date;
	
	public Customer() {}
	public Customer(String id, String pass, String email, String name) {
		this.id=id; this.pass=pass; this.email=email; this.name=name;
	}
	public String toString() { 
		//toString 재정의 : 객체를 출력할 때 문자열로 출력, 없으면 패키지명.클래스명@해시코드
		return "아이디: "+id+", 암호: "+pass+", 이메일: "+email+", 이름: "+name+", 가입일 : "+reg_date;
	}
	
	public String getId() {	return id;	}
	public void setId(String id) {	this.id = id;	}
	public String getPass() {	return pass;	}
	public void setPass(String pass) {	this.pass = pass;	}
	public String getEmail() {	return email;	}
	public void setEmail(String email) {	this.email = email;	}
	public String getName() {	return name;	}
	public void setName(String name) {	this.name = name;	}
	public Date getReg_date() {	return reg_date;	}
	public void setReg_date(Date reg_date) {this.reg_date = reg_date;}
}
