package ch09;

import java.util.GregorianCalendar;

public class Gre1 {
	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n", gc.get(GregorianCalendar.YEAR),
				gc.get(GregorianCalendar.MONTH)+1, gc.get(GregorianCalendar.DATE));
		//2023년 5월 28일
		GregorianCalendar gc2 = new GregorianCalendar(2023, 4, 28);
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n", gc2.get(GregorianCalendar.YEAR),
				gc2.get(GregorianCalendar.MONTH)+1, gc2.get(GregorianCalendar.DATE));
		//생일 출력
		GregorianCalendar gc3 = new GregorianCalendar(1855, 10, 10);
		System.out.printf("생일은 %d년 %d월 %d일 입니다.\n", gc3.get(GregorianCalendar.YEAR),
				gc3.get(GregorianCalendar.MONTH)+1, gc3.get(GregorianCalendar.DATE));
	}
}
