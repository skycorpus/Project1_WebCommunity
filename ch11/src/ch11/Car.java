package ch11;

public interface Car {
	void print();
}

class Bus implements Car {
	public void print() {
		System.out.println("난 버스야");
	}
	void move() {
		System.out.println("정원이 40명입니다.");
	}
}

class FireEngine implements Car {
	public void print() {
		System.out.println("난 자동차야");
	}
}

class Ambulance implements Car {
	public void print() {
		System.out.println("난 앰뷸런스야");
	}
}

//인터페이스를 구현하지 않은 Taxi 클래스. 
class Taxi {
	public void print() {
		System.out.println("난 택시야");
	}
}
