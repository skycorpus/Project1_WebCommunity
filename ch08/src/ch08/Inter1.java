package ch08;

interface A1{ 	 //객체를 생성할 수 없음
	int K = 7;   // public static final 생략, 값 변경불가
	void m1();   // public abstract 생략, 구현부가 없음
	void m2();
}

class A2 implements A1{ //인터페이스를 사용하기 위해서는 implements 구현한 클래스로 사용
	public void m1() {
		System.out.println("대박");
	}

	public void m2() {
		System.out.println("헐~");
	} 
}

public class Inter1 {
	public static void main(String[] args) {
		A1 a1 = new A2(); //생성은 안되지만 선언은 가능
		A2 a2 = new A2();
		a1.m1(); a1.m2(); a2.m1(); a2.m2();
		//a1.K=88; //final이므로 수정불가
		System.out.println("K = "+A1.K); //K=7
		System.out.println("K = "+a1.K); //K=7
	}
}

