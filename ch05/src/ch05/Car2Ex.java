package ch05;

class Car2{
	static String color; //static 공동으로 사용 가능, 클래스 변수, 로딩할 때 실행
	static String kind; //static 공동으로 사용 가능, 클래스 변수, 로딩할 때 실행
	int displacement; //객체를 생성해야 사용 가능, 인스턴스 변수
	void prn() {
		System.out.println("색깔 : " + color);
		System.out.println("종류 : " + kind);
		System.out.println("배기량 : " + displacement);
		System.out.println("=========================");
	}
}

public class Car2Ex {
	public static void main(String[] args) {
		Car2.color = "핑크";
		Car2 c1 = new Car2(); Car2 c2 = new Car2();
		//c1.color = "빨강"; 
		c1.displacement = 1500; c1.kind = "벤츠";
		c2.displacement = 2000;
		c1.prn();
		c2.prn();
	}
}