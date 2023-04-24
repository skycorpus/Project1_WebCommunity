package ch06;

//메서드 중간에 끊기
public class Return2 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			int x = (int)(Math.random() * 10);
			int y = (int)(Math.random() * 10);
			cal(x, y);
		}
	}
	private static void cal(int x, int y) { // private
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d - %d = %d\n", x, y, x-y);
		if (y==0) {
			System.out.println("여기까지 하고 종료.");
			return; //return 메서드 종료.
		}else System.out.printf("%d / %d = %d\n", x, y, x/y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
	}
}
