package ch06;

class B2{
	void m1(int a, int b) { //전달한 것은 x = 10, y = 20
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("=============");
		//a와 b값을 서로 교환해서 출력
		//Call By Value 메서드에서 변경되 결과는 원본 데이터에 영향이 없다.
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}

public class CallByValue2 {
	public static void main(String[] args) {
		B2 a1 = new B2();
		int x = 10, y = 20; //데이터가 기본형인 경우 a1.m1(10, 20)
		a1.m1(x,  y); //값 10, 20을 전달한 것이지 변수 x, y를 전달한 것이 아님.
		System.out.println("main x = "+x);
		System.out.println("main y = "+y);
	}
}
