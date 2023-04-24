package ch02;

//Ctrl +shift + f : 자동정렬
/*작성자 : 손지현
작성일 : 2023.02.15*/
public class Area {
	public static void main(String[] args) {
		double pi = 3.141592;
		int r1 = 5;
		// 실수와 정수를 연산한 결과는 값이 큰 쪽이 출력됨.
		double area = pi * r1 * r1;
		System.out.println("원의 면적: " + area);
	}
}
