package prac0406;

class Point implements Cloneable {
	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public void showPosition() {
		System.out.printf("[%d, %d]",x,y);
		System.out.println();
	}
	public void changePos(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Rectangle implements Cloneable {
	private Point ul;
	private Point lr;
	public Rectangle(Point ul, Point lr) {
		super();
		this.ul = ul;
		this.lr = lr;
	}
	public Rectangle(int x1, int y1, int x2, int y2) {
		ul=new Point(x1, y1);
		lr=new Point(x2, y2);
	}
	public void changePos(int x1, int y1, int x2, int y2) {
		ul.changePos(x1, y1);
		lr.changePos(x2, y2);
	}
//	@Override
//	public Object clone() throws CloneNotSupportedException {
//		return super.clone(); // 얉은 복사용
//	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		Rectangle copy = (Rectangle)super.clone();
		copy.ul=(Point)ul.clone();//깊은 복사를 위해 객체 안의 객체에 대해 다시 클론.
		copy.lr=(Point)lr.clone();//깊은 복사를 위해 객체 안의 객체에 대해 다시 클론.
		return copy; 
	}
	public void showPosition() {
		System.out.printf("좌상단");
		ul.showPosition();
		System.out.printf("우하단");
		lr.showPosition();
	}
}

public class InstanceCloning {
	public static void main(String[] args) {
		/*Point org = new Point(3,5);
		Point cpy;
		try {
			cpy=(Point)org.clone();
			org.showPosition();
			cpy.showPosition();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}*/
		
		Rectangle org=new Rectangle(1,1,9,9);
		Rectangle cpy;
		try {
			cpy=(Rectangle)org.clone();
			org.changePos(2, 2, 7, 7);
			org.showPosition();
			cpy.showPosition();
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
