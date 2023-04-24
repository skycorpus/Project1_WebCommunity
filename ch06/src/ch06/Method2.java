package ch06;

public class Method2 {
	static void cal(int x, int y) { //%d는 정수
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
	}
	static void cal(double x, double y) { //%f는 실수, 변수명은 중요하지 않음. 데이터형 중요.
		System.out.printf("%f + %f = %f\n", x, y, x+y);
		System.out.printf("%f * %f = %f\n", x, y, x*y);
	}
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			int x = (int)(Math.random()*10) + 1;
			int y = (int)(Math.random()*10) + 1;
			cal(x,  y); //사용하려는 클래스명과 main으로 실행하는 클래스명이 일치할 때는 클래스명 생략 가능
			
			double a = (int)(Math.random()*10) + 1;
			double b = (int)(Math.random()*10) + 1;
			cal(a,  b); //전달되는 것은 변수명이 아니라 값.
		}
	}
}
