package ch08;

public abstract class Car {
	abstract void drive();
}

class FireEngine extends Car{
	void drive() {
		System.out.println("물을 싣고 달린다.");
	}
	void fire() {
		System.out.println("불을 끈다.");
	}
}

class Bus extends Car{
	void drive() {
		System.out.println("승객 40명을 싣고 달린다.");
	}
}

class Taxi extends Car{
	void drive() {
		System.out.println("총알처럼 달린다.");
	}
}
