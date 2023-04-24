package ch11;

class ShapeCal {
	int width, height, depth;
	ShapeCal (int w) {
		width=w;
	}
	
	ShapeCal (int w, int h) {
		width=w; height=h;
	}
	
	ShapeCal (int w, int h, int d) {
		width=w; height=h; depth=d;
	}
	
	void calSquare() {
		System.out.println(width*width);
	}
	void calRectangle() {
		System.out.println(width*height);
	}
	void calVolume() {
		System.out.println(width*height*depth);
	}
}

public class ShapeCalEx {
	public static void main(String[] args) {
		ShapeCal sc1 = new ShapeCal(10);
		ShapeCal sc2 = new ShapeCal(10, 15);
		ShapeCal sc3 = new ShapeCal(10, 15, 20);
		
		sc1.calSquare();
		sc2.calRectangle();
		sc3.calVolume();
	}
}
