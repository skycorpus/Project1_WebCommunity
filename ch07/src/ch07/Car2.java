package ch07;

public class Car2 {
	private Engine eg;     //포함 : 다른 클래스(객체)를 멤버변수/매개변수로 사용
	private String color;   
	Car2(){	}
	Car2(Engine eg, String color){
		this.eg = eg; this.color = color;
	}
	
	void print() {
		eg.print();
		System.out.println("칼라 : " + color);
	}
}
