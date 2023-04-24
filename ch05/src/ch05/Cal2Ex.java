package ch05;

public class Cal2Ex {
	int x, y, sum; //속성변수
	Box box1;      //참조변수
	void sum() {
		System.out.println("x = "+x+", y = "+y+", 합계 : "+(x+y));
	}
	public static void main(String[] args) {
		//같은 클래스 내에 있더라도 객체를 생성해야 사용가능하다.
		Cal2Ex c1 = new Cal2Ex(); c1.x=10; c1.y=20;
		Cal2Ex c2 = new Cal2Ex(); c2.x=12; c2.y=7;
		c1.sum();
		c2.sum();
	}
}
