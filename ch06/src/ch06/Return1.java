package ch06;

//return 예제
class A2{
	//void 리턴이 비어있음. 반환할 것이 없다.
	void add(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x+y);
	}
	//int 반환할 값이 정수이다.
	int minus(int x, int y) {
		return x - y;
	}
	//String 반환할 값이 문자열
	String hello(String name) { //String hello();
		return "안녕하세요," + name + "님.";
	}
}

public class Return1 {
	public static void main(String[] args) {
		String[] names = {"김연아", "제니", "보검", "은우", "로제"};
		A2 a2 = new A2();
		int x = 56; int y = 65;
		a2.add(x,  y);
		//System.out.println(a2.minus(x, y));
		int k = a2.minus(x,  y);
		System.out.println(k);
		
		for(String name : names) {//String hello(); 호출
			System.out.println(a2.hello(name));
		}
	}
}
