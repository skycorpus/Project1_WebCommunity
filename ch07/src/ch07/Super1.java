package ch07;

class E1{
	//기본 생성자는 생성자가 하나도 없으면 컴파일할 때 만들어준다. 
	//하나라도 생성자가 있으면 default 생성자가 생성되지 않는다.
	
	E1(){ //해결방법1 - 기본생성자
		System.out.println("기본생성자");}
	
	//해결방법2 - 인수가 있는 생성자를 없애면 에러 안난다.  
	  E1(int k){ System.out.println("난 매개변수가 하나인 생성자 : " + k); }
	  
	
	void m1() {
		System.out.println("대박 사건");
	}
}

class E2 extends E1 {
	//특별한 것이 없으면 부모의 default 생성자를 통하여 생성
	E2(int k){
		super(k); //기본생성자가 아닌 매개변수 1개인 생성자로 부모가 생성된 후에 자식이 생성된다.
		System.out.println("안녕");
	}
	void m2() {
		System.out.println("쪽박 사건");
	}
}

public class Super1 {
	public static void main(String[] args) {
		E2 e = new E2(7);
		e.m1(); e.m2();
	}
}
