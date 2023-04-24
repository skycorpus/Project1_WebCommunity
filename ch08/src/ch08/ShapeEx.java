package ch08;

public class ShapeEx {
	public static void main(String[] args) {
		Shape[] sh = new Shape[3];
		sh[0] = new Rectangle();
		sh[1] = new Triangle();
		sh[2] = new Circle();
		//draw()라는 메서드를 원/사각형/삼각형 그린다로 다양하게 표현하는 것을 다형성이라고 한다.
		for(int i=0; i<sh.length; i++) {
			sh[i].draw();
		}
	}
}
