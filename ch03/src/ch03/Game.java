package ch03;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1~100 사이의 랜덤한 정수
		int ran = (int)(Math.random() * 100) + 1;
		int num = 0, cnt = 0;
		do {
			System.out.println("숫자를 맞춰보세요.");
			num = sc.nextInt();
			if(num > ran) System.out.println("작은 수를 입력하세요.");
			else if(num < ran) System.out.println("큰 수를 입력하세요.");
			cnt++;
		}while(ran != num);
		System.out.printf("%d번에 숫자 %d를 맞췄습니다.", cnt, ran);
		sc.close();
	}
}
