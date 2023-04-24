package ch02;

/*작성자: 손지현
작성일: 2023.02.16
제목: */
public class Oper5 {
	public static void main(String[] args) {
		char c1 = 'a';
		//char c2 = (c1 + 1); // 연산시 자료형의 크기가 작아 오류발생
		char c2 = (char) (c1 + 1); // 자료형 변환으로 해결
		char c3 = ++c1;
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("c3 = " + c3);
	}
}
