package ch09;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class SimpleDate2 {								//달력의 범위는 0~11
	public static void main(String[] args) {            //2는 3월
		GregorianCalendar gc = new GregorianCalendar(2023,2,3,1,30,20);
		//gc.isLeapYear(year); //True False
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yy-MM-dd HH:dd:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("(E)yyyy/MM/dd (a)hh:mm:ss");
		
		Date date = gc.getTime();
		System.out.println(sdf1.format(date));
		System.out.println(sdf2.format(date));
	}
}
