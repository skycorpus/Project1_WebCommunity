package prac;

class Rectangle {
	private int ulx=0, uly=0;
	private int lrx=0, lry=0;
	
	private boolean isProperRange(int pos) {
		if(0 <= pos && pos <= 100)
			return true;
		else 
			return false;
	}
	
	public int getUlx() {
		return ulx;
	}
	
	public void setUlx(int ulx) {
		if(ulx>=this.lrx) {
			System.out.println("잘못된 값");
			return;
		}
		if(isProperRange(ulx))
			this.ulx = ulx;
		else
			System.out.println("잘못된 값");
			//this.ulx = 0;
	}
	public int getUly() {
		return uly;
	}
	public void setUly(int uly) {
		if(uly>=this.lry) {
			System.out.println("잘못된 값");
			return;
		}
		if(isProperRange(uly))
			this.uly = uly;
		else
			System.out.println("잘못된 값");
		    //this.uly = 0;
	}
	
	public int getLrx() {
		return lrx;
	}
	
	public void setLrx(int lrx) {
		if(lrx<=this.ulx) {
			System.out.println("잘못된 값");
			return;
		}
		if(isProperRange(lrx))
			this.lrx = lrx;
		else
			System.out.println("잘못된 값");
		    //this.lrx = 0;
	}
	
	public int getLry() {
		return lry;
	}
	
	public void setLry(int lry) {
		if(lry<=this.uly) {
			System.out.println("잘못된 값");
			return;
		}
		if(isProperRange(lry))
			this.lry = lry;
		else 
			System.out.println("잘못된 값");
			//this.lry = 0;
	}
	
	public void showArea() {
		int xLen=lrx-ulx;
		int yLen=lry-uly;
		System.out.println("넓이 : "+(xLen*yLen));
	}
}

public class RectangleTest {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.setUly(22);
		rec.setUly(22);
		rec.setLrx(10);
		rec.setLry(10);
		rec.showArea();
	}
}
