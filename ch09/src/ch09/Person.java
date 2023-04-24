package ch09;

public class Person {
	String name;
	int juminNo;
	public Person(String name, int juminNo) {
		this.name = name; this.juminNo = juminNo;
	}
	
	@Override //주민번호만 같으면 같다고 기준을 정함.
	public boolean equals(Object obj) {//equals => (Object 명령어)같다는 기준을 정할 때 사용
		//기본형은 ==같다.
		//참조형 데이터는 equals (같다)
		//return juminNo==((Person)obj).juminNo;
		return name.equals(((Person)obj).name);
	}
	
	//객체를 출력할 형태를 지정
	public String toString() {
		return "인간[이름:"+name+", 주민번호:"+juminNo+"]";
	}
}
