package ch05;

import magic.Plus; //import 다른패키지의 class 사용.

public class PlusEx {
	public static void main(String[] args) {
		//magic.Plus p1 = new magic.Plus(); //import 안하면 앞에 패키지명 입력
		Plus p1 = new Plus();
		p1.x = 10; p1.y = 20;
		p1.add();
	}
}

