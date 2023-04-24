package ch04;

public class Arr1 {
	public static void main(String[] args) {
		//같은 데이터형의 여러 건을 저장할 때
		//int kim = 70, park = 80, choi 90;
		//int[] score = {70, 80, 90};
		int k1 = 7; //초기화를 하지 않으면 사용할 수 없다.
		//참조형은 생성하면 자동 초기화가 일어난다.
		//정수에는 0, 실수 0.0, 문자 null로 초기화 된다.
		int[] i1; //선언
		i1 = new int[5]; //생성
		int[] i2 = new int[5]; //선언과 생성
		System.out.println(k1);
		System.out.println(i1[1]);
		System.out.println(i2[0]);
		float[] f1 = new float[6];
		System.out.println(f1[4]);
	}
}
