package ch08;

public class Shape2Ex {
	public static void main(String[] args) {
		Shape2[] sh = new Shape2[3];
		sh[0] = new Rectangle2();
		sh[1] = new Triangle2();
		sh[2] = new Circle2();
		
		for(Shape2 s:sh) {
			s.disp();
			s.drive();
		}
	}
}
