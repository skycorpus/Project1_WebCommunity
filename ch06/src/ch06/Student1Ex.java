package ch06;

public class Student1Ex {
	public static void main(String[] args) {
		Student1 st1 = new Student1();
		st1.name="홍길동"; st1.kor=100; st1.eng=60; st1.math=76;
		System.out.println("이름 : "+st1.name);
		System.out.println("총점 : "+st1.getTotal());
		System.out.println("평균 : "+st1.getAverage());
		
		Student1 st2 = new Student1("뉴진스", 77, 88, 91);
		System.out.println("이름 : "+st2.name);
		System.out.println("총점 : "+st2.getTotal());
		System.out.println("평균 : "+st2.getAverage());
		st1.prn(); st2.prn();
	}
}
