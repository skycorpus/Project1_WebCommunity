package ch08;

public class Shape {
	void draw() {
		System.out.println("그린다.");
	}
}

class Rectangle extends Shape{
	public void draw() {
		System.out.println("사각형을 그린다.");
	}
}
class Triangle extends Shape{
	void draw() {
		System.out.println("삼각형을 그린다.");
	}
}
class Circle extends Shape{
	void draw() {
		System.out.println("원을 그린다.");
	}
}

