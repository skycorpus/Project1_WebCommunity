package ch15;

@FunctionalInterface //함수적 인터페이스인지 확인해줌.
interface MyFunction1 {
	public void method1(); //함수적 인터페이스는 추상메서드 단 하나만 존재한다.
}

// 방법(1) implements 사용해 클래스로 구현.
class MyFunction1Class implements MyFunction1 {
	public void method1() {
		System.out.println("난 재정의한 함수");
	}
}

public class Lambda1Ex {
	public static void main(String[] args) {
		MyFunction1 mf1 = new MyFunction1Class();
		mf1.method1();
		
		//방법(2) 클래스명 Lambda1Ex$1 : 익명 클래스
		mf1 = new MyFunction1() {
			public void method1() {	System.out.println("난 인터페이스를 직접 재정의했어.");
			}
		};
		mf1.method1();
		
		//방법(3) 람다를 이용하는 방법. 짧게 구현가능. 가장 최신방법.
		//함수적 인터페이스는 람다를 이용해 재정의 가능.
		mf1 = () -> { System.out.println("난 람다로 처리한 메서드"); };
		mf1.method1();
	}
}
