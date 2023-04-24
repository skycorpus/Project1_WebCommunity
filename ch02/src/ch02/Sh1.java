package ch02;
/*작성자: 손지현
  작성일: 2023.02.16
  제목: 시프트 연산자*/

public class Sh1 {
	public static void main(String[] args) {
		int num = 15;
		// 15 * 2 * 2 = 15 * 4 = 60
		System.out.println("num << 2 = " + (num << 2));
		// 15 / 2 / 2 = 15 / 4 = 3
		System.out.println("num >> 2 = " + (num >> 2));
	}
}
//시프트 연산자를 사용하면 곱셈 편하게 가능
// 15 => 0000 0000 0000 1111
// 60 => 0000 0000 0011 1100 앞으로 두 칸 이동, 속도 빠름.
//  3 => 0000 0000 0000 0011 뒤로 두 칸 이동.