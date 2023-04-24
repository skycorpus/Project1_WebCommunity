package com.saeyan.javabeans;

public class MemberBean {
	private String name;
	private String userid;
	
	//1. getter and setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	//2. 매개변수가 있는 생성자
	public MemberBean(String name, String userid) {
		super();
		this.name = name;
		this.userid = userid;
	}
	
	//3. 매개변수가 없는 생성자
	//매개변수가 있는 생성자를 만들면 매개변수 없는 디폴트 생성자가 사라져기 때문에 추가해준다.
	public MemberBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//4. 오버라이딩
	//자바 빈 객체에 저장된 필드 값에 접근해 사용하는 레퍼런스 변수만 기술해도 출력될 수 있도록 하기 위해 toString() 메소드를 오버라이딩 해준다.
	@Override
	public String toString() {
		return "MemberBean [name=" + name + ", userid=" + userid + "]";
	}
}
