package ch06;

public class Person {
	private String name; //private 정보은닉 
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void getAge(int age) {
		this.age = age;
	}

	public void setAge(int age) {
		if(age<0) {
			System.out.println("나이는 0보다 작을 수 없어요.");
			this.age = 0;
		} else this.age = age;
	}
	
	void print() {
		System.out.println("==============");
		System.out.println("이름 "+getName());
		System.out.println("나이 "+getAge());
	}
}
