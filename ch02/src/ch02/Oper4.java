package ch02;

/*작성자: 손지현
작성일: 2023.02.16
제목: */
public class Oper4 {
	public static void main(String[] args) {
		int i1 = 1000000, i2 = 2000000, i3 = 1000000;
		// int * int 결과가 int 범위를 넘어서서 생기는 문제
		// long i4 = i1 * i2 / i3; // => i4 = -1454 쓰레기값 나옴
		//long i4 = i1 * (i2 / i3); //해결방법 1 : 나눗셈을 먼저 처리한다.
		long i4 = (long) i1 * i2 / i3; //해결방법 2 : 타입을 큰 자료형으로 변환해준다.
		System.out.println("i4 = " + i4);
	}
}
