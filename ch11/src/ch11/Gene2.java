package ch11;

import java.util.ArrayList;

public class Gene2 {
	public static void main(String[] args) {
		// < >안에 String뿐만 아니라 클래스인 Car도 넣을 수 있음. 
		ArrayList<Car> list = new ArrayList<>();
		
		//Generics에 클래스나 인터페이스 이름이 들어가면 그 클래스 또는 상속받거나 구현한 클래스만 이용 가능.
		list.add(new Bus()); list.add(new Ambulance());
		list.add(new FireEngine());
		//상속받지 않은 Taxi 클래스는 에러남.
		//list.add(new Taxi()); 
		
		//print method 사용, Bus인 경우 move에서도 실행.
		for(Car car:list) {
			car.print();
			if (car instanceof Bus) //instanceof 형변환
			((Bus) car).move();
		}
	}
}
