package ch16;

public class Member {
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	
	private String name;
	private int gender;
	private int age;
	public Member(String name, int age, int gender) {
		this.name = name; this.age = age; this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getGender() {
		return gender;
	}
}
