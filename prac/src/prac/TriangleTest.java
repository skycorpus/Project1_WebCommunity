package prac;

class Triangle {
	private double bottom;
	private double height;
	
	public Triangle(double bottom, double height) {
		super();
		this.bottom = bottom;
		this.height = height;
	}
	
	public void setBottom(double bottom) {
		if(bottom <= 0) {
			bottom = 1;
			return;
		}
		this.bottom = bottom;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return bottom * height / 2;
	}
}

public class TriangleTest {
	public static void main(String[] args) {
		Triangle tr = new Triangle(10.2, 17.3);
		tr.setBottom(5);
		tr.setHeight(6);
		System.out.println("삼각형의 넓이: " + tr.getArea());
	}
}
