package ch06;

class A1{
	void prn() {
		System.out.println("대박");
	}
	void add(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d + %d = %d\n", x, y, x-y);
	}
}

public class Method1 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.prn();
		for(int i=0; i<10; i++) {
			int x = (int)(Math.random()*10) + 1;
			int y = (int)(Math.random()*10) + 1;
			a1.add(x,  y);
		}
	}
}
