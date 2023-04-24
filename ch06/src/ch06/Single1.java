package ch06;

//Singleton, Design Pattern
public class Single1 {
	//static 붙으면 함수가 여러 번 실행되어도, 변수의 초기화는 클래스가 로딩할 때 1번 실행됨. 
	//static이 없으면 함수 실행할 때 마다 매번 실행.
	static Single1 instance = new Single1();
	Single1(){ //private을 사용하면 외부에서 객체를 생성 못 함.
	}
	//처음에 생성된 instance를 같이 사용함.
	//객체를 생성할 때는 instance를 사용.
	public static Single1 getInstance() {
		return instance;
	}
}
