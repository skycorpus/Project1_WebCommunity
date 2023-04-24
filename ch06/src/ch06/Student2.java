package ch06;

public class Student2 {
	String name;
	int kor; int eng; int math;
	
	public Student2() {}
	public Student2(String name, int kor, int eng, int math) {
		this.name = name; this.kor = kor; this.eng = eng; this.math = math;
	}
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return getTotal() / (float)3;
	}
	void prn() {
		System.out.println("===============");
		System.out.println("이름 : "+name);
		System.out.println("총점 : "+getTotal());
		System.out.println("평균 : "+getAverage());
	}
}
