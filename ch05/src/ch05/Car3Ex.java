package ch05;

class Car3 {
	String color; String kind; int displacement;
	//생성자가 하나도 없으면 compiler가 자동으로 기본 생성자를 만들어준다.
	//하나의 클래스 안에 생성자가 여러 개 있는 경우를 생성자 overloading이라고 한다.
	Car3() { //기본(default) 생성자, 매개변수가 없는 메서드
	}
	Car3(String c) {
		color = c; //매개변수로 변수값을 초기화
	}
	Car3(String c, String k){
		color = c; kind = k;
	}
	Car3(String c, String k,int d){
		color = c; kind = k; displacement = d;
	}
	void prn() {
		System.out.println("색깔 : "+color);
		System.out.println("종류 : "+kind);
		System.out.println("배기량 : "+displacement);
		System.out.println("==================");
	}
}

public class Car3Ex {
	public static void main(String[] args) {
		Car3 c1 = new Car3();
		c1.color="빨강"; c1.kind="벤츠"; c1.displacement=1500;
		Car3 c2 = new Car3("노랑"); c2.kind="소나타"; c2.displacement=2000;
		Car3 c3 = new Car3("파랑", "말두타"); c3.displacement=2500;
		Car3 c4 = new Car3("하양", "BMW", 3000);
		c1.prn(); c2.prn(); c3.prn(); c4.prn();
	}
}
