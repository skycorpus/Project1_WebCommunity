package ch03;

public class Continue1 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("나는 반복한다 : " + i);
			if (i > 3) continue; // 아래 문장을 수행하지 않고 반복문 위로 간다
			System.out.println("나두 : " + i);
		}
	}
}
