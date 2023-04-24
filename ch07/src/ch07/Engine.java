package ch07;

//클래스간의 관계
//composite 관계
public class Engine {
	private int displacement;
	private String type;
	Engine(){}
	Engine(int displacement, String type){
		this.displacement = displacement; this.type = type;
	}
	void print() {
		System.out.println("=============");
		System.out.println("배기량 : " + displacement);
		System.out.println("엔진타입 : " + type);
	}
}
