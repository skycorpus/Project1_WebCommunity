package ch05;

public class CircleEx {
	public static void main(String[] args) {
		final double PI = 3.14f;
		//PI = 5.76f;//final 변수는 수정불가. 대문자 사용/
		int r = 10;
		double area = PI * r * r;
		double round = 2 * PI * r;
		System.out.println("원의 넓이 : "+area);
		System.out.println("원의 둘레 : "+round);
	}
}
