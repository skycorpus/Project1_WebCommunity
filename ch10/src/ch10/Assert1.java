package ch10;

import java.util.Scanner;

public class Assert1 {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("점수를 입력하세요.");
			num = sc.nextInt();
			//Run configuration에 vm에 -ea를 입력하고 실행해야 한다.
			//조건에 맞지않으면 예외발생
			assert(num <= 100 && num >= 0) : "잘못된 점수입니다.";
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");
		sc.close();
	}
}
