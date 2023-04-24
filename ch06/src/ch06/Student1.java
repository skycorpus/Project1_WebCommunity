package ch06;

public class Student1 {
	String name;
	int kor;
	int eng;
	int math;
	public Student1() {}
	public Student1(String n, int k, int e, int m) {
		name = n; kor = k; eng = e; math = m;
	}
	int getTotal() {
		return kor+eng+math;
	}
	float getAverage() {
		return getTotal() / (float)3;
	}
	void prn() {
		System.out.println("====================");
		System.out.println("이름 : "+name);
		System.out.println("총점 : "+getTotal());
		System.out.println("평균 : "+getAverage());
	}
}
