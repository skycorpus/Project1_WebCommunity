package ch03;

public class Break2 {
	public static void main(String[] args) {
		k : for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println("대박" + j);
				if (j > 4) break; // 안쪽 for문만 종료, 하나만 종료
				if (j > 4) break k; // label k에 해당하는 반복문 종료
			}
			System.out.println("사건: " + i + "\n");
		}
	}
}
