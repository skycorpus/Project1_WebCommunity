package ch08;

public class CarEx {
	public static void main(String[] args) {
		Car[] cars = {new Taxi(), new FireEngine(), new Bus()};
		for(Car car:cars) {
			car.drive();
			if(car instanceof FireEngine) {
				((FireEngine)car).fire(); //downcasting
			}
		}
	}
}
