package ch07;

class C1{
	String s1 = "부모 멤버변수";
	//생성자는 main 함수에서 호출하지 않아도 출력됨.
	C1() { //생성자는 부모부터 생성된 후에 자식이 생성됨. 상속은 아님.
		System.out.println("난 부모 생성자"); 
	}
	void m1() {
		System.out.println("부모 메서드");
	}
}

class C2 extends C1{
	String s2 = "자식 멤버변수";
	C2() { //생성자는 호출하지 않아도 출력됨.
		System.out.println("난 자식 생성자");
	}
	void m2() {
		System.out.println("자식 메서드");
	}
}

public class Inher3 {
	public static void main(String[] args) {
		C2 c = new C2();
		System.out.println("s1 = "+c.s1);
		System.out.println("s2 = "+c.s2);
		c.m1(); c.m2();
	}
}
