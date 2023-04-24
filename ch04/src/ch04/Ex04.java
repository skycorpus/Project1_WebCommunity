package ch04;

import java.util.Scanner;

// Scanner를 이용하여 4자리 정수를 받고 year
// 윤년(400으로 나누어 떨어짐) 또는 평년(4로 나누어 떨어지고 100으로 나누어 안 떨어짐) 출력

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		do {
			System.out.println("4자리 연도를 입력하세요.");
			year = sc.nextInt();
			// &&가 ||보다 우선순위가 높다
			if (year == 0) break; //0을 입력하면 프로그램 종료
			else if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
				System.out.println(year+"는 윤년입니다.");
			else System.out.println(year+"는 평년입니다.");
		}while(true);
		System.out.println("프로그램 종료");
		sc.close();
	}
}
