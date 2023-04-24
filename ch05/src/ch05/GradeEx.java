package ch05;

class Grade{
	//변수에 값을 전달받지 못하면 현재 초기화된 값 사용
	int kor = 60, eng = 60, math = 60;
	void total() {
		int tot = kor + eng + math;
		System.out.println("총점 : " + tot);
		System.out.println("=============");
	}
	void prn() {
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
	}
}

public class GradeEx {
	public static void main(String[] args) {
		Grade g1 = new Grade();
		g1.eng = 99; g1.math = 77;
		Grade g2 = new Grade();
		g2.kor = 90; g2.math = 80;
		g1.prn(); g1.total();
		g2.prn(); g2.total();
	}
}
