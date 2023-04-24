package ch07;

public class Ambulance extends Car{
	public Ambulance(String kind, int inwon) {
		setKind(kind); setInwon(inwon);
	}
	void printAm() {
		print();
		System.out.println("환자를 싣고 달린다.");
	}
}
