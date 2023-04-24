package ch05;

public class Car1 { //클래스 헤더, 선언부
	String color;   //(멤버)변수, 필드, 속성
	int displacement;
	String name;
	
	void speedUp() {//메서드 헤더, 선언부
		System.out.println("속도를 내고 달린다.");//메서드 구현부
	}
	
	void stop() {
		System.out.println("차를 멈춘다.");
	}
}
