package ch08;

public class Person{
	int leg = 2;
	void move() {
		System.out.println("두 다리로 걷는다.");
	}
	public static void main(String[] args) {
		Mermaid m = new Mermaid();
		m.move(); m.swim();
		System.out.println("다리갯수 : "+m.leg);
	}
}

interface Fish{
	void swim();
}

class Mermaid extends Person implements Fish{ //다중상속은 안됨. 그래서 Person은 상속, Fish는 구현.
	public void swim() {
		System.out.println("물 속에서 헤엄친다.");
	}
}

interface Bird{
	void eat();
}
