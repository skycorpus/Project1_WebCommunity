package ch02;

/*작성자: 손지현
  작성일: 2023.02.16
  제목: 홀수 짝수 판별 문제*/
public class Tri1 {
	public static void main(String[] args) {
		int i1 = 8;
		String s1 = i1 % 2 == 0?"짝수":"홀수";
		System.out.println(s1);
	}
}
