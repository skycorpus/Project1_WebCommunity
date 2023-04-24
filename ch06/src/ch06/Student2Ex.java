package ch06;

public class Student2Ex {
	public static void main(String[] args) {
		Student2 st1 = new Student2("하니", 88, 99, 66);
		Student2 st2 = new Student2("로제", 77, 88, 55);
		Student2 st3 = new Student2("보검", 92, 56, 88);
		
		st1.prn(); st2.prn(); st3.prn();
	}
}
