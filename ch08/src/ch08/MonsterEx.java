package ch08;

class Monster extends Person implements Fish, Bird{ //복수 구현 가능. 
	//인터페이스는 구현부가 없으므로 구현부를 만들 때 모순이 되지않게 작성해야 한다.
	public void eat() {
		System.out.println("부리로 쪼아 먹는다.");
	}
	public void swim() {
		System.out.println("지느러미로 헤엄친다.");
	}
}

public class MonsterEx {
	public static void main(String[] args) {
		Monster mt = new Monster();
		mt.eat();mt.swim();mt.move();
	}
}
