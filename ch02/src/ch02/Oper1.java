package ch02;

/*작성자: 손지현
  작성일: 2023.02.16
  제목: 아스키코드 연산*/
public class Oper1 {
	public static void main(String[] args) {
		char c1 = 'a'; // 97
		char c2 = (char) (c1 + 1); // 98 => unicode 98이 b
		int i1 = c1 + 1;
		int i2 = 'k' - 'j'; // 간격1
		// 연산자를 만나면 문자가 숫자로 변경되어 연산
		int i3 = 10 - '0'; // '0'이 48, 10 - 38 => -38

		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
	}
}
