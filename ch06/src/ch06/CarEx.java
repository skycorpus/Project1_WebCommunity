package ch06;

class Car{
	String kind;
	int displacement;
	String color;
	
	
	public Car(String kind, int displacement, String color) { 
		 this.kind = kind; this.displacement = displacement; this.color = color; 
	}	
	/*
	 * public Car(String k, int d, String c) { kind = k; displacement = d; color =c;
	 * }
	 */
	 
	void print() {
		System.out.println("==================");
		System.out.println("종류 : "+kind);
		System.out.println("배기량 : "+displacement);
		System.out.println("색깔 : "+color);
	}
}
public class CarEx {
	public static void main(String[] args) {
		Car car1 = new Car("소나타", 1500, "빨강");
		Car car2 = new Car("벤츠", 2000, "노랑");
		Car car3 = new Car("BMW", 2500, "파랑");
		car1.print(); car2.print(); car3.print();
	}
}
