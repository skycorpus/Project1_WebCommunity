package ch07;

public class OuterEx {
	//GUI Graphic User Interface 화면에서 주로 사용
	//최근에는 웹으로 화면을 구현하기 때문에 자바에서는 거의 사용하지 않음.
	public static void main(String[] args) {
		Outer out = new Outer(100, 200);       //중첩클래스 생성
		Outer.Inner inner1 = out.new Inner(); //방법1
		Outer.Inner inner2 = out.getInner(); //방법2
		//Outer.Inner inner3 = new Outer.Inner(); //(static에서만 가능한 방법)
		
		System.out.println(inner1.capacity());
		System.out.println(inner2.capacity());
	}
}
