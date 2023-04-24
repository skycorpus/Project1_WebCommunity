package ch07;

class F1{
	int x = 7;
	void disp() {
		System.out.println("난 부모 메서드야");
	}
}

class F2 extends F1{
	int x = 8;
	void disp() {
		System.out.println("난 자식 메서드야");
	}
	void print() { //이름이 중복되면 가까운 이름을 사용함. (이름 : 변수 혹은 함수 명) 
		//super를 붙이면 부모클래스에 있는 이름 사용.
		System.out.println("x = "+super.x);
		super.disp();
		System.out.println("x = "+x);
		disp();
	}
}

public class Super2 {
	public static void main(String[] args) {
		F2 f = new F2();
		f.print();
	}
}
