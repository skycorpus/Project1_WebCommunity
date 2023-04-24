package ch07;

public class Person {
	private String name;
	private int age;
	
	public Person() {	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	void print() {
		System.out.println("================");
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}	
