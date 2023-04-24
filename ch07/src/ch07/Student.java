package ch07;

public class Student extends Person {
	private String sno;
	public Student(String name, int age, String sno) {
		setName(name); setAge(age); this.sno = sno;
	}
	
	void printSt() {
		print();
		System.out.println("학번 : " + sno);
	}
}
