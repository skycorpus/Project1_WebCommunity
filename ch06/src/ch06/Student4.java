package ch06;

public class Student4 {
	private String name;
	private int age;
	private String sno;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public String getSno() {return sno;}
	public void setSno(String sno) {this.sno = sno;}
	
	void printAll() {
		System.out.println("===========");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("학번 : "+sno);
	}
}
