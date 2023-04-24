package ch11;

class ShapeCalEx {
	int width, height, depth;
	ShapeCalEx (int w) {
		width=w;
	}
	
	ShapeCalEx (int w, int h) {
		width=w; height=h;
	}
	
	ShapeCalEx (int w, int h, int d) {
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

public class ShapeCal {
	public static void main(String[] args) {
		ShapeCalEx sc1 = new ShapeCalEx(10);
		ShapeCalEx sc2 = new ShapeCalEx(10, 15);
		ShapeCalEx sc3 = new ShapeCalEx(10, 15, 20);
		
		sc1.calSquare();
		sc2.calRectangle();
		sc3.calVolume();
	}
}
