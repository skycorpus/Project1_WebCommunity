package ch11;

import java.util.Arrays;

public class test {
	public static void main(String[] args) {
		/*
		 * int a[] = new a[3]; a[0]=10; a[1]=15; a[2]=34;
		 * 
		 * System.out.println(Arrays.toString(a));
		 */
		int  = 0;
		int money = 498000;
		int[] coinUnit = {50000,10000,5000,1000};
		for(int i=0; i<coinUnit.length; i++) {
			System.out.printf("%d원짜리 %d개\n", coinUnit[i], money/coinUnit[i]);
			money %= coinUnit[i];
			System.out.println(money);
		}
	}
}
