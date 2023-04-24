package ch09;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Gre2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		GregorianCalendar gc = new GregorianCalendar();
		int year = 0;
		do {
			System.out.println("4자리 년도를 입력하세요.");
			year = sc.nextInt();
			if(year==0) break;
			else if (gc.isLeapYear(year)) System.out.println(year+"는 윤년입니다.");
			else System.out.println(year+"는 평년입니다.");
		}while(year != 0);
		System.out.println("프로그램 종료");
		sc.close();
	}
}
