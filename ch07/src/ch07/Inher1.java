package ch07;

class A1{
	int a1 =1;
	public void m1() {
		System.out.println("난 부모 메서드");
	}
}

//상속 클래스
class A2 extends A1 { //A2가 A1을 상속 //A2클래스에 없는 a1변수, m1()메서드를 A2것으로 사용
	int a2 = 2;
	void m2() {
		System.out.println("난 자식 메서드");
	}
}

public class Inher1 {
	public static void main(String[] args) {
		A2 a2 = new A2();
		System.out.println("a1 = " + a2.a1);
		System.out.println("a2 = " + a2.a2);
		a2.m1(); a2.m2();
	}
}
