package ch02;

/*작성자: 
작성일: 2023.02.16
제목: */
public class Ex02 {
	public static void main(String[] args) {
		int num = 456;
		// 456/100 => 4(int/int=>int) * 100 => 400
		// num을 float로 형변환 하거나
		// 곱하기를 먼저 실행한 후 나누기를 먼저 실행한다.
		System.out.println(num / 100 * 100);
		System.out.println(num * 100 / 100);
		System.out.println((int) ((float) num / 100 * 100));
	}
}


