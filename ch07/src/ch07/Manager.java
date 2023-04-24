package ch07;

public class Manager extends Person{
	private String part;
	public Manager(String name, int age, String part) {
		setName(name); setAge(age); this.part = part;
	}
	void printMg() {
		print();
		System.out.println("담당 : " + part);
	}
}
