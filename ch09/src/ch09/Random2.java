package ch09;

import java.util.Random;

public class Random2 {
	public static void main(String[] args) {
		int[] number = new int[100]; //0 ~ 9 정수 100개 
		int[] count = new int[10];
		Random ran = new Random();
		for(int i=0; i<number.length; i++) {
			number[i] = ran.nextInt(10); //0 ~ 9까지 정수 num[i]배열에 입력
			System.out.print(number[i]+" "); //출력 후에 한 칸 띔
			if(i % 10 == 9) System.out.println(); //10개 출력 후에 줄바꿈 
		}
		System.out.println();
		
		for(int i=0; i<number.length; i++) {
			count[number[i]]++; //number[i]가 들어있는 count 인덱스에 1증가
		}
		for(int i=0; i<count.length; i++) {
			String str = printGragh('#', count[i]);
			System.out.println(i+"이 갯수 : "+str+" "+count[i]);
		}
	}

	private static String printGragh(char c, int value) {
		char[] bar = new char[value];
		for(int i=0; i<bar.length; i++) { //숫자만큼 #으로 문자열 채움.
			bar[i] = c;
		}
		return new String(bar);
	}
}