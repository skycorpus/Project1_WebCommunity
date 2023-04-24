package ch07;

public class FireEngine extends Car {
	public FireEngine(String kind, int inwon) {
		setKind(kind); setInwon(inwon);
	}
	void printFe(){
		print();
		System.out.println("불끄는 차입니다.");
	}
}
