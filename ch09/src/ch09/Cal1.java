package ch09;

import java.util.*;

public class Cal1 {
	public static void main(String[] args) {
		//추상클래스(객체생성x)면서 생성자가 protected //getInstance를 통해 객체 생성
		Calendar cal = Calendar.getInstance(); //new Calendar();
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n", cal.get(Calendar.YEAR), 
				cal.get(Calendar.MONTH)+1, cal.get(Calendar.DATE));
		//월은 0부터 시작하여 11이 끝
		
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH)); //n월 중에 몇 번째날
		System.out.println(cal.get(Calendar.DAY_OF_YEAR)); //1년 중에 몇 번째날
		Date date = new Date();
		System.out.println(date);
	}
}
