package ch07;

public class CarEx {
	public static void main(String[] args) {
		Ambulance car1 = new Ambulance("구급차", 8);
		Bus car2 = new Bus("버스", 40);
		FireEngine car3 = new FireEngine("소방차", 12);
		
		car1.printAm(); car2.printBus(); car3.printFe();
	}
}
