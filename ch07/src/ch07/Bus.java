package ch07;

public class Bus extends Car{
	public Bus(String kind, int inwon) {
		setKind(kind); setInwon(inwon);
	}
	void printBus() {
		print();
		System.out.println("승객을 40명 이상 태울 수 있다.");
	}
}
